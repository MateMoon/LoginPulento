package com.example.loginpulento;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Iniciar(View view){
        Intent iniciar = new Intent (this, Iniciar.class);
        startActivity(iniciar);
    }

    public void Registrarse(View view){
        Intent Registrarse = new Intent (this, Registrarse.class);
        startActivity(Registrarse);
    }

}