package com.example.lab12

class TestActivity : AppcompatActivity() {
	lateinit var binding : ActivityTestBinding
		override fun onCreate(savedInstanceState:Bundle?){
			super.onCreate(savedInstanceState)
			binding = ActivityTestBinding.inflate(layoutInflater)
			setContentView(binding.root)

			
}