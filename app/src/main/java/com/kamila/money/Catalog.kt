package com.kamila.money

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.kamila.money.databinding.ActivityCatalogBinding
import com.kamila.money.databinding.ActivityMoneyBinding

class Catalog : AppCompatActivity() {
    private lateinit var binding: ActivityCatalogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalog)

        binding= ActivityCatalogBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.catalog.setOnClickListener{
            startActivity(Intent(this,History::class.java))
        }
    }
}