package com.shahin.acer.iitju;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        exit=findViewById(R.id.exit);
    }

    public void b1(View view) {
        Intent intent=new Intent(MainActivity.this,List.class);
        intent.putExtra("male","Teacher");
        startActivity(intent);

    }

    public void b2(View view) {
        Intent intent=new Intent(MainActivity.this,StudentForm.class);
        startActivity(intent);
    }
    public void b3(View view) {
        Intent intent=new Intent(MainActivity.this,List.class);
        intent.putExtra("male","staff");
        startActivity(intent);
    }
    public void b4(View view) {
        Intent intent=new Intent(this,TeacherForm.class);
        startActivity(intent);
    }
    public void b5(View view) {
        Intent intent=new Intent(MainActivity.this,Developer.class);
        startActivity(intent);
    }

    public void Exit(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Alert!!");
        builder.setMessage("Do you want to close this app!!!").setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        builder.show();
    }
}
