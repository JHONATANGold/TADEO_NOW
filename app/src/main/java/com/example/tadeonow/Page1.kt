package com.example.tadeonow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        val mostrarMasButton = findViewById<Button>(R.id.Bt_mostrarmas_page1)

        mostrarMasButton.setOnClickListener {
            val intent = Intent(this, activity_page2::class.java) // Assuming Page2Activity exists
            startActivity(intent)
        }
    }
}