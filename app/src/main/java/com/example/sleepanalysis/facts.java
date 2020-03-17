package com.example.sleepanalysis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;

public class facts extends AppCompatActivity {
    ScrollView scrollView;
    ListView listView;
    ListAdapter listAdapter;
    List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);


        listView = findViewById(R.id.listView);
        list=new ArrayList<>();

        list.add("The record for the longest period without sleep is 11 days");
        list.add("Humans spend 1/3 of their life sleeping.");
        list.add("Sleep deprivation will kill you more quickly than food deprivation.");
        list.add("12% of people dream entirely in black and white.");
        list.add("Pain tolerance is reduced by sleep deprivation.");
        list.add("Sleep experts have discovered a direct link between people’s favourite sleeping positions and their personalities.");
        list.add("Sleep is just as important as diet and exercise.");
        list.add("The average person falls asleep in seven minutes.");
        list.add("If it takes you less than five minutes to fall asleep, it’s likely that you’re sleep deprived.");
        list.add("Insomnia is the most common sleep disorder.");
        list.add("Women sleep more than men.The reason for this is women are more likely to multitask, meaning their brains work harder and therefore take longer to recover.");
        list.add("More than half of Americans lose sleep due to stress or anxiety.");
        list.add("Getting less than 7 hours sleep each night can make you angry, sad and stressed.");
        list.add("One sleepless night affects your brain in the same way as being drunk.");
        list.add("Research shows a lack of sleep can cause weight gain.");
        list.add("Morning people’ are more likely to be successful in their careers.");
        list.add("Adults who sleep for less than 7 hours a night are more likely to report suffering from asthma, cancer and diabetes.");
        list.add("More and more companies in Japan are encouraging their staff to sleep on the job as they believe it improves productivity");
        list.add("The perfect nap, according to NASA, lasts for 26 minutes.");



        listAdapter=new ArrayAdapter<String>(this,R.layout.list_item,list);
        listView.setAdapter(listAdapter);

    }

}
