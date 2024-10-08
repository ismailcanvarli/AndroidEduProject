package com.example.helloandroid

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.helloandroid.ui.SecondActivity

class MainActivity : AppCompatActivity() {
    // İlk çalışan metot
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity", "onCreate1")
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "onCreate2")

        // Yeni buton ile başka bir aktiviteye geçiş
        val btnOpenSecondActivity = findViewById<Button>(R.id.btnOpenSecondActivity)
        btnOpenSecondActivity.setOnClickListener {
            val intent = android.content.Intent(this, SecondActivity::class.java)
            // Intent ile veri gönderdik
            intent.putExtra("key", "value")

            // bundle ile veri gönderdik
            val bundle = Bundle()
            bundle.putString("key1", "value1")
            intent.putExtras(bundle)

            startActivity(intent)
        }
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