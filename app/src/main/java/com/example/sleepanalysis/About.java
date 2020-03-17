package com.example.sleepanalysis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView txtDetails = findViewById(R.id.textView);
        txtDetails.setText("\t\t\t\t\t\t\t\t\t ABOUT \t\t\t\t\t\t\n Sleep deprivation is a root cause of many problems that shows up almost every day fatigue, learning and concentration difficulties, and accidents. Everyone can be affected by sleep deprivation, especially children.Why? Because there are a lot of things that capture their attention nowadays. They get caught up with most of these and forget to log a full length of sleep.Sleep is as important to the human body as food and water, but many of us don’t get enough sleep. Insufficient sleep, inadequate quality of sleep or disruptions to the sleep-wake cycle has very unhealthy consequences on how we function.So Sleep Well Live Well....\"\n" +
                        "        ");
        txtDetails.setMovementMethod(new ScrollingMovementMethod());
    }
}
