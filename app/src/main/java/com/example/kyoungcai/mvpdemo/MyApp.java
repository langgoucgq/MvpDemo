package com.example.kyoungcai.mvpdemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by KyoungCai on 2017/6/24.
 */

public class MyApp extends Application {

    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
