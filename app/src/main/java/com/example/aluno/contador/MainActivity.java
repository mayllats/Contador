package com.example.aluno.contador;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView total;
    Button adiciona;
    Button diminui;
    Button limpa;
    int numero=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        total = (TextView) findViewById(R.id.visor);
        adiciona = (Button) findViewById(R.id.adicionar);
        diminui = (Button) findViewById(R.id.diminuir);
    }

    public void adiciona(View v){
       numero = numero + 1;
      total.setText(Integer.toString(numero));
      total.setBackgroundColor(Color.BLUE);
      total.setTextColor(Color.WHITE);
    }
    public void diminui(View v){
        numero = numero - 1;
        total.setText(Integer.toString(numero));
        total.setBackgroundColor(Color.RED);
        total.setTextColor(Color.WHITE);
    }

    public void limpa(View v){
        numero = 0;
        total.setText(Integer.toString(numero));
        total.setBackgroundColor(Color.GREEN);
        total.setTextColor(Color.BLACK);
    }
}
