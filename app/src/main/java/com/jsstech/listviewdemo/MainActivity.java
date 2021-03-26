package com.jsstech.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ListView lview;
String listlength[]={"Bsc","C.S","Science","Commerce","Polytechnic","Engineering"};
ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lview=findViewById(R.id.listview);

        adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listlength);
        lview.setAdapter(adapter);

        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,View view,int position,long id) {
                Toast.makeText(MainActivity.this,"You are selected   " +listlength[position],Toast.LENGTH_LONG).show();
            }
        });
    }
}