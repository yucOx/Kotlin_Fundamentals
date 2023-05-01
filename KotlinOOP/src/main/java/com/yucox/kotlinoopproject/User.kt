package com.yucox.kotlinoopproject

class User {

    //property
    var name : String? = null
    var age : Int? = null

    //constructor vs init

    constructor(nameInput : String, ageInput : Int){
        //genelde this bir üstteki sınıfa işaret eder.
        this.name = nameInput
        this.age = ageInput
    }
    init{
        println("init")
    }
}