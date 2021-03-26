package com.dhimas.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText EdtNilaiA, EdtNilaiB;
    Button BtnTambah, BtnKurang, BtnKali, BtnBagi;
    TextView TxtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdtNilaiA = (EditText) findViewById(R.id.EdtNilaiA);
        EdtNilaiB = (EditText) findViewById(R.id.EdtNilaiB);
        TxtHasil = (TextView) findViewById(R.id.TxtHasil);
        BtnTambah = (Button) findViewById(R.id.BtnTambah);
        BtnKurang = (Button) findViewById(R.id.BtnKurang);
        BtnKali = (Button) findViewById(R.id.BtnKali);
        BtnBagi = (Button) findViewById(R.id.BtnBagi);

        BtnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(EdtNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(EdtNilaiB.getText().toString());
                int hasil  = nilaiA + nilaiB;
                TxtHasil.setText(String.valueOf(hasil));
            }
        });

        BtnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(EdtNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(EdtNilaiB.getText().toString());
                int hasil  = nilaiA - nilaiB;
                TxtHasil.setText(String.valueOf(hasil));
            }
        });

        BtnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(EdtNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(EdtNilaiB.getText().toString());
                int hasil  = nilaiA * nilaiB;
                TxtHasil.setText(String.valueOf(hasil));
            }
        });

        BtnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(EdtNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(EdtNilaiB.getText().toString());
                int hasil  = nilaiA / nilaiB;
                TxtHasil.setText(String.valueOf(hasil));
            }
        });
    }
}