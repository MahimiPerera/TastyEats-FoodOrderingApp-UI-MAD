package com.example.labexam2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    lateinit var btnBreakfast: Button
    lateinit var btnLunch: Button
    lateinit var btnTea: Button
    lateinit var OrderNav: ImageView
    lateinit var OrderProfile: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnBreakfast = findViewById(R.id.btn_Breakfast)
        btnLunch = findViewById(R.id.btn_Lunch)
        btnTea = findViewById(R.id.btn_TeaTime)
        OrderNav = findViewById(R.id.OrderNav)
        OrderProfile = findViewById(R.id.ProfileNav)
    }

    fun buttonClickBreakfast(v: View){
        val intent = Intent(this,MainActivity3::class.java)
        startActivity(intent)
        finish()
    }
    fun buttonClickLunch(v: View){
        val intent = Intent(this,MainActivity4::class.java)
        startActivity(intent)
        finish()
    }
    fun buttonClickTea(v: View){
        val intent = Intent(this,MainActivity5::class.java)
        startActivity(intent)
        finish()
    }
    fun navOrder(v: View){
        val intent = Intent(this,MainActivity7::class.java)
        startActivity(intent)
        finish()
    }
    fun navProfile(v: View){
        val intent = Intent(this,MainActivity9::class.java)
        startActivity(intent)
        finish()
    }

}