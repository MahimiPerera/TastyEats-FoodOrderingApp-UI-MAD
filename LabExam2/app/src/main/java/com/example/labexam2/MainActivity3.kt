package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity3 : AppCompatActivity() {

    lateinit var btnorderBreak: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btnorderBreak = findViewById(R.id.btn_OrderBreak)
    }
    fun buttonClickBreakF(v: View){
        val intent = Intent(this,MainActivity6::class.java)
        startActivity(intent)
        finish()
    }
}