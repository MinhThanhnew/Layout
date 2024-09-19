package com.liveness.stylish

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.liveliness.stylish.R

class ProfileActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val btnSave: View = findViewById(R.id.btn_save)
        btnSave.setOnClickListener {
            val intent: Intent = Intent(this, CheckOutActivity::class.java)
            startActivity(intent)
    }
}
}