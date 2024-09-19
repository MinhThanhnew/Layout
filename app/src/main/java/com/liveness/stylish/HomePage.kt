package com.liveness.stylish

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.liveliness.stylish.R

class HomePage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        val btnNext: View = findViewById(R.id.action_wishlist)
        btnNext.setOnClickListener {
            val intent: Intent = Intent(this, TrendingProductsActivity::class.java)
            startActivity(intent)
        }
        val btnImageProfile: View = findViewById(R.id.btn_profile)
        btnImageProfile.setOnClickListener {
            val intent1: Intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent1)
        }
    }
}