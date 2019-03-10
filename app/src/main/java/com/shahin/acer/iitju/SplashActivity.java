package com.shahin.acer.iitju;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {
    ProgressBar progressBar;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_splash);
        progressBar=findViewById(R.id.progress);
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                dowork();
                newact();
            }
        });

        thread.start();
    }
    public void dowork(){
        for(i=0;i<=100;i=i+25) {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void newact(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
