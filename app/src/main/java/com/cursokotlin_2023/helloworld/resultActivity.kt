package com.cursokotlin_2023.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cursokotlin_2023.helloworld.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    fun getAndShowName(){
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")
        binding.tvGreeting.text = "Bienvenido $name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {onBackPressed()}

        getAndShowName()
    }


}

