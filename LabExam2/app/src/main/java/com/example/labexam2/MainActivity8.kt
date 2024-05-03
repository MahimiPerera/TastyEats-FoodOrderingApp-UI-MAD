package com.example.labexam2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity8 : AppCompatActivity() {
    lateinit var btnnow: Button
    lateinit var btnlater: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        btnnow = findViewById(R.id.btn_PayNow)
        btnlater = findViewById(R.id.btn_PayLater)

    }

    fun buttonClicknow( v: View){

        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
        finish()
    }
    fun buttonClicklater( v: View ){

        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
        finish()
    }


}


