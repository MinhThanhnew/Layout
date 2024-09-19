package com.liveness.stylish

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.liveliness.stylish.R

class TrendingProductsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trending_products)
        val btnNext: View = findViewById(R.id.shopping)
        btnNext.setOnClickListener {
            val intent: Intent = Intent(this, ShopPageActivity::class.java)
            startActivity(intent)
        }
    }
}