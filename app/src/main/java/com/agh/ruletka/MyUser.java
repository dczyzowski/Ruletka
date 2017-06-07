package com.agh.ruletka;

/**
 * Created by Damian on 2017-06-07.
 */

public class MyUser {

    String mName;
    int mMoney;
    int iloscLosowan;

    MyUser(){

    }

    MyUser(String name, int money){
        mName = name;
        mMoney = money;
        iloscLosowan = 0;
    }

    MyUser(String name){
        mName = name;
        mMoney = 200;
        iloscLosowan = 0;
    }

    public int getMoney() {
        return mMoney;
    }

    public int getIloscLosowan() {
        return iloscLosowan;
    }

    public String getName() {
        return mName;
    }

    public void putMoney(int addMoney){
        mMoney += addMoney;
    }

    public void addIloscLosowan(){
        iloscLosowan++;
    }
}
