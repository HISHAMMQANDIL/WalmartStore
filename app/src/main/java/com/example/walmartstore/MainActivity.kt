package com.example.walmartstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.ecommerce.Model.Users
import com.example.ecommerce.RegisterActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var user1: Users = Users("hisham", "qan", "h_q@gmail.com", "212121")
        var user2: Users = Users("ahmed", "ramy", "ahmed_q@gmail.com", "32222")
        var user3: Users = Users("emy", "john", "emy_q@gmail.com", "2323232")
        var user4: Users = Users("wulem", "qan", "wulem_q@gmail.com", "6666666")
        var user5: Users = Users("hussam", "qan", "hussam_q@gmail.com", "555555")
        var arrayList = ArrayList<Users>()
        arrayList.add(user1)
        arrayList.add(user2)
        arrayList.add(user3)
        arrayList.add(user4)
        arrayList.add(user5)

        var password = findViewById(R.id.password) as EditText
        var username = findViewById(R.id.username) as EditText

        singin.setOnClickListener {
// Change the Label Text
            arrayList.forEach(System.out::print)

//            arrayList.contains(userName.text.toString().equals(arrayList))
            for (user in arrayList) {
               if ({username.text}.equals(user.getUserName()) && {password.text}
                        .equals(user.getPassword())
                ) {
                   Toast.makeText(applicationContext,"this is toast message ${user.getUserName()}   ${user.getPassword()} ",Toast.LENGTH_SHORT).show()

                   val intent = Intent(this, RegisterActivity::class.java)
                    startActivity(intent)

                }
            }
        }

    }
}