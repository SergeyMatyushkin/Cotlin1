package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.button_java).setOnClickListener {
            startActivity(Intent(this, JavaActivity::class.java))
        }
       findViewById<View>(R.id.button_kotlin).setOnClickListener {
           startActivity(Intent(this, KotlinActivity::class.java))
       }

        val x = 4 - PI

    }

}