package com.yucox.kotlinintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yucox.kotlinintent.databinding.ActivityMainBinding
import com.yucox.kotlinintent.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //getIntent
        val intent = getIntent()
        val name = intent.getStringExtra("username")
        if(name != null){
            binding.welcomeTextNext.text = "Malatya Aşıkları Fan Kulübüne Hoş geldin : $name !"
        }else{
            binding.welcomeTextNext.text = "Malatya Aşıkları Fan Kulübüne Hoş geldin!"
        }
    }
}