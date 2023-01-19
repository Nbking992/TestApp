package com.cursokotlin_2023.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cursokotlin_2023.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    fun emptyVal(){
        if(binding.eBox.text.isNotEmpty()){
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("INTENT_NAME",binding.eBox.text)
            startActivity(intent)
        }else{
            showErrorName()
        }
    }

    fun showErrorName(){
        Toast.makeText(this, "El nombre de usuario no puede ser vacio", Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGo.setOnClickListener{ emptyVal() }
    }
}