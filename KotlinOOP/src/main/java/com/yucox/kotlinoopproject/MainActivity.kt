package com.yucox.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name : String = "Merhaba"
        //Burada String sınıfından bir obje oluşturduk.

        //user sınıfından, myUser isimli bir obje oluşturduk.
        var myUser = User("Hasan",48)
        //constructor'ı bir değer girimini zorunlu kılmak için kullanıyoruz
        //Kullanmama durumumuzda bir takım sorunlarla karşılaşabiliriz, örneğin :
        //Bir değer girmedik ve girmediğimiz değer ile bir sayıyı çarpmaya çalıştık, yani (null * 2)
        //bu bize problem yaratacaktır.
        println(myUser.age.toString())
        println(myUser.name)

        var musician = Musician("Mehmet","Guitar",21)
        //musician.age = 31 ---> bunu kullanamayız çünkü, private set, get metodunu kullandık
        //fakat aşağıda göreceğiniz gibi bunu okuyabiliriz(yazdırabiliriz)
        println(musician.age)
        println(musician.returnbandName("Saz"))


    }
}