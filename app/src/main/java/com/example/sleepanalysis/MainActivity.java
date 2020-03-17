package com.example.sleepanalysis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button startButton;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton =  findViewById(R.id.StartButton);
        imageView  = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo);

    }

    public void onButtonclick(View view) {
        Intent i = new Intent(MainActivity.this, homeScreen.class);
        startActivity(i);
    }


}
