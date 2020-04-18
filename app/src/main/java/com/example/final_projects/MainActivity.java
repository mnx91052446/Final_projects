package com.example.final_projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toPlan(View view) {
        Intent intent = new Intent(MainActivity.this,Plan.class);
        startActivity(intent);
    }

    public void ToWeather(View view) {
        Intent intent = new Intent(MainActivity.this,Weather.class);
        startActivity(intent);
    }

    public void ToDiscount(View view) {
        Intent intent = new Intent(MainActivity.this,Discount.class);
        startActivity(intent);
    }

    public void ToRate(View view) {
        Intent intent = new Intent(MainActivity.this,Rate.class);
        startActivity(intent);
    }

    public void ToPersonal(View view) {
        Intent intent = new Intent(MainActivity.this,Personal.class);
        startActivity(intent);
    }

    public void ToNote(View view) {
        Intent intent = new Intent(MainActivity.this,Note.class);
        startActivity(intent);
    }


}
