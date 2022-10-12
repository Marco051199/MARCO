package com.example.diseo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView TVDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TVDatos = findViewById(R.id.tvDatos);

        Intent intent = getIntent();

        String mensaje = intent.getStringExtra("usuario" );
        String password = intent.getStringExtra("password");

        TVDatos.setText(mensaje + " "+password);


    }
}