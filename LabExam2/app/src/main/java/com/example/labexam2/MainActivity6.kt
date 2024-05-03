//package com.example.labexam2
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//
//class MainActivity6 : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//
//        lateinit var btnplaceOrd: Button
//
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main6)
//        btnplaceOrd = findViewById(R.id.btn_PayNow)
//    }
//
//    fun buttonClickPlaceOrder(v: View){
//        val intent = Intent(this,MainActivity7::class.java)
//        startActivity(intent)
//        finish()
//    }
//}

package com.example.labexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity6 : AppCompatActivity() {

    lateinit var btnplaceOrd: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        btnplaceOrd = findViewById(R.id.btn_PlaceOrder)
    }
    fun buttonClickPlaceOrder(v: View){
        val intent = Intent(this,MainActivity7::class.java)
        startActivity(intent)
        finish()
    }
}