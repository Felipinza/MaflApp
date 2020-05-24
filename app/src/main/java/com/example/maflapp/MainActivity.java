package com.example.maflapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //BOTON PARA PASAR A LA VENTANA MASCARILLAS
    public void btn_tab2_click(View view){
        Intent intent = new Intent(this, Tab1.class);
        startActivity(intent);
    }



}
