package com.example.tadeonow

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import  androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iniciarSesionButton = findViewById<Button>(R.id.Bt_inicio_sesion)
        val registrarseButton = findViewById<Button>(R.id.Bt_registrarse)

        iniciarSesionButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        registrarseButton.text = "Registrarse"


        registrarseButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }


}