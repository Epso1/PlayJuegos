package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jugador = findViewById(R.id.button2) as Button

        jugador.setOnClickListener{lanzarNewPLayer()}
    }

    private fun lanzarNewPLayer() {
        val i = Intent(this, NewPlayer::class.java)
        startActivity(i)
    }

}