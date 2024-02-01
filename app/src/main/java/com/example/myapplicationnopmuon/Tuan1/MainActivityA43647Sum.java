package com.example.myapplicationnopmuon.Tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplicationnopmuon.R;

public class MainActivityA43647Sum extends AppCompatActivity {
    EditText A43647eT1, A43647eT2;
    Button A43647bTn1;
    TextView A43647tV1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_a43647_sum);
        A43647eT1=findViewById(R.id.A43647eT1);
        A43647eT2=findViewById(R.id.A43647eT2);
        A43647bTn1=findViewById(R.id.A43647bTn1);
        A43647tV1=findViewById(R.id.A43647tV1);

        A43647bTn1.setOnClickListener(v->{
            A43647Sum();
        });
    }
    private void A43647Sum()
    {
        String A43647str1=A43647eT1.getText().toString();
        float A43647so1=Float.parseFloat(A43647str1);
        String A43647str2=A43647eT2.getText().toString();
        float A43647so2=Float.parseFloat(A43647str2);
        float A43647Sum=A43647so1+A43647so2;
        A43647tV1.setText((String.valueOf(A43647Sum)));

    }
}