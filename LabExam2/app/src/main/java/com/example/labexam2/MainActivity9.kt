package com.example.labexam2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity9 : AppCompatActivity() {
    lateinit var btnEdit: Button
    lateinit var btnSave: Button
    lateinit var homeNavig: ImageView
    lateinit var orderNavig: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        btnEdit = findViewById(R.id.btnEdit)
        btnSave = findViewById(R.id.btnsave)
        homeNavig = findViewById(R.id.homeNavig)
        orderNavig = findViewById(R.id.orderNavig)
    }
    fun buttonClickEdit(v: View){
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
        finish()
    }
    fun buttonClickSaveF(v: View){
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
        finish()
    }
    fun homeNavig(v: View){
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
        finish()
    }
    fun orderNavig(v: View){
        val intent = Intent(this,MainActivity7::class.java)
        startActivity(intent)
        finish()
    }
}