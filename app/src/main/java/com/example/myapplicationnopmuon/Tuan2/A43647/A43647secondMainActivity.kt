package com.example.myapplicationnopmuon.Tuan2.A43647

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplicationnopmuon.R

class A43647secondMainActivity : AppCompatActivity() {
    var A43647tv1:TextView? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a43647second_main)
        A43647tv1=findViewById(R.id.A43647tv)
        var i1=intent;
        val A43647str1=i1.extras!!.getString("so1");
        val A43647str2=i1.extras!!.getString("so2");
        val A43647so1=A43647str1!!.toFloat();
        val A43647so2=A43647str2!!.toFloat();
        val A43647sum=A43647so1+A43647so2;
        A43647tv1!!.text=A43647sum.toString();
    }
}