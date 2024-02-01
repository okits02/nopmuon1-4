package com.example.myapplicationnopmuon.Tuan2.A43647KL;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplicationnopmuon.R;

public class A43647Tuan21MainActivity extends AppCompatActivity {
    EditText A43647txt1, A43647txt2;
    Button A43647btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a43647_tuan21_main);
        A43647txt1=findViewById(R.id.A43647txt1);
        A43647txt2=findViewById(R.id.A43647txt2);
        A43647btn1=findViewById(R.id.A43647btn1);
        A43647btn1.setOnClickListener(v->{
            Intent i = new Intent(A43647Tuan21MainActivity.this, A43647Tuan21SecondMainActivity2.class);
            i.putExtra("so1",A43647txt1.getText().toString());
            i.putExtra("so2",A43647txt2.getText().toString());
            startActivity(i);
        });
    }
}