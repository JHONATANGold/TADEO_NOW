package com.example.tadeonow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val volverButton = findViewById<Button>(R.id.Bt_volver)

        volverButton.setOnClickListener {
            // Finish this activity to go back to MainActivity
            finish()
        }
    }
}