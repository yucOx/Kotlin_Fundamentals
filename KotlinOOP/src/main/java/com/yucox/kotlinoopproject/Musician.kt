package com.yucox.kotlinoopproject

class Musician(name: String, instrument: String, age: Int) {

    //Eğer ki burada, constructor kullanmasaydık bunu Encapsulation etmiş olurduk .
    //Bir veri girdisi girebilirdik, bir şey değişmezdi. Fakat herhangi bir değişiklik okuma v.s yapamazdık.
    //Aynı şekilde aşağıdaki herhangi bir değeri 'private' yaparsak yine Encapsulation etmiş olurduk.
    var name : String? = name
    var instrument : String? = instrument
    var age : Int? = age
    private set
    get

    //Eğer değerin değiştirilmesini istemiyorsak, fakat okuma gibi işlemleri yapmak istiyorsak
    //private set
    //get
    //methodunu kullanabiliriz
    private val bandName = "Sazcılar"
    fun returnbandName(password : String) : String {
        if (password == "Saz") {
            return bandName
        }
        else{
            return "Wrong password"
        }
    }
}