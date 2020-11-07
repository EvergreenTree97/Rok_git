package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler timer = new Handler();
        timer.postDelayed(new Runnable(){
                   public void run(){
                  Intent intent = new Intent(MainActivity.this, NextActivity.class);
                  startActivity(intent);
                  overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                  finish();
            }
        }, 2000);

    }
}