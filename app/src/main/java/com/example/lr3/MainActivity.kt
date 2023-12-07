package com.example.lr3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lr3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val etName = binding.etName
        val authBtn = binding.btnOpen

        authBtn.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            if (etName.text.isNotEmpty()) {
                intent.putExtra("name", etName.text.toString())
            }
            startActivity(intent)
        }
    }
}
