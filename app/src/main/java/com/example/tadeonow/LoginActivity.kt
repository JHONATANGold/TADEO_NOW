package com.example.tadeonow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val selfChange = null
        super.onCreate(selfChange)
        setContentView(R.layout.activity_login)

        val entrarButton = findViewById<Button>(R.id.Bt_entrar)

        entrarButton.setOnClickListener {
            val intent = Intent(this, Page1::class.java) // Assuming Page1Activity exists
            startActivity(intent)
        }
    }
}
