package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var etEmail:TextInputEditText
    lateinit var etpassword:TextInputEditText
    lateinit var etbutton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login()
        onclick()
    }
    fun login(){
        etEmail=findViewById(R.id.etEmail)
        etpassword=findViewById(R.id.etpassword)
        etbutton=findViewById(R.id.etbutton)
    }
    fun onclick(){
        etbutton.setOnClickListener {
            var Login=Intent(baseContext,Signupactivity::class.java)
            startActivity(Login)
        }
    }
}