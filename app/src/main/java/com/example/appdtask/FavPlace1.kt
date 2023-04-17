package com.example.appdtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FavPlace1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fav_place1)
        val buttongo = findViewById<Button>(R.id.button2)
        buttongo.setOnClickListener{
            val intent1 = Intent(this@FavPlace1,Favplace2::class.java)
            startActivity(intent1)
            finish()
        }
    }

}