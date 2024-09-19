package com.liveness.stylish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.liveliness.stylish.R

class ChooseProdutsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choos_produts)
        val btnNext: View = findViewById(R.id.btnNext1)
        btnNext.setOnClickListener {
            val intent: Intent = Intent(this, ChooseProdutsActivity2::class.java)
            startActivity(intent)
        }
    }
}