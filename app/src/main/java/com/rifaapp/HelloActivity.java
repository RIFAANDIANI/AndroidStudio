package com.rifaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.rifaapp.R; // Sesuaikan dengan paket aplikasi Anda

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }

    // Override method onCreateOptionsMenu untuk membuat menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    // Override method onOptionsItemSelected untuk menangani item menu yang dipilih
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.btnProjectHello) {
            startActivity(new Intent(this, HelloActivity.class));
            return true;
        } else if (id == R.id.btnProjectFibonacci) {
            startActivity(new Intent(this, FibonacciActivity.class));
            return true;
        } else if (id == R.id.btnProjectScroller) {
            // Gantilah dengan ID yang sesuai untuk proyek ScrollingIcecold
            startActivity(new Intent(this, ScrollingIcecold.class));
            return true;
        } else if (id == R.id.btnProjectSecond) {
            startActivity(new Intent(this, SecondActivity.class));
            return true;
        } else if (id == R.id.btnProjectAlarm) {
            startActivity(new Intent(this, AlarmActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
