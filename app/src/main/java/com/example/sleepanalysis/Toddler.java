package com.example.sleepanalysis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import static com.example.sleepanalysis.R.string.toddlersInfo;

public class Toddler extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toddler);

        Intent i=getIntent();
        String s=i.getStringExtra("key");
         textView = findViewById(R.id.text);
         textView.setText(s);




    }
}
