package com.kamila.money

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class money : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_money)

        val exit = findViewById<images>(R.id.catalog)
        exit.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}