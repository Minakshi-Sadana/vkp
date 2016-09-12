package com.vkp.android.vidyaapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by HP on 4/16/2016.
 */
public class SplashScreen extends Activity {

    private static int SPLASH_SCRREN_TIME_OUT=4000;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_SCRREN_TIME_OUT);
    }
}
