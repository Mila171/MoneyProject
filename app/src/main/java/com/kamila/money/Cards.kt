package com.kamila.money

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.kamila.money.databinding.ActivityCardsBinding
import com.kamila.money.databinding.ActivityProfileBinding

class Cards : AppCompatActivity() {
    private lateinit var binding: ActivityCardsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)

        binding= ActivityCardsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cardsOfOtherBanks.setOnClickListener {
            startActivity(Intent(this, Card_second_page::class.java))
        }
    }
}