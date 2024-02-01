package com.example.myapplicationnopmuon.Tuan2.A43647

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.myapplicationnopmuon.R

class A43647KLMainActivity : AppCompatActivity() {
    var A43647txt1:EditText? = null;
    var A43647txt2:EditText? = null;
    var A43647btn1:Button? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a43647_klmain)
        A43647txt1=findViewById(R.id.A43647KLtxt1)
        A43647txt2=findViewById(R.id.A43647KLtxt2)
        A43647btn1=findViewById(R.id.A43647KLbtn1)
        A43647btn1!!.setOnClickListener(View.OnClickListener {
            var i=Intent(this@A43647KLMainActivity, A43647secondMainActivity::class.java);
            i.putExtra("so1", A43647txt1.toString())
            i.putExtra("so2",A43647txt2.toString())
            startActivity(i);
        })
    }
}