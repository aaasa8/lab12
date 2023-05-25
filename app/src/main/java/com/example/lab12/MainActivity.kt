package com.example.lab12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
	latinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
			binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
			binding.button.setOnClickListener{
				val intent = Intent(this, TestActivity::class.java)
				startActivity(intent)
			}
    }
}