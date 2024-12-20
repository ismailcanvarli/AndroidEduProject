package com.ismailcanvarli.basiccomponentsandevents

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var btnPushButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initListener()
    }

    private fun initView() {
        btnPushButton = findViewById<TextView>(R.id.push_btn)
    }

    private fun initListener() {
        btnPushButton.setOnClickListener {
            val intent = Intent(this, ToolTextAndHardcodedString::class.java)
            startActivity(intent)
        }
    }
}