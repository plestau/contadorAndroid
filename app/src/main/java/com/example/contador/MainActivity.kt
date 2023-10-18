package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val texto = findViewById<TextView>(R.id.contador)
        val boton = findViewById<Button>(R.id.button)
        var contador = 0
        boton.setOnClickListener {
            contador++
            texto.text = contador.toString()
        }
    }
}