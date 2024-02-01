package com.example.myapplicationnopmuon.Tuan2.A43647KL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplicationnopmuon.R;

public class A43647Tuan21SecondMainActivity2 extends AppCompatActivity {
    TextView A43647tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a43647_tuan21_second_main2);
        A43647tv1=findViewById(R.id.A43647tv1);
        Intent i1=getIntent();
        String A43647str1=i1.getExtras().getString("so1");
        float A43647so1=Float.parseFloat(A43647str1);
        String A43647str2=i1.getExtras().getString("so2");
        float A43647so2=Float.parseFloat(A43647str2);

        float A43647sum=A43647so1+A43647so2;
        A43647tv1.setText(String.valueOf(A43647sum));
    }
}