package com.lpx.administrator.ddyc6.application;

import android.app.Application;
import android.content.SharedPreferences;

/**
 * application
 */
public class BaseApplication extends Application {

    public static boolean isLogin = false;
    public static String username;
    public static String password;

    @Override
    public void onCreate() {
        super.onCreate();
        isLogin = getLoginInfo();
    }

    /***
     * 得到是否已经登陆
     * @return 是否登录
     */
    private boolean getLoginInfo() {

        SharedPreferences sharePref = getSharedPreferences("loginInfo",MODE_PRIVATE);
        if(sharePref!=null){
            boolean flag = sharePref.getBoolean("isLogin",false);
            if (flag){
                username = sharePref.getString("username","");
                password = sharePref.getString("password","");
                return flag;
            }
        }
        return false;
    }


}
