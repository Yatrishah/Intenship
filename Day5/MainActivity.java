package com.example.basicwidgetday2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,email,mobileno;
    Button submit;
    RadioGroup r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        email=(EditText)findViewById(R.id.Email);
        mobileno=(EditText)findViewById(R.id.mobileno);

        submit=(Button)findViewById(R.id.submit);
       r=(RadioGroup)findViewById(R.id.radio);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String us=username.getText().toString();
                String mail=email.getText().toString();
                String mobile=mobileno.getText().toString();
                Intent intent=new Intent(getApplicationContext(),second.class);
                intent.putExtra("username",us);
                intent.putExtra("Email",mail);
                intent.putExtra("mobile",mobile);
                startActivity(intent);

            }
        });

    }
}