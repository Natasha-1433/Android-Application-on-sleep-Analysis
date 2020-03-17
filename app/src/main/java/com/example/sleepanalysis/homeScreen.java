package com.example.sleepanalysis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeScreen extends AppCompatActivity {

    Button sleepHours,facts,remedies,unableToSleep,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

        about = findViewById(R.id.about);
        sleepHours = findViewById(R.id.sleephours);
        unableToSleep = findViewById(R.id.unableToSleep);
        remedies = findViewById(R.id.SleepDiesease);
        facts = findViewById(R.id.facts);

        facts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(homeScreen.this, facts.class);
                startActivity(i);

            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(homeScreen.this, About.class);
                startActivity(i);
            }
        });


        sleepHours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(homeScreen.this, extra.class);
                startActivity(i);
            }
        });

        unableToSleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(homeScreen.this, UnableToSleep.class);
                startActivity(i);
            }
        });

        remedies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(homeScreen.this, Dieseas.class);
                startActivity(i);

            }
        });
    }

}
