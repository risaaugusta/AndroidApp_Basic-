package com.example.risa.operatoraritmatika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnJumlah, btnKurang, btnKali, btnBagi;
    TextView txtAwal, txtOperator, txtHasil;
    EditText editAwal, editKedua, editHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJumlah = (Button)findViewById(R.id.btnJumlah);
        btnKurang = (Button)findViewById(R.id.btnKurang);
        btnKali = (Button)findViewById(R.id.btnKali);
        btnBagi = (Button)findViewById(R.id.btnBagi);
        txtAwal = (TextView) findViewById(R.id.txtAwal);
        txtOperator = (TextView) findViewById(R.id.txtOperator);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        editAwal = (EditText) findViewById(R.id.editAwal);
        editKedua = (EditText) findViewById(R.id.editKedua);
        editHasil = (EditText) findViewById(R.id.editHasil);

        btnJumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorPenjumlahan();
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorPengurangan();
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorPerkalian();
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operatorPembagian();
            }
        });

    }

    private void operatorPenjumlahan(){
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int penjumlahan = angkaawal+angkakedua;
        editHasil.setText(penjumlahan+"");
    }

    private void operatorPengurangan(){
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int pengurangan = angkaawal-angkakedua;
        editHasil.setText(pengurangan+"");
    }

    private void operatorPerkalian(){
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int perkalian = angkaawal*angkakedua;
        editHasil.setText(perkalian+"");
    }

    private void operatorPembagian(){
        int angkaawal = Integer.parseInt(editAwal.getText().toString());
        int angkakedua = Integer.parseInt(editKedua.getText().toString());
        int pembagian = angkaawal/angkakedua;
        editHasil.setText(pembagian+"");
    }
}
