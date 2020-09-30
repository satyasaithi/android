package com.example.myfirstapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView result_textview;
int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result_textview=findViewById(R.id.tv);
        if(savedInstanceState!=null && savedInstanceState.containsKey("Key"))
        {
            c=savedInstanceState.getInt("Key");
            result_textview.setText(String.valueOf(c));
        }
    }
    public void showToast(View v)
    {
        Toast.makeText(this, result_textview.getText(), Toast.LENGTH_SHORT).show();
    }
    public void showCount(View v)
    {
        c++;
        result_textview.setText(String.valueOf(c));
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Key",c);
    }
}