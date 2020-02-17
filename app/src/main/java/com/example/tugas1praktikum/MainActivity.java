package com.example.tugas1praktikum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Btn_Tabung, Btn_Kubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn_Tabung = findViewById(R.id.btn_tabung);
        Btn_Tabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TubeActivity.class);
                startActivity(intent);
            }
        });

        Btn_Kubus = findViewById(R.id.btn_kubus);
        Btn_Kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CubeActivity.class);
                startActivity(intent);
            }
        });
    }
}

