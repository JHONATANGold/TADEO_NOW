package com.example.tadeonow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Page1: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        val mostrarmasButton = findViewById<Button>(R.id.Bt_mostrarmas_page1)
        mostrarmasButton.setOnClickListener {
            val intent = Intent(this, activity_page2::class.java)
            startActivity(intent)
        }

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
        val plan1Button = findViewById<Button>(R.id.Bt_plan1)

        plan1Button.setOnClickListener {
            val intent = Intent(this, Plan1::class.java)
            startActivity(intent)
        }



    }
}