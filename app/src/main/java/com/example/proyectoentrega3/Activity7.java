package com.example.proyectoentrega3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Activity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);
    }

    public void IrActivity1(View view){
        Intent obj_intent = new Intent(this, MainActivity.class);
        startActivity(obj_intent);
    }
}