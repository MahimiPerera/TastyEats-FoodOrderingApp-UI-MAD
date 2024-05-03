package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity4 : AppCompatActivity() {

    lateinit var btnorderLunch: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        btnorderLunch = findViewById(R.id.btnOrderLunch)
    }
    fun buttonClickLunch(v: View){
        val intent = Intent(this,MainActivity6::class.java)
        startActivity(intent)
        finish()
    }
}