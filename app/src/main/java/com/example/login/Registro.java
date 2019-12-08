package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        final EditText nombreR = (EditText) findViewById(R.id.nombresRegistro);
        final EditText apellidoR = (EditText) findViewById(R.id.apellidosRegistro);
        final EditText claveR = (EditText) findViewById(R.id.passwordregistro);
        Button btnRegistro = (Button)findViewById(R.id.Registro);
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = nombreR.getText().toString();
                String apellido = apellidoR.getText().toString();
                String clave = claveR.getText().toString();
            }
        });
    }
}
