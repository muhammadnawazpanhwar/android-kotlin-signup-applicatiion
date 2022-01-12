package com.example.sign_up_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.util.Linkify
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val user_name=intent.getStringExtra("user_name")
        val email=intent.getStringExtra("Email")
        val password=intent.getStringExtra("Password")
        val phone=intent.getStringExtra("Phone")
        val address=intent.getStringExtra("Address")

        val R_User_name=findViewById<TextView>(R.id.received_User_name_tv)
        val R_Email=findViewById<TextView>(R.id.received_Email_tv)
        val R_Password=findViewById<TextView>(R.id.received_Password_tv)
        val R_Phone=findViewById<TextView>(R.id.received_Phone_tv)
        val R_Address=findViewById<TextView>(R.id.received_Address_tv)

        R_User_name.text="User Name ="+user_name
        R_User_name.setText(user_name)
        Linkify.addLinks(R_User_name,Linkify.WEB_URLS);

        R_Email.text="Your Email = "+email
        R_Email.setText(email)
        Linkify.addLinks(R_Email,Linkify.EMAIL_ADDRESSES);


        R_Password.text="Your Password = :"+password

        R_Phone.text=" Your Phone = "+phone
        R_Phone.setText(phone)
        Linkify.addLinks(R_Phone,Linkify.PHONE_NUMBERS);

        R_Address.text="Your Location="+address
        R_Address.setText(address)
        Linkify.addLinks(R_Address,Linkify.MAP_ADDRESSES);
    }
}