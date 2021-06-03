package com.example.basicwidgetday2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {
TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        Intent intent=getIntent();
        String username=intent.getStringExtra("username");
        String mail=intent.getStringExtra("Email");
        String mobile=intent.getStringExtra("mobile");

        t1.setText(username);
        t2.setText(mail);
        t3.setText(mobile);

    }
}