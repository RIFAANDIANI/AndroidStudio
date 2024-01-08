// MenuActivity.java

package com.rifaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onProjectClick(View view) {
        // Handle project click based on the clicked view
        if (view.getId() == R.id.btnProjectHello) {
            startHelloProject(HelloActivity.class);
        } else if (view.getId() == R.id.btnProjectFibonacci) {
            startProject(FibonacciActivity.class);
        } else if (view.getId() == R.id.btnProjectScroller) {
            startProject(ScrollingIcecold.class);
        } else if (view.getId() == R.id.btnProjectSecond) {
            startProject(SecondActivity.class);
        } else if (view.getId() == R.id.btnProjectAlarm) {
            startProject(AlarmActivity.class);
        }else if (view.getId() == R.id.btnProjectMap) {
            startProject(MapActivity.class);
        }else if (view.getId() == R.id.btnProjectFragment) {
            startProject(MapActivity.class);
        }
    }


    private void startProject(Class<?> projectClass) {
        Intent intent = new Intent(MenuActivity.this, projectClass);
        startActivity(intent);
    }

    private void startHelloProject(Class<?> projectClass) {
        // You can add specific logic for the "HelloProject" if needed
        Intent intent = new Intent(MenuActivity.this, projectClass);
        startActivity(intent);
    }
}
