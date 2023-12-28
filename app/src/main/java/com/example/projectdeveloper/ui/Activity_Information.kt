package com.example.projectdeveloper.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.projectdeveloper.R

class activity_Information : AppCompatActivity() {
    lateinit var retour:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)
        retour = findViewById(R.id.retoure)
        retour.setOnClickListener{
            var intent = Intent(this,PageHome::class.java)
            startActivity(intent)
        }
    }
}