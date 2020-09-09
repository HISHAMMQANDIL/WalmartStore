package com.example.ecommerce.Model

class Users {

    private lateinit var firstName: String
    private lateinit var password: String
    private lateinit var userName: String
    private lateinit var lastName: String

    constructor()

    constructor(name: String, password: String, userName: String, lastName:String) {
        this.firstName = name
        this.password = password
        this.userName = userName
        this.lastName = lastName

    }

    fun getfirstName():String {
        return firstName
    }

    fun getPassword():String {
        return password
    }

    fun getUserName():String {
        return userName
    }

    fun getImage():String {
        return lastName
    }



    fun setFirstName(name:String) {
        this.firstName = name
    }

    fun setPassword(password: String) {
        this.password = password
    }

    fun setLasrName(lastname:String) {
        this.lastName = lastName
    }

    fun setImage(image:String) {
        this.lastName = image
    }



}