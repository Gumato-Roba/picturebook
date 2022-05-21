package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBook: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBook = findViewById(R.id.btnBook)
        btnBook.setOnClickListener {
            var intent= Intent(this,PictureBookOne::class.java)
            startActivity(intent)
        }
    }
}