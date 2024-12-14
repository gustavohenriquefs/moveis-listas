package com.example.animalapp

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView

class VideoPlayerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val videoRes = intent.getIntExtra("videoRes", R.raw.video_fox)

            Column (
                modifier = Modifier.padding(
                    top = 16.dp,
                    bottom = 16.dp
                )
            ) {
                Button(
                    modifier = Modifier.padding(
                        top = 16.dp,
                        bottom = 16.dp
                    ),
                    onClick = {
                        finish()
                    }) {
                    Text("Voltar")
                }
            }

            AndroidView(
                factory = { context ->
                    VideoView(context).apply {
                        setVideoURI(Uri.parse("android.resource://$packageName/$videoRes"))
                        start()
                    }
                },
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}