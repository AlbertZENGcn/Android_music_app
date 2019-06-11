package com.example.myapplication.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;
import com.example.myapplication.R;
import com.example.myapplication.activities.LoginActivity;

public class UserUtils {
    /**
     * 验证用户输入合法性
     */
    public static boolean validateLogin(Context context,String phone,String password)
    {
        if (!RegexUtils.isMobileExact(phone)) {
            Toast.makeText(context, "Invalid phone number", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(context, "Empty password", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    /**
     * logout
     */

    public static void logout(Context context)
    {
        Intent intent= new Intent(context, LoginActivity.class);
        // add intent flag to clear task stack and recreate a new a task stack
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
        //define the 跳转动画
        ((Activity)context).overridePendingTransition(R.anim.open_enter,R.anim.open_exit);

    }

}
