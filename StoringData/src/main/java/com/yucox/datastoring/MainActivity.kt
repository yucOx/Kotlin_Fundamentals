package com.yucox.datastoring

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yucox.datastoring.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var sharedPreferences: SharedPreferences
    var agefromPreferences : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // SharedPreferences Initialize
        sharedPreferences = this.getSharedPreferences("com.yucox.datastoring", MODE_PRIVATE)

        // eğer ki "age" anahtarında bir değer yoksa geriye -1 döndürülür.
        agefromPreferences = sharedPreferences.getInt("age",-1)
        if(agefromPreferences == -1){
            binding.textView.text = "Your age :"
        } else{
            binding.textView.text = "Your age : $agefromPreferences"
        }
    }

    fun save(view : View){
        //SharedPreferences
        // Bir iki tane veriyi kaydetmek için kullanışlı ve hızlı, fakat büyük veriler için durum tam tersi
        //Örnek olarak; highscore, yaş v.s

        var age = binding.age.text.toString().toIntOrNull()
        if(age != null){
            binding.textView.text = "Your age : $age"
            sharedPreferences.edit().putInt("age",age).apply()

        }else{
            binding.textView.text = "enter a normal value"
        }
    }
    fun delete(view : View){
        if(agefromPreferences != -1){
            sharedPreferences.edit().remove("age").apply()
        }
    }
}