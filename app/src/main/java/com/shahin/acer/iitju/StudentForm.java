package com.shahin.acer.iitju;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class StudentForm extends AppCompatActivity {
    Spinner spinner;
    RadioButton r1,r2;
    Button button;
    String s;
    int a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_form);
        spinner=findViewById(R.id.studentspinner);
        r1=findViewById(R.id.male);
        r2=findViewById(R.id.female);
        button=findViewById(R.id.submitstudent);
        s=spinner.getSelectedItem().toString();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=spinner.getSelectedItem().toString();
                if(r1.isChecked() && s.contains("1")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male",s);
                    startActivity(intent);
                }
                if(r1.isChecked() && s.contains("2")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male",s);
                    startActivity(intent);
                }
                if(r1.isChecked() && s.contains("3")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male",s);
                    startActivity(intent);
                }
                if(r1.isChecked() && s.contains("4")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male",s);
                    startActivity(intent);
                }
                if(r1.isChecked() && s.contains("5")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male",s);
                    startActivity(intent);
                }
                if(r1.isChecked() && s.contains("6")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male",s);
                    startActivity(intent);
                }
                if(r1.isChecked() && s.contains("7")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male",s);
                    startActivity(intent);
                }
                if(r1.isChecked() && s.contains("8")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male",s);
                    startActivity(intent);
                }
                if(r1.isChecked() && s.contains("9")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male",s);
                    startActivity(intent);
                }
                if(r2.isChecked() && s.contains("1")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male","batch1");
                    startActivity(intent);
                }
                if(r2.isChecked() && s.contains("2")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male","batch2");
                    startActivity(intent);
                }
                if(r2.isChecked() && s.contains("3")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male","batch3");
                    startActivity(intent);
                }
                if(r2.isChecked() && s.contains("4")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male","batch4");
                    startActivity(intent);
                }
                if(r2.isChecked() && s.contains("5")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male","batch5");
                    startActivity(intent);
                }
                if(r2.isChecked() && s.contains("6")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male","batch6");
                    startActivity(intent);
                }
                if(r2.isChecked() && s.contains("7")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male","batch7");
                    startActivity(intent);
                }
                if(r2.isChecked() && s.contains("8")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male","batch8");
                    startActivity(intent);
                }
                if(r2.isChecked() && s.contains("9")){
                    Intent intent=new Intent(StudentForm.this,List.class);
                    intent.putExtra("male","batch9");
                    startActivity(intent);
                }




            }
        });
    }
}
