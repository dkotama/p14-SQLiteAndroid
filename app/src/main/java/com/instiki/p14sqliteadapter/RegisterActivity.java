package com.instiki.p14sqliteadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.instiki.p14sqliteadapter.mahasiswa.MahasiswaDBHelper;
import com.instiki.p14sqliteadapter.mahasiswa.MahasiswaModel;

public class RegisterActivity extends AppCompatActivity {
    EditText usernameET, fullnameET, nimET, passwordET;
    Button btnSave;
    MahasiswaDBHelper db;

    String username, fullname, password, nim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        db = new MahasiswaDBHelper(this);

        usernameET = findViewById(R.id.username_edittext);
        fullnameET = findViewById(R.id.fullname_edittext);
        nimET = findViewById(R.id.nim_edittext);
        passwordET = findViewById(R.id.password_edittext);
        btnSave = findViewById(R.id.button_save);



        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = usernameET.getText().toString();
                fullname = fullnameET.getText().toString();
                password = passwordET.getText().toString();
                nim = nimET.getText().toString();

                MahasiswaModel newMahasiswa = new MahasiswaModel(username, fullname, password, nim);
                db.addMahasiswa(newMahasiswa);


                Toast.makeText(RegisterActivity.this, "Sukses Register", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}