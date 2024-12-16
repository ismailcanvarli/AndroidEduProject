//Created by canVarli on 12/16/2024

package ismailcanvarli.entrypoints

import androidx.lifecycle.Lifecycle.Event
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class CameraComponent2 : LifecycleEventObserver {
    override fun onStateChanged(source: LifecycleOwner, event: Event) {
        when (event) {
            Event.ON_RESUME -> startCamera()
            Event.ON_PAUSE -> stopCamera()
            else -> {

            }
        }
    }

    fun startCamera() {
        // Camera start
    }

    fun stopCamera() {
        // Camera stop
    }
}