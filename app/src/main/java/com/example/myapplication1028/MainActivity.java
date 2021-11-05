package com.example.myapplication1028;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.app.Person;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);
        personalinfo[] info = new personalinfo[100];
        info[0] = new personalinfo();
        String[] data = {"Hello", "Good", "Morning"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,
                data );

       // setListAdapter(adapter);




    }
}