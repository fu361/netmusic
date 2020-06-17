package com.yuemei.netmusic.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.yuemei.netmusic.R;

// NavigationBar
public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    /**
     * 初始化View
     */
    public void initView(){
        initNavBar(false,"登录",false);
    }

    /**
     * 跳转注册页面点击事件
     */
    public void onRegisterClick(View v){

    }
}