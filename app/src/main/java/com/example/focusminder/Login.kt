package com.example.focusminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val navigateToLoginButton = findViewById<TextView>(R.id.registerText)
        navigateToLoginButton.setOnClickListener { // Navigate to login page
            val intent = Intent(this@Login, Register::class.java)
            startActivity(intent)
        }
    }
}