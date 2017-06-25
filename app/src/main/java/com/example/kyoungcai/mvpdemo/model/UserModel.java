package com.example.kyoungcai.mvpdemo.model;

import com.example.kyoungcai.mvpdemo.bean.UserBean;

/**
 * Created by KyoungCai on 2017/6/3.
 */

public class UserModel implements IUserModel {
    @Override
    public void setName(String name) {

        //储存名字 写入
    }

    @Override
    public void setSex(String sex) {

        //储存性别 写入
    }

    @Override
    public UserBean load(String name) {
        //从数据苦中获得数据
        return null;
    }
}
