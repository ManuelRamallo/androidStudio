package com.jamores.splashscreenexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickButton = findViewById(R.id.button);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nombre = findViewById(R.id.nombre);
                EditText apellidos = findViewById(R.id.apellidos);
                EditText numeroTelefono = findViewById(R.id.editText2);
                Spinner pais = findViewById(R.id.spinner);


                if(nombre.getText().toString().length() == 0){
                    nombre.setError("Introduzca el nombre");
                } else if(apellidos.getText().toString().length() == 0){
                    apellidos.setError("Introduzca los apellidos");
                } else if(numeroTelefono.getText().toString().length() == 0){
                    numeroTelefono.setError("Introduzca el número de telefono");
                } else if(pais.getSelectedItemPosition() == 0) {
                    Toast.makeText(MainActivity.this, "Seleccione un país, por favor", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(MainActivity.this, MessageScreenActivity.class);
                    startActivity(i);
                }
            }
        });


    }
}
