package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etMobile,etSms;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMobile=findViewById(R.id.etMobile);
        etSms=findViewById(R.id.etMsg);
        button=findViewById(R.id.btnSend);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no=etMobile.getText().toString();
                String msg=etSms.getText().toString();
                SmsManager sms= SmsManager.getDefault();
                sms.sendTextMessage(no,null,msg,null,null);
                Toast.makeText(getApplicationContext(), "Message Sent Successfully!!", Toast.LENGTH_LONG).show();

            }
        });
    }

}