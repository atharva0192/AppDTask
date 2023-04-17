package com.example.appdtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FavPlace3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fav_place3)
        val buttonback = findViewById<Button>(R.id.button3)
        buttonback.setOnClickListener{
            val intent2 = Intent(this@FavPlace3,Favplace2::class.java)
            startActivity(intent2)
            finish()
        }

    }
}