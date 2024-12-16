//Created by canVarli on 12/16/2024

package ismailcanvarli.entrypoints

import android.content.Intent
import android.widget.Button
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario.launch
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    // Uygulamanın lifecycle'ını test etmek için ActivityScenario kullanılır.
    @Test
    fun testActivity() {
        launch(MainActivity::class.java).use { scenario ->
            scenario.moveToState(Lifecycle.State.STARTED)
        }
    }

    // Burada ise activity'nin recreate edilmesi test edilir.
    // Yani activity'nin yaşam döngüsü başlar biter tekrar başlatılır.
    @Test
    fun testActivity2() {
        launch(MainActivity::class.java).use { scenario ->
            scenario.recreate()
        }
    }

    // Bir aktiviteden diğerine geçiş yapma testi
    @Test
    fun testActivity3() {
        launch(MainActivity::class.java).use { scenario ->
            scenario.onActivity { activity ->
                activity.startActivity(Intent(activity, SettingsActivity::class.java))
            }
        }
    }

    // Bir aktivitideki componentlerin test edilmesi
    @Test
    fun testActivity4() {
        launch(MainActivity::class.java).use { scenario ->
            scenario.onActivity { activity ->
                val buttonOpenSettingsActivity = activity.findViewById<Button>(R.id.buttonOpenSettingsActivity)
                buttonOpenSettingsActivity.performClick()
            }
        }
    }

    // Aktivitede ki public fonksiyonlara ulaşıp test edebiliyoruz.
    @Test
    fun testActivity5() {
        launch(MainActivity::class.java).use { scenario ->
            scenario.onActivity { activity ->
                activity.testFunction()
            }
        }
    }

    @Test
    fun testActivity6() {
        val name = "test"
        val surname = "test2"

        launch(MainActivity::class.java).use { scenario ->
            scenario.onActivity { activity ->
                val result = activity.testFunction2(name, surname)
                assert(result == "test test2")
            }
        }
    }
}