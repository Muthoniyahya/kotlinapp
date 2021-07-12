package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.google.android.material.textfield.TextInputEditText

class Signupactivity : AppCompatActivity() {
    lateinit var etName:TextInputEditText
    lateinit var etemail:TextInputEditText
    lateinit var etpassword:TextInputEditText
    lateinit var etphone:TextInputEditText
    lateinit var spgender:Spinner
    lateinit var btnbutton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupactivity)
        signup()
        onclick()
    }
    fun signup(){
        etName=findViewById(R.id.etName)
        etemail=findViewById(R.id.etemail)
        etpassword=findViewById(R.id.etpassword)
        etphone=findViewById(R.id.etphone)
        spgender=findViewById(R.id.spgender)
        btnbutton=findViewById(R.id.btnbutton)
        var gender= arrayOf("choose gender","Male","Female","Other")
        var genderAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,gender)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spgender.adapter=genderAdapter

    }
    fun onclick(){
        btnbutton.setOnClickListener {
           var Back=Intent(baseContext,MainActivity::class.java)
            startActivity(Back)

        }
    }
}