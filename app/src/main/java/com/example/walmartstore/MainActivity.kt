package com.example.walmartstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var user1:User= User("hisham","qan","h_q@gmail.com","212121")
        var user2:User= User("ahmed","ramy","ahmed_q@gmail.com","32222")
        var user3:User= User("emy","john","emy_q@gmail.com","2323232")
        var user4:User= User("wulem","qan","wulem_q@gmail.com","6666666")
        var user5:User= User("hussam","qan","hussam_q@gmail.com","555555")
        var arrayList=ArrayList<User>()
        arrayList.add(user1)
        arrayList.add(user2)
        arrayList.add(user3)
        arrayList.add(user4)
        arrayList.add(user5)



        singin.setOnClickListener {
// Change the Label Text
            Toast.makeText(this, "Hi there! This is a Toast.", Toast.LENGTH_LONG).show()

        }
    }


}