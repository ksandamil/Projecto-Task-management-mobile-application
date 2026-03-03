package com.example.lab2exam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the button by ID
        val getStartedBtn = findViewById<Button>(R.id.button4)

        // Navigate to Login Activity when clicked
        getStartedBtn.setOnClickListener {
            val intent = Intent(this, login::class.java) // ✅ Correct class name
            startActivity(intent)
            // Optional: close onboarding so user can't go back
            // finish()
        }
    }
}
