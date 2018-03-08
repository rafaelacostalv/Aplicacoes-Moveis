package com.example.alunos.jogoadivinha2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.*;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private int cont;
    private Random gerador = new Random();
    private int numero = gerador.nextInt(1000)+1;

    public void Confere(View v) {
        EditText userInput = findViewById(R.id.editText);
        String str = userInput.getText().toString();

        int num = Integer.parseInt(str);
        if (num == numero) {
            TextView etiqueta = (TextView) findViewById(R.id.etiqueta);
            etiqueta.setText(getResources().getString(R.string.lblHello));
            TextView tentativas = (TextView) findViewById(R.id.tentativas);
            tentativas.setText(Integer.toString(cont));
            cont = 0;
        } else {
            cont++;
            TextView etiqueta = (TextView) findViewById(R.id.etiqueta);
            etiqueta.setText(getResources().getString(R.string.lblHello2));
            TextView tentativas = (TextView) findViewById(R.id.tentativas);
            tentativas.setText(Integer.toString(cont));
            if(num > numero) {
                TextView palpite = (TextView) findViewById(R.id.palpite);
                palpite.setText("TENTE UM NÚMERO MENOR");
            }else{
                TextView palpite = (TextView) findViewById(R.id.palpite);
                palpite.setText("TENTE UM NÚMERO MAIOR");
            }
        }
    }

}
