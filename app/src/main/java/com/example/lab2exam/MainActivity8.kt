package com.example.lab2exam

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        bottomNav.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.nav_home -> {
                    startActivity(Intent(this, MainActivity5::class.java))
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
                    true // Already on Profile
                }
                else -> false
            }
        }
    }
}
