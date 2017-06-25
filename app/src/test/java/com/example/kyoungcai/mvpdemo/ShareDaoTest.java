package com.example.kyoungcai.mvpdemo;


import android.content.Context;
import android.os.Build;

import com.example.kyoungcai.mvpdemo.model.ShareDao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import java.util.Random;

/**
 * Created by KyoungCai on 2017/6/24.
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class,manifest = Config.NONE,sdk = Build.VERSION_CODES.JELLY_BEAN,application = MyApp.class)
public class ShareDaoTest {

    ShareDao shareDao;
    @org.junit.Before
    public void setUp() throws Exception {
        String name=new Random().nextInt(1000)+".pref";
        shareDao=new ShareDao(RuntimeEnvironment.application.getSharedPreferences(name, Context.MODE_PRIVATE));

    }

    @Test
    public void testAdd(){
        shareDao.put("key01","haha");
        String value=shareDao.get("key01");
        Assert.assertEquals(value,"haha");
    }

}
