package com.example.tugas1praktikum;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TubeActivity extends AppCompatActivity {
    private TextView Txt_volume_tabung;
    private EditText Input_jari, Input_Tinggi;
    private Button Btn_Hasil_Tabung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        Txt_volume_tabung = findViewById(R.id.txt_volume_tabung);
        Input_Tinggi = findViewById(R.id.input_tinggi);
        Input_jari = findViewById(R.id.input_jari);
        Btn_Hasil_Tabung = findViewById(R.id.btn_hasil_tabung);
        Btn_Hasil_Tabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double jari = Double.parseDouble(Input_jari.getText().toString());
                    double tinggi = Double.parseDouble(Input_Tinggi.getText().toString());
                    Txt_volume_tabung.setText(String.valueOf(Volume(jari, tinggi)));
                }catch (NumberFormatException e) {
                    Toast.makeText(TubeActivity.this, "NULL", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private double Volume(double jari, double tinggi) {
        return Math.PI * jari * jari * tinggi;
    }
}
