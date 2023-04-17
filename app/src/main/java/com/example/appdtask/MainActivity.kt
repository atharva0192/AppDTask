package com.example.appdtask

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Rollnum = findViewById<EditText>(R.id.appCompatEditText)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            if (Rollnum.length() != 10) {
                Toast.makeText(this, "ENTER YOUR ROLL NUMBER", Toast.LENGTH_SHORT).show()
            }
            if (Rollnum.length() == 10 ) {
                Toast.makeText(this,"Welcome User",Toast.LENGTH_SHORT).show()

                val intent1 = Intent(this@MainActivity,FavPlace1::class.java)
                startActivity(intent1)
                finish()

            }
            }
    }
}