package com.kamila.money

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.kamila.money.databinding.ActivityProfileBinding

class Profile : AppCompatActivity() {
    private lateinit var binding:ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cards.setOnClickListener {
            startActivity(Intent(this, Catalog::class.java))

        }
    }
}