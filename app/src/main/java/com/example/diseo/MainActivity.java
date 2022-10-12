package com.example.diseo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout constraintLayout;
    Button idNavega;
    EditText ETUsuario, ETPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idNavega = findViewById(R.id.idNavega);
        ETUsuario = findViewById(R.id.idetUsuario);
        ETPassword = findViewById(R.id.idetContraseña);

        Intent intent = new Intent(this,SecondActivity.class);

        idNavega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = ETUsuario.getText().toString();
                String password = ETPassword.getText().toString();
                intent.putExtra("usuario",usuario);
                intent.putExtra("password",password);
                startActivity(intent);


            }
        });
    }
}