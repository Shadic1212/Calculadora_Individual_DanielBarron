package com.example.calculadorachadi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculadoraNormal extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_division;
    private Button btn_multiplicacion;
    private Button regresar2;
    private TextView text_resultado;

    private EditText edit_num1;
    private EditText edit_num2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_normal);

        text_resultado = findViewById(R.id.resultado);

        edit_num1 = findViewById(R.id.numUno);
        edit_num2 = findViewById(R.id.numDos);
        regresar2=(Button)findViewById(R.id.regresar2);
        regresar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( CalculadoraNormal.this, MainActivity.class);
                startActivity(i);
            }
        });





        btn_suma = findViewById(R.id.boton_suma);
        btn_suma.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                text_resultado.setText( suma( Integer.parseInt(edit_num1.getText().toString()),Integer.parseInt(edit_num2.getText().toString()) )+"");
            }
        });


        btn_division = findViewById(R.id.boton_division);
        btn_division.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                text_resultado.setText( division( Integer.parseInt(edit_num1.getText().toString()),Integer.parseInt(edit_num2.getText().toString()) )+"");

            }
        });

        btn_multiplicacion = findViewById(R.id.boton_multiplicacion);
        btn_multiplicacion.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                text_resultado.setText( multiplicacion( Integer.parseInt(edit_num1.getText().toString()),Integer.parseInt(edit_num2.getText().toString()) )+"");

            }
        });

        btn_resta = findViewById(R.id.boton_resta);
        btn_resta.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                text_resultado.setText( resta( Integer.parseInt(edit_num1.getText().toString()),Integer.parseInt(edit_num2.getText().toString()) )+"");

            }
        });

    }

    public double suma (int a, int b){
        return a+b;
    }

    public double resta (int a, int b){
        return a-b;
    }

    public double multiplicacion (int a, int b){
        return a*b;
    }

    public double division (int a, int b){
        int respuesta = 0;

        if (b!=0){
            respuesta=a/b;
        }

        return respuesta;
    }
}