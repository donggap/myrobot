package com.danielBR.myrobot;

import android.app.*;
import android.os.*;

public class SplashActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                // TODO Auto-generated method stub
                Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);//��ת��MainActivity
                SplashActivity.this.finish();//����SplashActivity
            }
        }, 3000);//��postDelayed()���������ӳٲ���
    }
}
