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
        binding = DataBindingUtil.setContentView(this, R.layout.activity_wellcome_screen)
        binding.playerbtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.computerbtn.setOnClickListener {
            val intent = Intent(this, Computer::class.java)
            startActivity(intent)
        }
    }
}
