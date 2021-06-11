package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lv1;
    int[] image= {R.drawable.tastyfood1,R.drawable.tastyfood2,R.drawable.tastyfood3,R.drawable.tastyfood4};




    String[] name={"This is Image 1","This is Image 2","This is Image 3","This is Image 4","This is Image 5","This is Image 6","This is Image 7"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1=findViewById(R.id.lv1);
        MyAdapter myAdapter=new MyAdapter(MainActivity.this,image,name);
        lv1.setAdapter(myAdapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,listview_details.class);
                intent.putExtra("image",image[position]);
                intent.putExtra("name",name[position]);
                startActivity(intent);
            }
        });
    }

}