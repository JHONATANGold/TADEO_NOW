package com.example.tadeonow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val entrarButton = findViewById<Button>(R.id.Bt_entrar)

        entrarButton.setOnClickListener {
            val intent = Intent(this, Page1::class.java)
            startActivity(intent)
        }
        val volverButton = findViewById<Button>(R.id.Bt_volver)

        volverButton.setOnClickListener {
            finish()
        }
    }

}