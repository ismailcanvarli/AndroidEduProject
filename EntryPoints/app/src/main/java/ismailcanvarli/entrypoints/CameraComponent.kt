//Created by canVarli on 12/16/2024

package ismailcanvarli.entrypoints

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

// Default lifecycle observer
// Bu yönetime uygun bir sınıf, yaşam döngüsü olaylarına yanıt vermek
// için bir yaşam döngüsü gözlemcisi olarak işaretlenebilir.
class CameraComponent : DefaultLifecycleObserver {
    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        startCamera()
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        stopCamera()
    }

    fun startCamera() {
        // Camera start
        Log.e("CameraComponent", "Camera start")
    }

    fun stopCamera() {
        // Camera stop
        Log.e("CameraComponent", "Camera stop")
    }
}