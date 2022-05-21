package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBookTwo : AppCompatActivity() {
     lateinit var btnPrevious1: Button
     lateinit var btnNext1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book_two)
        btnPrevious1 = findViewById(R.id.btnPrevious1)
        btnPrevious1.setOnClickListener {
            var intent = Intent(this,PictureBookOne::class.java)
            startActivity(intent)
        }
        btnNext1 = findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            var intent = Intent(this,PictureBookThree::class.java)
            startActivity(intent)
        }
    }
}