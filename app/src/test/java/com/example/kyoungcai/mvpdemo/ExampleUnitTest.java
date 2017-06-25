package com.example.kyoungcai.mvpdemo;

import com.example.kyoungcai.mvpdemo.model.IUserModel;
import com.example.kyoungcai.mvpdemo.presenter.UserPresenter;
import com.example.kyoungcai.mvpdemo.view.IUserView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }


    UserPresenter presenter;

    IUserView userView;

    IUserModel userModel;

    @org.junit.Before
    public void setUp() throws Exception {
        userView= Mockito.mock(IUserView.class);
        userModel=Mockito.mock(IUserModel.class);
        presenter=new UserPresenter(userView,userModel);
    }


    @Test
    public void testSave(){
        presenter.saveUser("11","11");
        Mockito.verify(userModel).setName("11");
//        Mockito.verify(userView).setName("11");
        Mockito.verify(userModel).setSex("11");
    }

}