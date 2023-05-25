package com.example.lab12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailActivity : AppCompatActivity() {
	lateinit var binding : ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
			binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

			val greeting = intent.getStringExtra("greeting")
			binding.tvText.text = greeting
    }
}