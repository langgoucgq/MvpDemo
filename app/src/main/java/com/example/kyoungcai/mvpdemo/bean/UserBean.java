package com.example.kyoungcai.mvpdemo.bean;

/**
 * Created by KyoungCai on 2017/6/3.
 */

public class UserBean {
    private String name;
    private String sex;
    private int age;

    public UserBean() {
    }

    public UserBean(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

