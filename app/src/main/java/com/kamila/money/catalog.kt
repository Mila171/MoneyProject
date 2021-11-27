package com.kamila.money

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class catalog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        val exit = findViewById<LinearLayout>(R.id.history)
        exit.setOnClickListener {
            startActivity(Intent(this,history::class.java))
            finish()
        }
    }
}