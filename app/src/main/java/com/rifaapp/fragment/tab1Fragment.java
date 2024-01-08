package com.rifaapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.rifaapp.MovieDetailsActivity;
import com.rifaapp.R;

public class tab1Fragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public tab1Fragment() {
        // Required empty public constructor
    }

    public static tab1Fragment newInstance(String param1, String param2) {
        tab1Fragment fragment = new tab1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab1, container, false);

        // Menghubungkan elemen-elemen UI dengan variabel di dalam class
        LinearLayout film1Layout = rootView.findViewById(R.id.film1Layout);
        LinearLayout film2Layout = rootView.findViewById(R.id.film2Layout);
        LinearLayout film3Layout = rootView.findViewById(R.id.film3Layout);
        LinearLayout film4Layout = rootView.findViewById(R.id.film4Layout);
        // ... (Menghubungkan elemen-elemen lainnya)

        // Mengatur listener untuk setiap item film
        film1Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMovieDetails(1, "https://youtu.be/32RAq6JzY-w?si=rlTJ5syUy7pW4c9N");
            }
        });

        film2Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMovieDetails(2, "https://youtu.be/-tnxzJ0SSOw?si=c4YHVXjmXGQ3SIzE");
            }
        });

        film3Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMovieDetails(3, "https://youtu.be/AdjedKX9nas?si=fT4avlcPi7wITeua");
            }
        });

        film4Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMovieDetails(4, "https://youtu.be/x_suyF59MfA?si=Dh5Ul0pXZ7x6fRZU");
            }
        });

        // ... (Menambahkan listener untuk item film lainnya)

        return rootView;
    }

    // Metode untuk menampilkan sinopsis, tahun, dan gambar film
    private void showMovieDetails(int movieNumber, String trailerUrl) {
        // Dapatkan tahun, sinopsis, dan ID gambar berdasarkan nomor film
        String year = "";
        String synopsis = "";
        int imageResource = R.drawable.action1; // Gambar default

        switch (movieNumber) {
            case 1:
                year = "Year: 2023";
                synopsis = "Dom Toretto dan keluarganya menjadi sasaran putra gembong narkoba Hernan Reyes yang pendendam.";
                imageResource = R.drawable.action1;
                break;
            case 2:
                year = "Year: 2012";
                synopsis = "Peter Parker is an outcast high schooler abandoned by his parents as a boy, leaving him to be raised by his Uncle Ben and Aunt May. Like most teenagers, Peter is trying to figure out who he is and how he got to be the person he is today.";
                imageResource = R.drawable.action2;
                break;
            case 3:
                year = "Year: 2023";
                synopsis = "Kisah 13 Bom di Jakarta diawali dengan hadirnya segerombolan teroris yang melancarkan serangan di beberapa titik pusat keramaian ibu kota.";
                imageResource = R.drawable.action3;
                break;
            case 4:
                year = "Year: 2023";
                synopsis = "Pertaruhan the Series 2 adalah serial web Indonesia produksi Screenplay Films yang ditayangkan perdana 3 November 2023 di Vidio berdasarkan film Pertaruhan karya Upi.";
                imageResource = R.drawable.action4;
                break;
            // Tambahkan case untuk film lainnya
        }

        // Membuka aktivitas atau menampilkan dialog untuk menunjukkan sinopsis, tahun, dan gambar film
        Intent intent = new Intent(getActivity(), MovieDetailsActivity.class);
        intent.putExtra("year", year);
        intent.putExtra("synopsis", synopsis);
        intent.putExtra("imageResource", imageResource);
        intent.putExtra("trailerUrl", trailerUrl);
        startActivity(intent);
    }
}
