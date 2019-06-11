package com.example.myapplication.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.myapplication.R;

import java.util.Timer;
import java.util.TimerTask;

//延迟3秒
//跳转页面
public class WelcomeActivity extends BaseActivity {

    private Timer mTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        init();
    }
    private void init()
    {
        mTimer= new Timer();
        mTimer.schedule(new TimerTask() {
            @Override
            public void run() {
               // Log.e("welcomeActivity","dangqiansisadsa"+Thread.currentThread());
                toLogin();
            }
        },3*1000);
    }

    /**
     * 跳转到Loginactivity
     */
    private void toLogin()
    {
        Intent intent =new Intent(this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
    /**
     * 跳转到mainactivity
     */
    private void toMain()
    {
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
