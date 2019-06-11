package com.example.myapplication.activities;

import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;
import com.example.myapplication.utils.UserUtils;
import com.example.myapplication.views.InputView;

//navigation bar
public class LoginActivity extends BaseActivity {
    private InputView mInputPhone,mInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    /**
     * initialize view
     */
    private void initView()
    {
        initNavBar(false,"login",false);
        mInputPhone=fd(R.id.input_phone);
        mInputPassword=fd(R.id.input_password);
    }
    /**
     * 跳转注册页面点击事件
     */
    public void onRegisterClick(View v)
    {
        Intent intent =new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
    /**
     * 登陆
     */
    public void onCommitClick(View v)
    {
        String phone = mInputPhone.getInputStr();
        String password = mInputPassword.getInputStr();

//        验证用户输入是否合法
       // if (!UserUtils.validateLogin(this, phone, password)) {
        //    return;
       // }

//        跳转到应用主页
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
