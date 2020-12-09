package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btn_verdadero, btn_falso, btn_siguiente;
    private TextView txtPregunta;
    private List<Pregunta> listPreguntas ;
    private int m_iterador=0;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_verdadero = (Button) findViewById(R.id.btnVerdadero);
        btn_falso = (Button) findViewById(R.id.btnFalse);
        btn_siguiente = (Button) findViewById(R.id.btnSiguiente);
        txtPregunta = (TextView) findViewById(R.id.txtPregunta);
        context = this;
        listPreguntas = new ArrayList<>();

        listPreguntas.add(new Pregunta("Guayaquil es la ciudad del Ecuador con mas habitantes? ","true"));
        listPreguntas.add(new Pregunta("La capital del Ecuador es Quito? ","true"));
        listPreguntas.add(new Pregunta("Guayaquil pertenece a la provincia de Manta? ","false"));
        listPreguntas.add(new Pregunta("Pichincha es la capital de Quito? ","true"));
        listPreguntas.add(new Pregunta("Esmeraldas es la capital de Pastaza?","false"));

        txtPregunta.setText(listPreguntas.get(m_iterador).getMy_texto());

        btn_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_iterador++;
                if(m_iterador <= 4){
                    System.out.println(m_iterador+"---- Valor");
                    txtPregunta.setText(listPreguntas.get(m_iterador).getMy_texto());
                }else{
                    m_iterador = 0;
                }

            }
        });

        btn_verdadero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listPreguntas.get(m_iterador).getVal() == "true" ){
                    Toast.makeText(context,"Verdadero",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(context,"Upss.. era Falso intenta de nuevo",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_falso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listPreguntas.get(m_iterador).getVal() == "false" ){
                    Toast.makeText(context,"Falso",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(context,"Upss.. era Verdadero intenta de nuevo",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}