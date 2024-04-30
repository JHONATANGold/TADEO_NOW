package com.example.tadeonow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class activity_page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val deportesButton = findViewById<ImageButton>(R.id.deportes1)
        deportesButton.setOnClickListener {
            val intent = Intent(this, Deportes::class.java)
            startActivity(intent)
        }
        val bibliotecaButton = findViewById<ImageButton>(R.id.biblioteca1)
        bibliotecaButton.setOnClickListener {
            val intent = Intent(this, Biblioteca::class.java)
            startActivity(intent)
        }
        val salonesButton = findViewById<ImageButton>(R.id.salones1)

        salonesButton.setOnClickListener {
            val intent = Intent(this, Salones::class.java)
            startActivity(intent)
        }
        val atrasButton = findViewById<ImageButton>(R.id.atras1)

        atrasButton.setOnClickListener {
            val intent = Intent(this, Page1::class.java)
            startActivity(intent)
        }
        val casaButton = findViewById<ImageButton>(R.id.casa1)

        casaButton.setOnClickListener {
            val intent = Intent(this, Page1::class.java)
            startActivity(intent)
        }


    }
}