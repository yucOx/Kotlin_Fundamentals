package com.yucox.kotlinintent

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yucox.kotlinintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    //intent, bir aktiviteden diğer aktiviteye geçmemizi sağlar. Ekstra olarak '.putextra' gibi fonklar
    //ile diğer aktiviteye veri aktarabiliriz.

    fun next(view : View){
        val intent = Intent(applicationContext,NextActivity::class.java)
        intent.putExtra("username",binding.kullaniciadi.text.toString())
        startActivity(intent)
        finish()
        //finish kullanmamız durumunda cycledaki önceki aktivite sonlandırılır.
        //LogCat'ten nasıl işlediğine bakabilirsin
    }
    // Android activity lifecycle meselesini anlamak için bıraktığım linke bakabilirsin
    //https://developer.android.com/guide/components/activities/activity-lifecycle
    override fun onResume() {
        super.onResume()
        println("on resume called")
    }

    override fun onPause() {
        super.onPause()
        println("on pause called")
    }

    override fun onStop() {
        super.onStop()
        println("on stop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("on destroy called")
    }
}