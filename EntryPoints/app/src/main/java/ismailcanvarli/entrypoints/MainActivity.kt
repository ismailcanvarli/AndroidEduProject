package ismailcanvarli.entrypoints

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var buttonOpenSettingsActivity: Button

    private val cameraComponent = CameraComponent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("MainActivity", "onCreate1")
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "onCreate2")

        // Bu şekilde cameraComponent sınıfı oluşturulduğunda yaşam döngüsü
        // yöneticisi olarak eklenmiş olur.
        lifecycle.addObserver(cameraComponent)

        buttonOpenSettingsActivity = findViewById<Button>(R.id.buttonOpenSettingsActivity)
        buttonOpenSettingsActivity.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy")
        lifecycle.removeObserver(cameraComponent)
    }

    // Buradan sonraki fonskiyonlar ekstra olarak eklendi.

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("MainActivity", "onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i("MainActivity", "onRestoreInstanceState")
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        Log.i("MainActivity", "onUserLeaveHint")
    }

    override fun onUserInteraction() {
        super.onUserInteraction()
        Log.i("MainActivity", "onUserInteraction")
    }

    // Bu şekilde public bir fonksiyon oluşturulduğunda test edilebilir.
    fun testFunction() {
        Log.i("MainActivity", "testFunction")
    }

    fun testFunction2(name: String?, surName: String?): String {
        return "$name $surName"
    }
}