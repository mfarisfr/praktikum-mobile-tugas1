package com.example.tugas1praktikum;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CubeActivity extends AppCompatActivity {
    private TextView Txt_volume_kubus;
    private EditText Input_panjang;
    private Button Btn_hasil_kubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        Txt_volume_kubus = findViewById(R.id.txt_volume_kubus);
        Input_panjang = findViewById(R.id.input_panjang);
        Btn_hasil_kubus = findViewById(R.id.btn_hasil_kubus);
        Btn_hasil_kubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double side = Double.parseDouble(Input_panjang.getText().toString());
                    Txt_volume_kubus.setText(String.valueOf(Volume(side)));
                }catch (NumberFormatException e) {
                    Toast.makeText(CubeActivity.this, "NULL", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private double Volume(double panjang) {
        return panjang * panjang * panjang;
    }
}
