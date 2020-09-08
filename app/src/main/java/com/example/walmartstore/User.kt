package com.example.walmartstore

class User {
    var firstname:String=""
    var lastname:String=""
    var username:String=""
    var password:String=""
    constructor (email:String,password:String)
    {
        this.username=email;
        this.password=password
    }

    constructor(firstname: String, lastname: String, username: String, password: String) {
        this.firstname = firstname
        this.lastname = lastname
        this.username = username
        this.password = password
    }


}