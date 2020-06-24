package com.example.proyectoentrega3;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.proyectoentrega3.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void IrActivity1(View view){
        Intent obj_intent = new Intent(this, MainActivity.class);
        startActivity(obj_intent);
    }
    public void IrActivity2(View view){
        Intent obj_intent = new Intent(this, Activity2.class);
        startActivity(obj_intent);
    }
    public void IrActivity3(View view){
        Intent obj_intent = new Intent(this, Activity3.class);
        startActivity(obj_intent);
    }
    public void IrActivity4(View view){
        Intent obj_intent = new Intent(this, Activity4.class);
        startActivity(obj_intent);
    }
    public void IrActivity5(View view){
        Intent obj_intent = new Intent(this, Activity5.class);
        startActivity(obj_intent);
    }
    public void IrActivity6(View view){
        Intent obj_intent = new Intent(this, Activity6.class);
        startActivity(obj_intent);
    }
    public void IrActivity7(View view){
        Intent obj_intent = new Intent(this, Activity7.class);
        startActivity(obj_intent);
    }
}