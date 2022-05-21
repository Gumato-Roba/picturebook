package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBookThree : AppCompatActivity() {
    lateinit var btnPrevious2: Button
    lateinit var btnNext2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book_three)
        btnPrevious2 = findViewById(R.id.btnPrevious2)
        btnPrevious2.setOnClickListener {
            var intent = Intent(this,PictureBookTwo::class.java)
            startActivity(intent)
        }
        btnNext2 = findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            var intent = Intent(this,PictureBookkFour::class.java)
            startActivity(intent)
        }
    }
}