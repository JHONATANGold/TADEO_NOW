package com.example.tadeonow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Deportes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deportes)

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

        val casaButton = findViewById<ImageButton>(R.id.casa1)

        casaButton.setOnClickListener {
            val intent = Intent(this, Page1::class.java)
            startActivity(intent)
        }

        val disponibilidadButton = findViewById<Button>(R.id.disponibilidad)

        disponibilidadButton.setOnClickListener {
            val intent = Intent(this, DisponibilidadDeportes::class.java)
            startActivity(intent)
        }

        val prestamosButton = findViewById<Button>(R.id.prestamos)

        prestamosButton.setOnClickListener {
            val intent = Intent(this, PrestamosDeportes::class.java)
            startActivity(intent)
        }
        val gymButton = findViewById<Button>(R.id.gym)

        gymButton.setOnClickListener {
            val intent = Intent(this, Gym::class.java)
            startActivity(intent)
        }





    }
}