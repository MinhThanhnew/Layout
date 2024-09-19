package com.liveness.stylish

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.liveliness.stylish.R

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val btnNext: View = findViewById(R.id.btnImageSignUp)
        val btnNext1: View = findViewById(R.id.txtForgotPassword)
        val btnNext2: View = findViewById(R.id.btnLogin)
        btnNext.setOnClickListener {
            val intent: Intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        btnNext1.setOnClickListener {
            val intent1: Intent = Intent(this, ForgotPassWordActivity::class.java)
            startActivity(intent1)
        }
        btnNext2.setOnClickListener {
            val intent2: Intent = Intent(this, GetStarttedActivity::class.java)
            startActivity(intent2)
        }



    }


}