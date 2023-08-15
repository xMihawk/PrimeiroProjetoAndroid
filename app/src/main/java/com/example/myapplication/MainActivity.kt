package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button1: Button = findViewById(R.id.button)
        button1.setOnClickListener {
            Toast.makeText( this, "Clicou no botao", Toast.LENGTH_LONG).show()
        }
    }
}