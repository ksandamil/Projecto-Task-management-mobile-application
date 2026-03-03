package com.example.lab2exam

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.nav_home -> {
                    startActivity(Intent(this, MainActivity5::class.java))
                    true
                }
                R.id.nav_task -> {
                    true // Already on Task
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
