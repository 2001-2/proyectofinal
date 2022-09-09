package com.example.escritorio.merkapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void administrador(View view){
        Intent a=new Intent(this, administrador.class);
        startActivity(a);


    }

    public void chef(View view){
        Intent a=new Intent(this, chef.class);
        startActivity(a);


    }

    public void cliente(View view){
        Intent a=new Intent(this, ActivityLogin.class);
        startActivity(a);


    }

    public void mapa(View view){
        Intent a=new Intent(this, ActivityLogin.class);
        startActivity(a);


    }

}