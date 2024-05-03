package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity11 : AppCompatActivity() {


    lateinit var btnGetStarted: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)

        btnGetStarted = findViewById(R.id.btnStart)
    }

    fun buttonClick(v: View){
        val intent = Intent(this,MainActivity10::class.java)
        startActivity(intent)
        finish()
    }

}