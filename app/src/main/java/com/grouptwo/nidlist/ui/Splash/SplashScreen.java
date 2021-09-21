package com.grouptwo.nidlist.ui.Splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.grouptwo.nidlist.R;
import com.grouptwo.nidlist.ui.List.ListScreen;

public class SplashScreen extends AppCompatActivity {
    static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, ListScreen.class);
                startActivity(intent);
                finish();

            }
        }, SPLASH_TIME_OUT);

    }
}