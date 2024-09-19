package com.liveness.stylish

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.liveliness.stylish.R

class SignUpActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val btnNext: View = findViewById(R.id.action_wishlist)
        btnNext.setOnClickListener {
            val intent: Intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}