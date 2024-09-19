package com.liveness.stylish

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.liveliness.stylish.R

class GetStarttedActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_startted)
        val btnNext: View = findViewById(R.id.btn_getStarted)
        btnNext.setOnClickListener {
            val intent: Intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }
    }
}