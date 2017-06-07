package com.agh.ruletka;

import android.content.Intent;
import android.support.annotation.ColorRes;
import android.support.annotation.LayoutRes;

public class BetModel {


    //obiekt obstawiania
    int mMoneyBet;
    int mPosition;
    Integer mColor;

    BetModel(int moneyBet, int position){
        mMoneyBet = moneyBet;
        mPosition = position;
        mColor = null;
    }

    BetModel(int moneyBet, int position, @ColorRes Integer color){
        mMoneyBet = moneyBet;
        mPosition = position;
        mColor = color;
    }


    public int getMoneyBet() {
        return mMoneyBet;
    }

    public void addMoneyBet(int betAdd) {
        mMoneyBet += betAdd;
    }

    public int getPosition() {
        return mPosition;
    }

    public Integer getColor() {
        return mColor;
    }
}
