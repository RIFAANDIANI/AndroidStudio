package com.rifaapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Initialize views
        View decorView = getWindow().getDecorView();
        // Hide the status bar
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        // Delayed transition to MenuActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openMenu();
            }
        }, SPLASH_DELAY);
    }

    private void openMenu() {
        Intent intent = new Intent(SplashActivity.this, DashboardActivity.class);
        startActivity(intent);
        finish(); // Close SplashActivity after opening DashboardActivity
    }
}
