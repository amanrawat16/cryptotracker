package com.example.cyptotracker;

public class CardItem{
    private int mImageResource;
    private String mCoin;
    private String mCoinName;
    private String mCurrentPrice;
    private String mPriceDiff;

    public CardItem(int imageResource, String coin, String coinName,String currentPrice, String priceDiff){
        mImageResource = imageResource;
        mCoin = coin;
        mCoinName= coinName;
        mCurrentPrice = currentPrice;
        mPriceDiff = priceDiff;

    }

    public int getImageResource(){
        return mImageResource;
    }

    public String getCoin() {
        return mCoin;
    }
    public String getCoinName(){
        return mCoinName;
    }

    public String getCurrentPrice() {
        return mCurrentPrice;
    }

    public String getPriceDiff() {
        return mPriceDiff;
    }
}