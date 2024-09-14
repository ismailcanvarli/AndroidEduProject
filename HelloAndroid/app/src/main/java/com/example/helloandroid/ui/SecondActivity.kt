package com.example.helloandroid.ui

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.helloandroid.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.e("SecondActivity", "onCreate")

        // Intent ile gönderilen veriyi aldık
        val intent = intent
        val key = intent.getStringExtra("key")
        Log.e("SecondActivity", "key: $key")

        // Bundle ile gönderilen veriyi aldık
        val bundle = intent.extras
        val key1 = bundle?.getString("key1")
        Log.e("SecondActivity", "key1: $key1")

    }

    // Uygulama başladığında çalışan metot
    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart")
    }

    // Aktivite kullanıcı ile etkileşime geçtiğinde çalışan metot
    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume")
    }

    // Aktivite kullanıcı ile etkileşime geçmeyi durdurduğunda çalışan metot
    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause")
    }

    // Uygulama arka plana atıldığında çalışan metot
    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop")
    }

    // Uygulama tamamen kapatıldığında çalışan metot
    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy")
    }

    // Uygulama arka plandan tekrar açıldığında çalışan metot
    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "onRestart")
    }

    // Uygulama belleğe alındığında çalışan metot
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("MainActivity", "onSaveInstanceState")

        // Kullanıcıdan alınan veriyi kaydetme işlemi
        val etUserField = findViewById<EditText>(R.id.etUserField)
        val userField = etUserField.text.toString()
        outState.putString("userField", userField)
    }

    // Uygulama bellekten geri yüklendiğinde çalışan metot
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("MainActivity", "onRestoreInstanceState")

        val userField = savedInstanceState.getString("userField")
        val etUserField = findViewById<EditText>(R.id.etUserField)
        etUserField.setText(userField)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        Log.i("MainActivity", "onPostCreate")
    }
}