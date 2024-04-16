package com.example.tadeonow

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Use your main layout here

        // Find the buttons by their IDs
        val iniciarSesionButton = findViewById<Button>(R.id.Bt_inicio_sesion)
        val registrarseButton = findViewById<Button>(R.id.Bt_registrarse) // Assuming the button ID is Bt_registrarse

        // Set click listener for iniciarSesionButton (unchanged)
        iniciarSesionButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // Set text for registrarseButton directly (without string resource)
        registrarseButton.text = "Registrarse" // Hardcoded text

        // Set click listener for registrarseButton to navigate to RegisterActivity
        registrarseButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java) // Assuming RegisterActivity exists
            startActivity(intent)
        }
    }
}