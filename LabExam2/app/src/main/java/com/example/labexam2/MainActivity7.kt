package com.example.labexam2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity7 : AppCompatActivity() {
    lateinit var btnPay: Button
    lateinit var homeNavigation: ImageView
    lateinit var profileNavigation: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        btnPay = findViewById(R.id.btn_Pay)
        homeNavigation = findViewById(R.id.homeNavigation)
        profileNavigation = findViewById(R.id.profileNavigation)
    }
    fun buttonClickPay(v: View){
        val intent = Intent(this,MainActivity8::class.java)
        startActivity(intent)
        finish()
    }
    fun homeNavigation(v: View){
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
        finish()
    }
    fun profileNavigation(v: View){
        val intent = Intent(this,MainActivity9::class.java)
        startActivity(intent)
        finish()
    }
}