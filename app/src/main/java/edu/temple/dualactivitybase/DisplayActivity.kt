package edu.temple.dualactivitybase


import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DisplayActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)


        val songImageView: ImageView = findViewById(R.id.songImage)
        val songTitleTextView: TextView = findViewById(R.id.songTitle)
        val closeButton: Button = findViewById(R.id.closeButton)


        val song = intent.getParcelableExtra<Song>("song")


        if (song != null) {
            songImageView.setImageResource(song.imageResource)
            songTitleTextView.text = song.title
        }


        // Close button to finish the activity
        closeButton.setOnClickListener {
            finish()
        }
    }
}
