package com.example.cyptotracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ArrayList<CardItem> list = new ArrayList<>();
        list.add(new CardItem(R.drawable.btc,"BTC","Bitcoin","57,097.00 $","+1.23%"));
        list.add(new CardItem(R.drawable.bch,"BCH","Bitcoin Cash","240.47$","-0.23%"));
        list.add(new CardItem(R.drawable.bnb,"BNB","Binance Coin","0.0000023$","-9.3%"));
        list.add(new CardItem(R.drawable.eth,"ETH","Ethereum","0.00000000005$","-1.23%"));
        list.add(new CardItem(R.drawable.xrg,"XRP","XRP","23,232.60$","1.23%"));
        list.add(new CardItem(R.drawable.usdt,"USDT","Tether","42,86,939.61$","+1.23%"));
        list.add(new CardItem(R.drawable.lch,"LTC","Litecoin","42,86,939.61$","+1.23%"));
        list.add(new CardItem(R.drawable.google,"GoG","Google","42,86,939.61$","-1.23%"));
        list.add(new CardItem(R.drawable.btc,"BTC","Bitcoin","57,097.00 $","+1.23%"));
        list.add(new CardItem(R.drawable.bch,"BCH","Bitcoin Cash","240.47$","-0.23%"));
        list.add(new CardItem(R.drawable.bnb,"BNB","Binance Coin","0.0000023$","-9.3%"));
        list.add(new CardItem(R.drawable.eth,"ETH","Ethereum","0.00000000005$","-1.23%"));
        list.add(new CardItem(R.drawable.xrg,"XRP","XRP","23,232.60$","1.23%"));
        list.add(new CardItem(R.drawable.usdt,"USDT","Tether","42,86,939.61$","+1.23%"));
        list.add(new CardItem(R.drawable.lch,"LTC","Litecoin","42,86,939.61$","+1.23%"));
        list.add(new CardItem(R.drawable.google,"GoG","Google","42,86,939.61$","-1.23%"));


        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new CardAdapter(list);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}