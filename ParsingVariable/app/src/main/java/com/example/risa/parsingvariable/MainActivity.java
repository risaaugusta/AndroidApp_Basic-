package com.example.risa.parsingvariable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit, btnHapus;
    EditText editNama, editTahun, editAlamat, editTelepon,editEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnHapus = (Button) findViewById(R.id.btnHapus);
        editNama = (EditText)findViewById(R.id.editNama);
        editTahun = (EditText)findViewById(R.id.editTahun);
        editAlamat = (EditText)findViewById(R.id.editAlamat);
        editTelepon = (EditText)findViewById(R.id.editTelepon);
        editEmail = (EditText)findViewById(R.id.editEmail);

        btnHapus.setOnClickListener(new View.OnClickListener()
        { @Override
            public void onClick(View view) {
            editNama.setText("");
            editTahun.setText("");
            editAlamat.setText("");

            editTelepon.setText("");
            editEmail.setText("");
        }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                String nama = editNama.getText().toString();
                String tahun = editTahun.getText().toString();
                String alamat = editAlamat.getText().toString();
                String telepon = editTelepon.getText().toString();
                String email = editEmail.getText().toString();

                if(editNama.getText().toString().length()==0){
                    //jika form Nama belum di isi / masih kosong
                    editNama.setError("Nama diperlukan!");
                }else if(editAlamat.getText().toString().length()==0){
                    //jika form Alamat belum di isi / masih kosong
                    editAlamat.setError("Alamat diperlukan!");
                }else if(editEmail.getText().toString().length()==0){
                    //jika form Email belum di isi / masih kosong
                    editEmail.setError("Email diperlukan!");
                }
                else if(editTahun.getText().toString().length()==0){
                    //jika form Tahun belum di isi / masih kosong
                    editTahun.setError("Tahun diperlukan!");
                }
                else if(editTelepon.getText().toString().length()==0){
                    //jika form Telepon belum di isi / masih kosong
                    editTelepon.setError("Telepon diperlukan!");
                }
//                if(btnSubmit.getText().equals("Submit")){
//                    if(editNama.equals("")){
//                        editNama.setError("Silakan masukkan nama!");
//                        editNama.requestFocus();
//                    }
//                    else if(editTahun.equals("")){
//                        editTahun.setError("Silakan masukkan nama!");
//                        editTahun.requestFocus();
//                    }
//                    else if(editEmail.equals("")){
//                        editEmail.setError("Silakan masukkan nama!");
//                        editEmail.requestFocus();
//                    }
//                    else if(editTelepon.equals("")){
//                        editTelepon.setError("Silakan masukkan nama!");
//                        editTelepon.requestFocus();
//                    }
//                    else if(editAlamat.equals("")){
//                        editAlamat.setError("Silakan masukkan nama!");
//                        editAlamat.requestFocus();
//                    }

                else {
//                    //jika form sudah terisi semua
                    Toast.makeText(getApplicationContext(), "Berhasil input data!",
                            Toast.LENGTH_SHORT).show();
                }
                Intent i = null;

                i = new
                        Intent(MainActivity.this,Main2Activity.class);
                Bundle b = new Bundle();
                b.putString("parse_nama",nama);
                b.putString("parse_tahun",tahun);
                b.putString("parse_alamat",alamat);
                b.putString("parse_telepon",telepon);
                b.putString("parse_email",email);

                i.putExtras(b);
                startActivity(i);

        }
        });
//
//        btnSubmit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(editNama.getText().toString().length()==0){
//                    //jika form Email belum di isi / masih kosong
//                    editNama.setError("Nama diperlukan!");
//                }else if(editAlamat.getText().toString().length()==0){
//                    //jika form Username belum di isi / masih kosong
//                    editAlamat.setError("Alamat diperlukan!");
//                }else if(editEmail.getText().toString().length()==0){
//                    //jika form Passwrod belum di isi / masih kosong
//                    editEmail.setError("Email diperlukan!");
//                }
//                else if(editTahun.getText().toString().length()==0){
//                    //jika form Passwrod belum di isi / masih kosong
//                    editTahun.setError("Tahun diperlukan!");
//                }
//                else if(editTelepon.getText().toString().length()==0){
//                    //jika form Passwrod belum di isi / masih kosong
//                    editTelepon.setError("Telepon diperlukan!");
//                }
////                else {
////                    //jika form sudah terisi semua
////                    Toast.makeText(getApplicationContext(), "Registrasi Berhasil!",
////                            Toast.LENGTH_SHORT).show();
////                }
//            }
//    });
} }
