package com.example.kyoungcai.mvpdemo.model;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.kyoungcai.mvpdemo.MyApp;

/**
 * Created by KyoungCai on 2017/6/24.
 */

public class ShareDao {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;


    public ShareDao() {
        this(MyApp.getContext().getSharedPreferences("myshare", Context.MODE_PRIVATE));
    }

    public ShareDao(SharedPreferences sharedPreferences) {
        this.sharedPreferences=sharedPreferences;
        this.editor=sharedPreferences.edit();
    }

    public void put(String key,String value){
        editor.putString(key,value);
        editor.apply();
    }

    public String get(String key){
        return sharedPreferences.getString(key,"");
    }
}
