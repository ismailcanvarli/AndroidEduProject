package ismailcanvarli.entrypoints

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingsActivity : AppCompatActivity() {
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_settings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val callBack = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Log.e("SettingsActivity", "handleOnBackPressed")

                counter++
                if (counter <= 1) {
                    Toast.makeText(
                        this@SettingsActivity, "Press back again to exit", Toast.LENGTH_SHORT
                    ).show()
                    isEnabled = false
                }
            }
        }
        onBackPressedDispatcher.addCallback(this, callBack)

        /*
        // Bu fonksiyon eğer açılırsa geri dönüş tuşuna basıldığında tetiklenir.
        override fun onBackPressed() {
            // Geri dönüş tuşuna basıldığında bu fonksiyon tetiklenir.
            super.onBackPressed()
            Log.e("SettingsActivity", "onBackPressed")
        }
        */
    }
}