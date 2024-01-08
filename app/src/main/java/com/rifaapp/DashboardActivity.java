package com.rifaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.rifaapp.fragment.ViewPagerActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Find all CardView elements
        CardView helloCard = findViewById(R.id.HelloCard);
        CardView fibonacciCard = findViewById(R.id.FibonacciCard);
        CardView newsCard = findViewById(R.id.NewsCard);
        CardView chatCard = findViewById(R.id.ChatCard);
        CardView alarmCard = findViewById(R.id.AlarmCard);
        CardView mapsCard = findViewById(R.id.MapsCard);
        CardView countCard = findViewById(R.id.CountCard);
        CardView fragmentCard = findViewById(R.id.FragmentCard);


        // Set click actions for each CardView
        helloCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, HelloActivity.class);
                startActivity(intent);
            }
        });

        fibonacciCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, FibonacciActivity.class);
                startActivity(intent);
            }
        });

        newsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ScrollingIcecold.class);
                startActivity(intent);
            }
        });

        chatCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, OneActivity.class);
                startActivity(intent);
            }
        });

        alarmCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, AlarmActivity.class);
                startActivity(intent);
            }
        });

        mapsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });

        fragmentCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ViewPagerActivity.class);
                startActivity(intent);
            }
        });

        countCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}