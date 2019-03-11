package com.example.risa.hitungpersegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editSisi, editHasil, editKeliling;
    private Button btnOk;
    private TextView txtSisi, txtLuas, txtKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initEvent();
    }

    private void initUI(){
        txtSisi = (TextView)findViewById(R.id.txtSisi);
        txtLuas = (TextView)findViewById(R.id.txtLuas);
        txtKeliling = (TextView)findViewById(R.id.txtKeliling);
        editSisi = (EditText) findViewById(R.id.editSisi);
        editHasil = (EditText)findViewById(R.id.editHasil);
        editKeliling = (EditText) findViewById(R.id.editKeliling);
        btnOk = (Button) findViewById(R.id.btnOk);
    }

    private void initEvent(){
        btnOk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                hitungLuas();
                hitungKeliling();
            }
        });
    }

    private void hitungLuas(){
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int luas = sisi*sisi;
        editHasil.setText(luas+"");
    }

    private void hitungKeliling(){
        int sisi = Integer.parseInt(editSisi.getText().toString());
        int keliling = 4*sisi;
        editKeliling.setText(keliling+"");
    }
}
