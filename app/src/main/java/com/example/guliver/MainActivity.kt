package com.example.guliver

import android.content.Intent
import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        val btnEntryHome: Button = findViewById<Button>(R.id.buttonEntrar)

        btnEntryHome.setOnClickListener{
            val i = Intent(this, Dia_a_diaActivity::class.java)
            startActivity(i)
        }
    }
}