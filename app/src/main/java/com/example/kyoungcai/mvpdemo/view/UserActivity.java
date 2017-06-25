package com.example.kyoungcai.mvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kyoungcai.mvpdemo.R;
import com.example.kyoungcai.mvpdemo.presenter.UserPresenter;

public class UserActivity extends AppCompatActivity implements IUserView, View.OnClickListener {

    private UserPresenter presenter;
    private EditText ed_name,ed_sex;
    private Button btn ,btn_query;
    private TextView tv_user;
    private StringBuffer userinfo=new StringBuffer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        presenter=new UserPresenter(this);
        initView();
        initListener();
    }

    private void initListener() {
        btn.setOnClickListener(this);
        btn_query.setOnClickListener(this);
    }

    private void initView() {
        ed_name= (EditText) findViewById(R.id.ed_name);
        ed_sex= (EditText) findViewById(R.id.ed_sex);
        btn= (Button) findViewById(R.id.btn);
        tv_user= (TextView) findViewById(R.id.tv_user);
        btn_query= (Button) findViewById(R.id.btn_query);
    }

    @Override
    public String getName() {
        return ed_name.getText().toString();
    }

    @Override
    public String getSex() {
        return ed_sex.getText().toString();
    }

    @Override
    public void setName(String name) {

        userinfo.append(name);
        tv_user.setText(userinfo.toString());

    }

    @Override
    public void setSex(String sex) {

        userinfo.append(sex);
        tv_user.setText(userinfo.toString());
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btn){
            //储存用户
            presenter.saveUser(getName(),getSex());
        }
        if(v.getId()==R.id.btn_query){
            //查询用户
            presenter.loadUser(getName());
        }

    }
}
