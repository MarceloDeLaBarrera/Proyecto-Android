package com.example.proyectoentrega3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }
    public void IrActivity1(View view){
        Intent obj_intent = new Intent(this, MainActivity.class);
        startActivity(obj_intent);
    }
}