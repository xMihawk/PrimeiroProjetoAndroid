package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var button1: Button = findViewById(R.id.button)
//         button1.setOnClickListener {
//             Toast.makeText( this, "Usuario Logado!", Toast.LENGTH_LONG).show()
//         }

    }

    fun proxTela(view: View){
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent);
    }

    fun fechaTela(view: View){
        Toast.makeText(this, "", Toast.LENGTH_LONG).show()
        finish();
    }
}