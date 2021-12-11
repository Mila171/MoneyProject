package com.kamila.money

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kamila.money.databinding.ActivityMoneyBinding
import com.kamila.money.databinding.ActivityProfileBinding

class Money : AppCompatActivity() {
    private lateinit var binding: ActivityMoneyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        binding= ActivityMoneyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.purse.setOnClickListener {
            startActivity(Intent(this, Catalog::class.java))

            binding.profile.setOnClickListener {
                startActivity(Intent(this, Profile::class.java))

            }
        }
    }
}
