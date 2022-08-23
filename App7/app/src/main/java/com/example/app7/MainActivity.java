package com.example.app7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<phone> phone  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone p1 = new phone("S22 Ultra","SAMSUNG",R.drawable.p1);
        phone p2 = new phone("13 Pro","APPLE",R.drawable.p2);
        phone p3 = new phone("13","APPLE",R.drawable.p3);
        phone p4 = new phone("S22","SAMSUNG",R.drawable.p4);
        phone p5 = new phone("S22 Ultra","SAMSUNG",R.drawable.p5);
        phone p6 = new phone("Mi 11","Xiaomi",R.drawable.p6);
        phone p7 = new phone("13","APPLE",R.drawable.p7);
        phone p8 = new phone("Mi 12","Xiaomi",R.drawable.p8);
        phone p9 = new phone("Mi 12","Xiaomi",R.drawable.p9);
        phone p10 = new phone("Abu Lite","NOKIA",R.drawable.p10);

        phone.add(p1);
        phone.add(p2);
        phone.add(p3);
        phone.add(p4);
        phone.add(p5);
        phone.add(p6);
        phone.add(p7);
        phone.add(p8);
        phone.add(p9);
        phone.add(p10);

        phoneAdapter phoneAdapter = new phoneAdapter(this,0,phone);

        ListView listView = findViewById(R.id.ListView);
        listView.setAdapter(phoneAdapter);


    }

}