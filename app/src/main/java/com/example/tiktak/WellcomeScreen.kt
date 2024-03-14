package com.example.tiktak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tiktak.databinding.ActivityWellcomeScreenBinding

class WellcomeScreen : AppCompatActivity() {
    private lateinit var binding: ActivityWellcomeScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize data binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_wellcome_screen)

        // Set click listener for the button
        binding.playerbtn.setOnClickListener {
            // Create an intent to navigate to MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.computerbtn.setOnClickListener {
            // Create an intent to navigate to MainActivity
            val intent = Intent(this, Computerlogic::class.java)
            startActivity(intent)
        }
    }
}
