package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

RecyclerView recycler;
Myadapter adapter;
String[] titles;
int[] images;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.tv_title);
        recycler=findViewById(R.id.recyc);

        titles=getResources().getStringArray(R.array.titles);
        images=new int[]{
                R.drawable.a,
                R.drawable.b,
                R.drawable.c,
                R.drawable.d,
                R.drawable.e,
                R.drawable.f,
                R.drawable.g,
                R.drawable.h,
                R.drawable.i
        };
        adapter = new Myadapter(this,titles,images);

        recycler.setLayoutManager(new LinearLayoutManager(this));

        recycler.setAdapter(adapter);




    }
}