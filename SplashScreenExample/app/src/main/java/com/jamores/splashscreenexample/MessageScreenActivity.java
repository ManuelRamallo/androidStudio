package com.jamores.splashscreenexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MessageScreenActivity extends AppCompatActivity {

    Button botonContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_screen);

        botonContinuar = findViewById(R.id.buttonContinuar);

        botonContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText codeSms =  findViewById(R.id.codeSms);

                if( codeSms.getText().toString().length() == 0 || codeSms.getText().toString().length() < 6 )
                    codeSms.setError( "Código incorrecto" );
                else{

                Intent i = new Intent(MessageScreenActivity.this, ExpandableCategoryActivity.class);
                startActivity(i);
                finish();
                }
            }
        });

    }
}
