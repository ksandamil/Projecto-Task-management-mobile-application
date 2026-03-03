package com.example.lab2exam

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.button.MaterialButton
import android.widget.Button

class MainActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)

        // Handle system bars padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // New Task Button -> Navigate to Task Page (MainActivity6)
        val btnNewTask = findViewById<MaterialButton>(R.id.btnNewTask)
        btnNewTask.setOnClickListener {
            startActivity(Intent(this, MainActivity6::class.java))
        }

        // Button6 -> Navigate to MainActivity10
        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            startActivity(Intent(this, MainActivity10::class.java))
        }

        // Bottom Navigation
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.nav_home -> {
                    // Already on Home
                    true
                }
                R.id.nav_task -> {
                    startActivity(Intent(this, MainActivity6::class.java))
                    true
                }
                R.id.nav_search -> {
                    startActivity(Intent(this, MainActivity7::class.java))
                    true
                }
                R.id.nav_profile -> {
                    startActivity(Intent(this, MainActivity8::class.java))
                    true
                }
                else -> false
            }
        }
    }
}
