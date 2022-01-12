package com.example.sign_up_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val User_name_et = findViewById<EditText>(R.id.user_name_et)
        val Email_et = findViewById<EditText>(R.id.Email_et)
        val Password_et = findViewById<EditText>(R.id.Password_et)
        val Phone_et = findViewById<EditText>(R.id.Phone_et)
        val Address_et = findViewById<EditText>(R.id.Address_et)
        val Sign_up_btn=findViewById<Button>(R.id.sign_up_btn)

        Sign_up_btn.setOnClickListener {
            val User_name=User_name_et.text.toString()
            val Email=Email_et.text.toString()
            val Password=Password_et.text.toString()
            val Phone=Phone_et.text.toString()
            val Address=Address_et.text.toString()
            if(User_name.isEmpty()&& Email.isEmpty()&&Password.isEmpty()&&Phone.isEmpty()
                &&Address.isEmpty()){
                Toast.makeText(this, "fill all above feild", Toast.LENGTH_SHORT).show()
            }
             else{
                val intent=Intent(this@MainActivity,SecondActivity::class.java)
                intent.putExtra("user_name",User_name)
                intent.putExtra("Email",Email)
                intent.putExtra("Password",Password)
                intent.putExtra("Phone",Phone)
                intent.putExtra("Address",Address)
                startActivity(intent)
            }
        }


    }
}