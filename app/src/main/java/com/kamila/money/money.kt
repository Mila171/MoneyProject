package com.kamila.money

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class money : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_money)

        val exit = findViewById<LinearLayout>(R.id.catalog)
        exit.setOnClickListener {
            startActivity(Intent(this,catalog::class.java))
            finish()
        }

    }
}