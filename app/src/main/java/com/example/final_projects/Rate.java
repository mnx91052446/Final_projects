package com.example.final_projects;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rate extends AppCompatActivity {
    private FragmentManager fmgr;
    private currencyFragment f1;
    private exchangeRateFragment f2;
    private Button B1,B2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        fmgr = getFragmentManager();
        f1 = new currencyFragment();
        f2 = new exchangeRateFragment();
        B1=findViewById(R.id.B1);
        B2=findViewById(R.id.B2);

        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.add(R.id.container, f1);
        B1.setTextColor(Color.parseColor("#00aabb"));
        B2.setTextColor(Color.parseColor("#5e5e5e"));
        transaction.commit();

    }




    public void setF1(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f1);

        B1.setTextColor(Color.parseColor("#00aabb"));
        B2.setTextColor(Color.parseColor("#5e5e5e"));
        transaction.commit();
    }

    public void setF2(View view) {
        FragmentTransaction transaction = fmgr.beginTransaction();
        transaction.replace(R.id.container, f2);
        B2.setTextColor(Color.parseColor("#00aabb"));
        B1.setTextColor(Color.parseColor("#5e5e5e"));
        transaction.commit();
    }

}

