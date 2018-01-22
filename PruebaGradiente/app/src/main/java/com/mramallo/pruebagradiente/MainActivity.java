package com.mramallo.pruebagradiente;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    TextView singUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singUp = findViewById(R.id.singUp);
        String font_path = "font/Poppins-ExtraBold.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(), font_path);
        singUp.setTypeface(TF);


    }

}
