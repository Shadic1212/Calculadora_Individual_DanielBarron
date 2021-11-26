package com.example.calculadorachadi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button_calcular;

    private TextView Resultado;

    private EditText Velocidad_inicial;
    private EditText Velocidad_final;
    private EditText Tiempo;
    double Vi, Vf, T, Res;
    private Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resultado = findViewById(R.id.Resultado);

        regresar = findViewById(R.id.regresar);

    regresar.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            abrirregresar( );
        }
    });
        Velocidad_inicial = findViewById(R.id.Velocidad_inicial);
        Velocidad_final = findViewById(R.id.Velocidad_final);
        Tiempo = findViewById(R.id.Tiempo);
        button_calcular = findViewById(R.id.button_calcular);
        button_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Calcular();
            }
        });
    }

    private void abrirregresar() {
        Intent intent = new Intent( this , CalculadoraNormal.class );
        startActivity( intent );
    }

    private void Calcular() {
        Vi = Double.parseDouble(Velocidad_inicial.getText().toString());
        Vf = Double.parseDouble(Velocidad_final.getText().toString());
        T = Double.parseDouble(Tiempo.getText().toString());
        Res = (Vf-Vi)/T;
        Resultado.setText(String.valueOf(Res));
    }

}