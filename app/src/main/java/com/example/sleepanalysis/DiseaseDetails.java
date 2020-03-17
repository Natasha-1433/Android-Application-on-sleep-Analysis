package com.example.sleepanalysis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DiseaseDetails extends AppCompatActivity {

    TextView insomnia;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_details);

        insomnia=findViewById(R.id.insomniaText);
        imageView=findViewById(R.id.insomniaImage);

        Intent setDetails =getIntent();
        String Dieseas = setDetails.getStringExtra("key");
        int ImageString =setDetails.getIntExtra("imageKey",0);

        if(ImageString==1) {
            imageView.setImageResource(R.drawable.insomnia_lady);
            insomnia.setText(Dieseas);

        }

        else if(ImageString==2) {
            imageView.setImageResource(R.drawable.apena);
            insomnia.setText(Dieseas);

        }

        else if(ImageString==3) {
            imageView.setImageResource(R.drawable.hypersomnia);
            insomnia.setText(Dieseas);

        }
        else if(ImageString==4) {
            imageView.setImageResource(R.drawable.rls);
            insomnia.setText(Dieseas);

        }

        else if(ImageString==5) {
            imageView.setImageResource(R.drawable.crd);
            insomnia.setText(Dieseas);

        }
        else if(ImageString==6) {
            imageView.setImageResource(R.drawable.sleepwalking);
            insomnia.setText(Dieseas);

        }



    }
}
