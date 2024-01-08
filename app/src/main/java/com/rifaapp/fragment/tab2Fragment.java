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

public class tab2Fragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public tab2Fragment() {
        // Required empty public constructor
    }

    public static tab2Fragment newInstance(String param1, String param2) {
        tab2Fragment fragment = new tab2Fragment();
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
        View rootView = inflater.inflate(R.layout.fragment_tab2, container, false);

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
                showMovieDetails(1, "https://youtu.be/FuC8H8eXZFU?si=Zep2-XMuO4GmcyCs");
            }
        });

        film2Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMovieDetails(2, "https://youtu.be/r9NJveLN3zI?si=XqxyeF0FELiJkfiu");
            }
        });

        film3Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMovieDetails(3, "https://youtu.be/MbZtoOuRpyU?si=urG90LQ0Y3Bvx-Cj");
            }
        });

        film4Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMovieDetails(4, "https://youtu.be/v2QVXESTKrk?si=hmZ6fDH0OBvD7zmX");
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
                year = "Year: 2016";
                synopsis = "My Stupid Boss is a 2016 Indonesian comedy film directed and written by Upi Avianto based on a four-part novel series of the same name by Chaos@Work. The film stars Reza Rahadian, Bunga Citra Lestari, Alex Abbad, Chew Kin Wah, Atikah Suhaime and Bront Palarae as workers of a company led by a stupid and weird boss known simply as \"Bossman\". ";
                imageResource = R.drawable.comedi1;
                break;
            case 2:
                year = "Year: 2016";
                synopsis = "Cek Toko Sebelah (bahasa Inggris: Check the Store Next Door) adalah film drama komedi Indonesia tahun 2016 yang ditulis dan disutradarai oleh Ernest Prakasa. Ide cerita film ini dibuat berdasarkan pada realitas etnis Tionghoa saat anak beranjak dewasa, kuliah yang tinggi, mirisnya ujung-ujungnya bekerja di toko orang tuanya sendiri" ;
                imageResource = R.drawable.comedi2;
                break;
            case 3:
                year = "Year: 2017";
                synopsis = "Film ini menceritakan tentang hubungan rumit antara seorang ibu, Ellen (Adinia Wirasti) dan anak perempuannya yang remaja bernama Kiara (Aurora Ribero).";
                imageResource = R.drawable.comedi3;
                break;
            case 4:
                year = "Year: 2019";
                synopsis = "Terakhir, Pretty Boys merupakan film yang bercerita tentang Rahmat (Desta Mahendra) dan Anugerah (Vincent Rompies), sahabat sejak kecil dan berkeinginan menjadi terkenal.\n" +
                        "\n" +
                        "Dengan modal nekat, keduanya mengadu nasib ke Jakarta dan mencoba mengejar impian";
                imageResource = R.drawable.comedi3;
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
