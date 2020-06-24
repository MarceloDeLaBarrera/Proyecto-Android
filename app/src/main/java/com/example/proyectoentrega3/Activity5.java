package com.example.proyectoentrega3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

   private Spinner origen, destino;
   private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        resultado = (TextView) findViewById(R.id.resultado);
        origen = (Spinner) findViewById(R.id.spinner2);
        destino = (Spinner) findViewById(R.id.spinner3);

        String[] opciones_origen = {"Santiago", "Valparaiso", "La Serena"};
        ArrayAdapter<String> obj_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones_origen);
        origen.setAdapter(obj_adapter);

        String[] opciones_destino = {"Santiag", "Valparaiso", "La Serena"};
        ArrayAdapter<String> obj_adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones_destino);
        destino.setAdapter(obj_adapter);

    }

    public void Hacer(View view)
    {
        // Para spinner
        float tiempo;
        String res;
        String seleccion = origen.getSelectedItem().toString();
        String seleccion2 = destino.getSelectedItem().toString();

        if (seleccion.equals("Santiago") && (seleccion2.equals("Valparaiso"))) {
            tiempo = (float) (121.2 / 100);
            res = Float.toString(tiempo);
            resultado.setText(res);
        }

        if(seleccion.equals("Santiago") && (seleccion2.equals("La Serena"))) {
            tiempo = (float) (472.4 / 100);
            res = Float.toString(tiempo);
            resultado.setText(res);
        }

        if (seleccion.equals("Valparaiso") && (seleccion2.equals("Santiago"))) {
            tiempo = (float) (121.2 / 100);
            res = Float.toString(tiempo);
            resultado.setText(res);
        }

        if (seleccion.equals("Valparaiso") && (seleccion2.equals("La Serena"))) {
            tiempo = (float) (432.7 / 100);
            res = Float.toString(tiempo);
            resultado.setText(res);
        }

        if(seleccion.equals("La Serena") && (seleccion2.equals("Santiago"))) {
            tiempo = (float) (472.4 / 100);
            res = Float.toString(tiempo);
            resultado.setText(res);
        }

        if (seleccion.equals("La Serena") && (seleccion2.equals("Valparaiso"))) {
            tiempo = (float) (432.7 / 100);
            res = Float.toString(tiempo);
            resultado.setText(res);
        }


        }


    }
