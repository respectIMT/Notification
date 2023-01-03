package imt.respect.notification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.media.RingtoneManager
import android.net.Uri
import android.widget.Toast


class NotificationReceiver : BroadcastReceiver() {
    var mediaPlayer: MediaPlayer? = null

    override fun onReceive(context: Context, intent: Intent) {
        if (mediaPlayer == null ){
            val alert : Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
            mediaPlayer = MediaPlayer()
        }

        Toast.makeText(context, "Click our image", Toast.LENGTH_SHORT).show()
    }
}