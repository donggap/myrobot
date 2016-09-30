package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.content.*;

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
                SplashActivity.this.startActivity(mainIntent);//jump MainActivity
                SplashActivity.this.finish();//finish SplashActivity
            }
        }, 3000);
    }
}
