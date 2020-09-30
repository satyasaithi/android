package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
    EditText et;
    Button cam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                et=findViewById(R.id.edittext);
                String msg=et.getText().toString();
                Intent i=new Intent(MainActivity.this,second.class);
                i.putExtra("gopal",msg);
                startActivity(i);
            }
        });
        findViewById(R.id.call).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                String phnum = et.getText().toString();
                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:" + phnum));
                startActivity(call);
            }

        });
        cam = findViewById(R.id.camera);
        cam.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Intent c = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(c);
            }
        });
    }

}