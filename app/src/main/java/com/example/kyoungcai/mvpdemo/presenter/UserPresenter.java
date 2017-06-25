package com.example.kyoungcai.mvpdemo.presenter;

import com.example.kyoungcai.mvpdemo.bean.UserBean;
import com.example.kyoungcai.mvpdemo.model.IUserModel;
import com.example.kyoungcai.mvpdemo.model.UserModel;
import com.example.kyoungcai.mvpdemo.view.IUserView;

/**
 * Created by KyoungCai on 2017/6/3.
 */

public class UserPresenter {

    private IUserModel userModel;
    private IUserView userView;


    public UserPresenter(IUserView userView){
        this.userView=userView;
        this.userModel=new UserModel();
    }

    public UserPresenter(IUserView userView,IUserModel userModel){
        this.userView=userView;
        this.userModel=userModel;
    }


    /**
     * 业务逻辑一
     * @param name
     * @param sex
     */
    public void saveUser(String name,String sex){
        userModel.setName(name);
        userModel.setSex(sex);
    }

    public void loadUser(String name){
        UserBean userBean = userModel.load(name);
        //更新界面
        userView.setName(userBean.getName());
        userView.setSex(userBean.getSex());
    }

}
