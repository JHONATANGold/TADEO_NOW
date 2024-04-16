package com.example.tadeonow

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Use your main layout here

        // Find the button by its ID (assuming it's Bt_inicio_sesion)
        val iniciarSesionButton = findViewById<Button>(R.id.Bt_inicio_sesion)

        // Set click listener for the button to navigate to LoginActivity
        iniciarSesionButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}