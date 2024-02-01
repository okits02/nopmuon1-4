package com.example.myapplicationnopmuon.Tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplicationnopmuon.R;

public class A43647T4MainActivity extends AppCompatActivity {
    Button A43647btn;
    TextView A43647tv;
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a43647_t4_main);
        A43647Volleyfn Volleyfn=new A43647Volleyfn();
        A43647btn=findViewById(R.id.A43647btn);
        A43647tv=findViewById(R.id.A43647Tv);
        A43647btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Volleyfn.getJsonArrayObject(context,A43647tv);
            }
        });

    }
}