package com.rifaapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MovieDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        // Mengambil data dari intent
        Intent intent = getIntent();
        String year = intent.getStringExtra("year");
        String synopsis = intent.getStringExtra("synopsis");
        int movieImageResource = intent.getIntExtra("imageResource", R.drawable.action1);
        String trailerUrl = intent.getStringExtra("trailerUrl"); // Dapatkan URL trailer dari intent

        // Menampilkan data pada tampilan
        TextView yearTextView = findViewById(R.id.yearTextView);
        TextView synopsisTextView = findViewById(R.id.synopsisTextView);
        ImageView movieImageView = findViewById(R.id.movieImageView);

        if (year != null && synopsis != null) {
            yearTextView.setText(year);
            synopsisTextView.setText(synopsis);

            // Mengatur gambar film
            movieImageView.setImageResource(movieImageResource);
        }
    }

    // Metode untuk menangani klik tombol trailer
    public void watchTrailer(View view) {
        // Dapatkan URL trailer dari intent
        String trailerUrl = getIntent().getStringExtra("trailerUrl");

        // Membuka trailer menggunakan Intent
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(trailerUrl));

        // Periksa apakah terdapat aplikasi yang dapat menangani intent ini
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            // Tampilkan pesan jika tidak ada aplikasi yang dapat menangani intent
            Toast.makeText(this, "No application available to handle this action", Toast.LENGTH_SHORT).show();
        }
    }
}
