package nl.mpcjanssen.simpletask


import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Logger.info(TAG, "Executing Alarm callback")

        // Update UI (widgets and main screen)
        TodoApplication.app.localBroadCastManager.sendBroadcast(Intent(Constants.BROADCAST_UPDATE_UI))
    }

    companion object {
        private val TAG = AlarmReceiver::class.java.simpleName
    }
}
