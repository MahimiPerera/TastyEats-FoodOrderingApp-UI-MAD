package com.example.labexam2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    lateinit var btnorderTea:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        btnorderTea = findViewById(R.id.btn_OrderTeaTime)
    }
    fun buttonClickTea(v: View){
        val intent = Intent(this,MainActivity6::class.java)
        startActivity(intent)
        finish()
    }
}