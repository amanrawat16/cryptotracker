package com.example.cyptotracker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {
    private  ArrayList<CardItem> mCardList;

    public static class CardViewHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView mCoin;
        public TextView mCoinName;
        public TextView mPrice;
        public TextView mPriceDiff;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView= itemView.findViewById(R.id.coinImg);
            mCoin = itemView.findViewById(R.id.coin);
            mCoinName = itemView.findViewById(R.id.coinName);
            mPrice = itemView.findViewById(R.id.currentPrice);
            mPriceDiff = itemView.findViewById(R.id.priceDiff);
        }
    }

    public CardAdapter(ArrayList<CardItem> cardList){
        mCardList = cardList;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        CardViewHolder cvh = new CardViewHolder(v);
        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        CardItem currentItem = mCardList.get(position);

        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mCoin.setText(currentItem.getCoin());
        holder.mCoinName.setText(currentItem.getCoinName());
        holder.mPrice.setText(currentItem.getCurrentPrice());
        holder.mPriceDiff.setText(currentItem.getPriceDiff());
    }

    @Override
    public int getItemCount() {
        return mCardList.size();
    }
}