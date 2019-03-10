package com.shahin.acer.iitju;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class List extends AppCompatActivity {
    ListView listView;
    ArrayList<Value> arrayList;
    MyAdapter adapter;
    String malevalue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView=findViewById(R.id.list);
        malevalue=getIntent().getStringExtra("male");
        //femalevalue= Integer.parseInt(getIntent().getStringExtra("female"));
        if(malevalue.contains("1")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("2")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("3")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("4")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("5")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("6")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("7")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("8")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("9")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("batch1")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("batch2")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("batch3")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("batch4")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("batch5")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("batch6")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("batch7")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("batch8")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("batch9")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("Teacher")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("M. Mesbahuddin Sarker", "01716091920", " sarker@juniv.edu", "Director", R.drawable.mesbah));
            arrayList.add(new Value("K M Akkas Ali", "01712505324", " akkas@juniv.edu", "Associate Professor", R.drawable.akkas));
            arrayList.add(new Value("M. Mesbahuddin Sarker", "01716091920", " sarker@juniv.edu", "Director", R.drawable.mesbah));
            arrayList.add(new Value("M. Mesbahuddin Sarker", "01716091920", " sarker@juniv.edu", "Director", R.drawable.mesbah));
            arrayList.add(new Value("M. Mesbahuddin Sarker", "01716091920", " sarker@juniv.edu", "Director", R.drawable.mesbah));
            arrayList.add(new Value("M. Mesbahuddin Sarker", "01716091920", " sarker@juniv.edu", "Director", R.drawable.mesbah));
            arrayList.add(new Value("M. Mesbahuddin Sarker", "01716091920", " sarker@juniv.edu", "Director", R.drawable.mesbah));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }
        if(malevalue.contains("staff")) {
            arrayList = new ArrayList<>();
            arrayList.add(new Value("Shahin Bashar", "01724557834", "shahinbashar2@gmail.com", "Khulna", R.drawable.rsz_dsc_0457));
            adapter = new MyAdapter(List.this, arrayList);
            listView.setAdapter(adapter);
        }


    }
}
