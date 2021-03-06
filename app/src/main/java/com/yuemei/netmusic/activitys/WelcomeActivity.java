package com.yuemei.netmusic.activitys;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.yuemei.netmusic.R;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomeActivity extends BaseActivity {
    private Timer mTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
    }

    /**
     * 初始化
     */
    private void init(){
        mTimer = new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
//                Log.e("WelcomeActivity","当前线程 :" + Thread.currentThread());
//                toMain();
                toLogin();
            }
        },3*1000);
    }

    /**
     * 跳转到mainActivity
     */
    private void toMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    /**
     * 跳转到loginActivity
     */
    private void toLogin(){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}