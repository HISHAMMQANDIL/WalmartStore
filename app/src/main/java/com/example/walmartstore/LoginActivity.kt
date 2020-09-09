package com.example.walmartstore

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
//import com.example.ecommerce.Prevalent.Prevalent
//import com.example.ecommerce.Model.Users
//import com.firebase.ui.auth.data.model.User
//import com.google.firebase.database.*
//import io.paperdb.Paper

@Suppress("DEPRECATION")
class LoginActivity : AppCompatActivity() {

    private lateinit var InputPassword: EditText
    private lateinit var InputUserName: EditText
    private lateinit var LoginButton: Button
    private lateinit var loadingBar: ProgressDialog
    private lateinit var checkBoxRememberMe: CheckBox
    private lateinit var UserLink: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        LoginButton = findViewById(R.id.login_btn)
//        InputPhoneNumber = findViewById(R.id.login_phone_number_input)
//        InputPassword = findViewById(R.id.login_password_input)
//        AdminLink = findViewById(R.id.admin_panel_link)
//        UserLink = findViewById(R.id.not_admin_panel_link)
//        loadingBar = ProgressDialog(this)
//
//        checkBoxRememberMe = findViewById(R.id.remember_me_chk)
//        Paper.init(this)
//
//
//        LoginButton.setOnClickListener{
//            loginUser()
//        }
//
//        AdminLink.setOnClickListener{
//            LoginButton.setText("Login Admin")
//            AdminLink.setVisibility(View.INVISIBLE)
//            UserLink.setVisibility(View.VISIBLE)
//            parentDbName = "Admins"
//        }
//
//        UserLink.setOnClickListener{
//            LoginButton.setText("Login")
//            AdminLink.setVisibility(View.VISIBLE)
//            UserLink.setVisibility(View.INVISIBLE)
//            parentDbName = "Users"
//        }
//
//
//    }//onCreate
//
//    private fun loginUser() {
//        var phone = InputPhoneNumber.text.toString()
//        var password = InputPassword.text.toString()
//
//        if (TextUtils.isEmpty(phone)){
//            Toast.makeText(this, "Write your phone number... ", Toast.LENGTH_SHORT).show()
//        }
//        else if (TextUtils.isEmpty(password)){
//            Toast.makeText(this, "Write your password... ", Toast.LENGTH_SHORT).show()
//        }
//        else{
//            loadingBar.setTitle("Login Account")
//            loadingBar.setMessage("Please wait, while we validate your information.")
//            loadingBar.setCanceledOnTouchOutside(false)
//            loadingBar.show()
//
//            allowAccessToAccount(phone, password)
//        }
//    }//LoginUser
//
//    private fun allowAccessToAccount(phone: String, password: String) {
//
//        if (checkBoxRememberMe.isChecked){
//            Paper.book().write(Prevalent.UserPhoneKey, phone)
//            Paper.book().write(Prevalent.UserPasswordKey, password)
//        }
//
//        val RootRef: DatabaseReference
//        RootRef = FirebaseDatabase.getInstance().getReference()
//
//        RootRef.addListenerForSingleValueEvent(object: ValueEventListener {
//
//            override fun onDataChange(dataSnapshot: DataSnapshot) {
//
//                //var userData:Users
//                if(dataSnapshot.child(parentDbName).child(phone).exists()){
//                    var usersData = dataSnapshot.child(parentDbName).child(phone).getValue(Users::class.java)
//
//                    if (usersData?.getPhone().equals(phone)){
//                        if (usersData?.getPassword().equals(password)){
//                            if(parentDbName.equals("Admins")){
//                                Toast.makeText(this@LoginActivity, "Admin Login Successful", Toast.LENGTH_SHORT).show()
//                                loadingBar.dismiss()
//                                //Sends user to AdminActivity
//                                val intent = Intent(this@LoginActivity, AdminPanelActivity::class.java)
//                                startActivity(intent)
//                            }
//                            else if(parentDbName.equals("Users")){
//                                Toast.makeText(this@LoginActivity, "Login Successful", Toast.LENGTH_SHORT).show()
//                                loadingBar.dismiss()
//                                //Sends user to HomeActivity
//                                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
//                                Prevalent.currentOnlineUser = usersData!!
//                                startActivity(intent)
//                            }
//
//                        }
//                        else{
//                            Toast.makeText(this@LoginActivity, "Password is Incorrect...", Toast.LENGTH_SHORT).show()
//                            loadingBar.dismiss()
//                        }
//                    }//getPhone if
//
//
//                }
//                else{
//                    Toast.makeText(this@LoginActivity, "Account with this " + phone + " Number does not exist", Toast.LENGTH_SHORT).show()
//                    loadingBar.dismiss()
//                }
//            }
//
//            override fun onCancelled(p0: DatabaseError) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//            })

    }
}
