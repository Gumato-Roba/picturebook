package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBokFive : AppCompatActivity() {
    lateinit var btnPrevious4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_bok_five)
        btnPrevious4 = findViewById(R.id.btnPrevious4)
        btnPrevious4.setOnClickListener {
            var intent= Intent(this,PictureBookkFour::class.java)
            startActivity(intent)
        }
    }
}