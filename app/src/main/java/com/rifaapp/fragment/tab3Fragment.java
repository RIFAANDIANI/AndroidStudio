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

public class tab3Fragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public tab3Fragment() {
        // Required empty public constructor
    }

    public static tab3Fragment newInstance(String param1, String param2) {
        tab3Fragment fragment = new tab3Fragment();
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
        View rootView = inflater.inflate(R.layout.fragment_tab3, container, false);

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
                showMovieDetails(1, "https://youtu.be/0hSptYxWB3E");
            }
        });

        film2Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMovieDetails(2, "https://youtu.be/SiIhHx24R9I");
            }
        });

        film3Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMovieDetails(3, "https://youtu.be/BRb4U99OU80");
            }
        });

        film4Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMovieDetails(4, "https://youtu.be/RgQVPgvRkhs");
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
        int imageResource = R.drawable.horor1; // Gambar default

        switch (movieNumber) {
            case 1:
                year = "Year: 2017";
                synopsis = "Setelah sakit aneh selama 3 tahun, Ibu akhirnya meninggal dunia. Bapak lalu memutuskan untuk kerja di luar kota meninggalkan anak-anak. Tak lama kemudian, anak-anak merasa bahwa Ibu kembali berada di rumah";
                imageResource = R.drawable.horor1;
                break;
            case 2:
                year = "Year: 2023";
                synopsis = "Evil Dead Rise menceritakan kisah mengejutkan tentang dua saudara perempuan yang terasing yang reuninya dipersingkat oleh munculnya setan yang merasuki manusia, mendorong mereka ke dalam pertempuran utama untuk bertahan hidup saat mereka menghadapi versi keluarga paling mengerikan yang bisa dibayangkan" ;
                imageResource = R.drawable.horor2;
                break;
            case 3:
                year = "Year: 2023";
                synopsis = "Seorang insinyur robotika di sebuah perusahaan mainan membuat boneka yang penampilannya seperti gadis kecil dan diprogram agar menjadi teman sekaligus penjaga bagi anak-anak. Sampai petaka dimulai saat boneka M3gan ternyata mulai hidup dan meneror penciptanya.";
                imageResource = R.drawable.horor3;
                break;
            case 4:
                year = "Year: 2023";
                synopsis = "Seorang pemuda yang memiliki kemampuan untuk berkomunikasi dengan orang yang sudah meninggal. Dia harus menggunakan kemampuannya untuk menghentikan roh jahat yang dipenuhi dendam terhadap teman sekolahnya. Sementara itu dia bertekad untuk membantu sesosok hantu cantik untuk mengembalikan ingatannya.";
                imageResource = R.drawable.horor4;
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
