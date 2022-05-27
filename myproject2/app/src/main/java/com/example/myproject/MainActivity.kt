package com.example.myproject

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    val a = 324
    val b = 34


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.b1.setOnClickListener {
            val result = a + b
            bindingClass.tv.text = "$result"
        }
        bindingClass.b2.setOnClickListener {
            val result = a - b
            bindingClass.tv.text = result.toString()
        }
        bindingClass.b3.setOnClickListener {
            val result = a * b
            bindingClass.tv.text = "$result"
        }
        }



    }









