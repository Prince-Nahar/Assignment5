package edu.temple.dualactivitybase

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SongAdapter(private val context: Context, private val songList: List<Song>) :
    RecyclerView.Adapter<SongAdapter.SongViewHolder>() {

    class SongViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val songImage: ImageView = view.findViewById(R.id.songImageView)
        val songTitle: TextView = view.findViewById(R.id.songTitleTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.song_item, parent, false)
        return SongViewHolder(view)
    }

    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song = songList[position]
        holder.songTitle.text = song.title
        holder.songImage.setImageResource(song.imageResource)

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DisplayActivity::class.java)
            intent.putExtra("song", song) // Passing the song object to DisplayActivity
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return songList.size
    }
}