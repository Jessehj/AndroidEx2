package com.slogup.jesse.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.slogup.jesse.geoquiz.activity.QuizActivity;

public class SplashActivity extends Activity {

    int SPLASH_TIME = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                overridePendingTransition(0, android.R.anim.fade_in);

                startActivity(new Intent(SplashActivity.this, QuizActivity.class));
                finish();
            }
        }, SPLASH_TIME);
    }

}
