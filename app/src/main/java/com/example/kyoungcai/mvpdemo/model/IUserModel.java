package com.example.kyoungcai.mvpdemo.model;

import com.example.kyoungcai.mvpdemo.bean.UserBean;

/**
 * Created by KyoungCai on 2017/6/3.
 */

/**
 * model接口 用于操作数据模型的
 */
public interface IUserModel {
    void setName(String name);
    void setSex(String sex);
    UserBean load(String name);
}
