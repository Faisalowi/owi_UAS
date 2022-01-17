package com.example.owi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnKuraKura,btnAnjing, btnUlar;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }

    public void onClickProfile (View v) {
        Intent intent = new Intent(MainActivity.this, Profil.class);
        intent.putExtra("MAHASISWA", "Owi");
        startActivity(intent);
    }
    private void inisialisasiView() {
        btnKuraKura = findViewById(R.id.btn_buka_ras_kura);
        btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
        btnUlar = findViewById(R.id.btn_buka_ras_ular);
        btnKuraKura.setOnClickListener(view -> bukaGaleri("KuraKura"));
        btnAnjing.setOnClickListener(view -> bukaGaleri("Anjing"));
        btnUlar.setOnClickListener(view -> bukaGaleri("Ular"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }
}