package com.example.myapplicationnopmuon.Tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplicationnopmuon.R;

import java.util.ArrayList;

public class A43647Tuan3MainActivity extends AppCompatActivity {
    ListView A43647lv;
    A43647_T3_Adapter adapter;
    ArrayList<A43647T3Contact> A43647ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a43647_tuan3_main);
        A43647lv=findViewById(R.id.A43647Lv);
        A43647ls.add(new A43647T3Contact("Pham ANh Tu","20", R.drawable.ic_launcher_background));
        A43647ls.add(new A43647T3Contact("Pham ANh b","20", R.drawable.ic_launcher_background));
        A43647ls.add(new A43647T3Contact("Pham ANh Tu","20", R.drawable.ic_launcher_background));
        A43647ls.add(new A43647T3Contact("Pham ANh b","20", R.drawable.ic_launcher_background));
        adapter=new A43647_T3_Adapter(A43647ls,this);
        A43647lv.setAdapter(adapter);
    }
}