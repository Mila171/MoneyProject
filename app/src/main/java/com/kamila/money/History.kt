package com.kamila.money

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.kamila.money.databinding.ActivityCatalogBinding
import com.kamila.money.databinding.ActivityHistoryBinding

class History : AppCompatActivity() {
    private lateinit var binding: ActivityHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        binding= ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.history.setOnClickListener{
            startActivity(Intent(this,Cards::class.java))
        }
    }
}