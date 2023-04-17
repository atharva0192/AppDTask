package com.example.appdtask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Favplace2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favplace2)
        val buttonnext = findViewById<Button>(R.id.button4)
        buttonnext.setOnClickListener{
            val intent1 = Intent(this@Favplace2,FavPlace3::class.java)
            startActivity(intent1)
            finish()
        }
        val buttonback = findViewById<Button>(R.id.button5)
        buttonback.setOnClickListener{
            val intent2 = Intent(this@Favplace2,FavPlace1::class.java)
            startActivity(intent2)
            finish()
        }


    }
}