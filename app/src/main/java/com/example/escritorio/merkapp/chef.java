package com.example.escritorio.merkapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class chef extends AppCompatActivity {

    private EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chef);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
    }

    public void verificar(View view){
        String clave=et2.getText().toString();
        String usuario=et1.getText().toString();
        if (usuario.equals("abi")){
        }else {
            Toast notificaion= Toast.makeText(this,"No Existe este Uusuario",Toast.LENGTH_LONG);
            notificaion.show();
        }
        if (clave.equals("abi123")){
        }else {
            Toast notificaion= Toast.makeText(this,"Contraseña Incorrecta",Toast.LENGTH_LONG);
            notificaion.show();
        }
        if (usuario.equals("abi")&& clave.equals("abi123")){
            Toast notificacion=Toast.makeText(this,"Usuario y Contraseña Correctos",Toast.LENGTH_LONG);
            notificacion.show();
            Intent a=new Intent(this, realtimechef.class);
            startActivity(a);
        }
    }
}