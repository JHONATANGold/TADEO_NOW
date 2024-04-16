package com.example.tadeonow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        val mostrarmasButton = findViewById<Button>(R.id.Bt_mostrarmas_page1)

        mostrarmasButton.setOnClickListener {
            val intent = Intent(this, activity_page2::class.java)
            startActivity(intent)
        }
    }
}