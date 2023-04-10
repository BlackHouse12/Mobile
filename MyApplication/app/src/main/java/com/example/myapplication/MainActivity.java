package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText primeiraNota;
    private EditText segundaNota;
    private EditText terceiraNota;
    private TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primeiraNota = findViewById(R.id.primeiraNota);
        segundaNota = findViewById(R.id.segundaNota);
        terceiraNota = findViewById(R.id.terceiraNota);
        tvResultado = findViewById(R.id.tvResultado);

    }

    public void somar(View view){
        int valor1 = integer.parse.Int(txt.primeiraNota.getText().toString());
        int valor2 = integer.parse.Int(txt.segundaNota.getText().toString());
        int valor3 = integer.parse.Int(txt.terceiraNota.getText().toString());

        tvResultado.setText(String.valueOf(valor1 + valor2 + valor3 / 3));

    }
}