package com.example.lr3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lr3.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {

    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.extras?.getString("name")
        binding.tvName.text = name ?: "Имя не задано"
    }
}