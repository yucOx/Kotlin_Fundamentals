package com.yucOx.KotlinDenemeleri2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Void, Unit anlamına geliyor
    }

    fun ismiDegistir(view : View) {
        println("degistire basıldı")
        var clickcount = 0
        //xmlde yaptıgımız islemleri(button,text v.s) burada göstermek icin bunu kullanıyoruz.
        //binding sonrası tek tek tanımlamaya gerek kalmayacak.

        var textview = findViewById<TextView>(R.id.dnme)
        textview.text = "bird could die be careful"
        var mybutton = findViewById<Button>(R.id.button)
        mybutton.text = "this was joke, if you do one more time bird will.."
        mybutton.setOnClickListener {
            if(clickcount == 0){
                textview.text = "bird.."
            }
            clickcount++
            if(clickcount == 1) {
                mybutton.text = "The bird die"
            }
            if(clickcount == 2){
                mybutton.text = "The bird die.. u cant do anything"
            }
        }

    }
}