package com.example.sleepanalysis;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class UnableToSleep extends AppCompatActivity {
    ScrollView scrollView;
    ListView listView;
    ListAdapter listAdapter;
    List<String>list;
    MediaPlayer mediaPlayer;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unable_to_sleep);


        listView = findViewById(R.id.listView);
        list=new ArrayList<>();
        listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(listAdapter);

        Field[] field = R.raw.class.getFields();

        for (int  i=0; i<field.length; i++){

            list.add(field[i].getName());
        }

        list.remove(0);
        list.remove(0);


       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (mediaPlayer != null)
               {
                   mediaPlayer.release();
               }

               int resid = getResources().getIdentifier(list.get(position), "raw", getPackageName());
               mediaPlayer = (MediaPlayer) mediaPlayer.create(UnableToSleep.this,resid);
               mediaPlayer.start();
           }
       });




    }
    public void onPause() {
        super.onPause();
        if (mediaPlayer != null)
            mediaPlayer.release();

    }
    }
