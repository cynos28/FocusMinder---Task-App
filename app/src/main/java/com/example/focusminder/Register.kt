package com.example.focusminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val navigateToLoginButton = findViewById<TextView>(R.id.LoginText)
        navigateToLoginButton.setOnClickListener { // Navigate to login page
            val intent = Intent(this@Register, Login::class.java)
            startActivity(intent)
        }

        val navigateToregButton = findViewById<TextView>(R.id.RegisterBtn)
        navigateToregButton.setOnClickListener { // Navigate to login page
            val intent = Intent(this@Register, MainActivity::class.java)
            startActivity(intent)
        }

    }
}