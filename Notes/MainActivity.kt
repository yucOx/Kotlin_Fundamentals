package com.example.kotlinnotlarvepratik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var yas = 35
        var x = 4
        var y = 5
        // val degeri hicbir zaman degistirilemez.

        //defining step

        val myinteger : Int
        var denemeinteger : Int

        // Initialize edildi. (başlatma değeri verildi)

        myinteger = 4
        denemeinteger = 5

        //normalde bir değer atadığımızda (noktalı) otomatik olarak double tanımlanır--
        //Biz bunu float yapmak istersek sonuna f eklemeliyiz.

        // b'nin üstüne giderek hangi tür olduğuna bakabilirsin
        val a = 3.14f
        val b = 3.14
        println(b)
        var myAge : Double
        myAge = 31.62

        //Numbers Extra
        // Short : 2^(16-1) max. 16 bits 2 byte
        // Byte : 2^(8-1) max. 8 bits 1 byte
        //Int : 2^(32-1) max. 32 bits 4 byte

        val myString = "Mehmet Yücem Aydın"
        val name = "hasan "
        val surname = "kömürcü"
        println(name + surname)
        var total = name + surname
        val mickThomsonName : String = "Mick Thomson"
        println(mickThomsonName)
        println(total.capitalize())

        println("-----Boollean------")
        //Boolean

        var myBoolean : Boolean = true
        myBoolean = false

        var isAlive = true
        println(3 < 4)
        println(6 < 3)
        println(3 == 3)
        println(3 != 5)

        println("-----Conversion------")
        // Conversion

        var myNumber = 5
        var myLong =myNumber.toLong()
        myLong = 3

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger*2)

        println("-----Arrays------")
        //arrays
        val myArray = arrayOf("ahmet","mehmet","hasan")
        myArray[1] = "Mehmet Yücem Aydın"
        for(cama in myArray){
            println(cama)
        }

        var myArrayint = arrayOf(1,2,3,4,5)
        println(myArrayint.joinToString())
        println(myArray.size)

        var mixedArray = arrayOf("selam",5)
        for(i in mixedArray){
            println(i)
        }

        println("-----List-ArrayList------")
        //List - ArrayList

        val mySazcılar = arrayListOf<String>("Umut Akkan","İbrahim Yapar")
        mySazcılar.add("Martin Brıt")
        println(mySazcılar[2])
        mySazcılar.add(0,"Saz")
        //Burada yaptığımız işlemden sonra,
        // ilkini bir sağa kaydırmış olduk.
        println(mySazcılar[0])
        println(mySazcılar[1])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(31)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("selam")
        myMixedArrayList.add(31)
        myMixedArrayList.add(true)
        for(i in myMixedArrayList){
            println(i)
        }

        println("-----Set------")
        //-----Set-----
        //Set'in içinde bir eleman yalnızca bir kez olabilir**

        val myExampleArray = arrayOf(1,2,3,5,6)
        println("First element of array : ${myExampleArray[0]} " +
                "Second one : ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3)
        //Buradaki örnekte sadece 3 tane sayı verecektir,
        //çünkü sette sadece bir tane değer girebiliriz
        println(mySet.size)
        val mySet1 = setOf<String>("selam","selamm","selam")
        println(mySet1.size)

        println("-----Foreach------")
        // -----Foreach------
        //bütün değerlerin içinde tek tek geziyor.
        // it her birini tek tek geziyor (hazır olarak tanımlı, println gibi)
        mySet.forEach { println(it * 5) }

        //hashset eklediğimizde 'add' ile ekleyebiliyoruz.

        val myStringSet = hashSetOf<String>()
        myStringSet.add("Kaya")
        myStringSet.add("Kaya")


        println(myStringSet.size)
        myStringSet.forEach { println(it) }

        println("-----Map-Hashmap------")
        //-----Map - Hashmap-----
        //Key - Value

        val fruitArray = arrayOf("Apple","Banana")
        val calories = arrayOf(100,200)

        println("${fruitArray[0]} : ${calories[0]}")

        val fruitCaloriesMap = hashMapOf<String, Int>()
        fruitCaloriesMap.put("Orange",100)
        fruitCaloriesMap.put("Grape",131)
        println(fruitCaloriesMap["Grape"])

        //Bir dilde class varsa obje odaklıdır.
        val myHashMap = hashMapOf<String,String>()
        myHashMap.put("ahmet","ay")

        val myNewMap = hashMapOf<String,Int>("A" to 5, "B" to 31)
        println(myNewMap["B"])

        //-----Operators-----
        println("-----Opeartor------")

        var number : Int = 4
        number++
        println(number)
        var number2 = 3

        //Switch When
        println("-----Switch - When------")

        var day = 5
        var dayString = ""
        when(day){
            1 -> dayString="Monday"
            2-> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            4 -> dayString = "Thursday"
            5 -> dayString = "Friday"
            6 -> dayString = "Saturday"
            7 -> dayString ="Sunday"
        }
        println(dayString)

        val myArrayOfNumber = arrayListOf<Int>(13,24,35,46,57)


        for(i in myArrayOfNumber){
            println((i / 3) * 5)
        }

        for(b in 0..31){
            println(b)
        }
        var j = 0
        while(j < 10){
            println(j)
            j = j + 1
        }
    }

    }
