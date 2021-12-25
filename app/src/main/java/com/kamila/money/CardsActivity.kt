package com.kamila.money

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kamila.money.databinding.ActivityCardSecondPageBinding
import com.kamila.money.databinding.ActivityCardsBinding

class CardsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCardsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)

        binding= ActivityCardsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav)

        val mOnNavigationItemSelectedListener =
            BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.purse -> {
                        startActivity(Intent(this, MoneyActivity::class.java))
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.catalog -> {
                        startActivity(Intent(this, CatalogActivity::class.java))
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.history -> {
                        startActivity(Intent(this, HistoryActivity::class.java))
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.cards -> {
                        startActivity(Intent(this, CardsActivity::class.java))
                        return@OnNavigationItemSelectedListener true
                    }
                }
                false
            }
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}