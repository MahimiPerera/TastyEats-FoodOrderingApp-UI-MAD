package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity10 : AppCompatActivity() {

    lateinit var btnRegisterR:Button
    lateinit var btnLoginR:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        btnRegisterR = findViewById(R.id.btnregister)
        btnLoginR = findViewById(R.id.loginR)

    }

    fun buttonClickRegister(v: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun buttonClickLogin(v: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}