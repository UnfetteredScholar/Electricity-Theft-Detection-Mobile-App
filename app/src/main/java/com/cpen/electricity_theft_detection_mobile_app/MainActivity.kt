package com.cpen.electricity_theft_detection_mobile_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var loginBtn : Button = findViewById(R.id.loginButton)

        loginBtn.setOnClickListener {
            this.ValidateUser()
        }
    }


    fun ValidateUser(){
        var id = findViewById<EditText>(R.id.employeeID)
        var password = findViewById<EditText>(R.id.employeePassword)

        if (id.text.trim().toString().equals("admin")) {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        else
        {
//            Toast.makeText(this@MainActivity,"Invalid Credentials", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@MainActivity,"Invalid Credentials", Toast.LENGTH_SHORT).show()

        }
    }
}