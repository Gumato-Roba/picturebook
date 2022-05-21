package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBookkFour : AppCompatActivity() {
    lateinit var btnPrevious3: Button
    lateinit var btnNext3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_bookk_four)
        btnPrevious3 = findViewById(R.id.btnPrevious3)
        btnPrevious3.setOnClickListener {
            var intent =Intent(this,PictureBookThree::class .java)
            startActivity(intent)
        }
        btnNext3 = findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            var intent = Intent(this,PictureBokFive::class.java)
            startActivity(intent)
        }
        }
        }

