package edu.temple.dualactivitybase


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class SelectionActivity : AppCompatActivity() {


    val recyclerView: RecyclerView by lazy {
        findViewById(R.id.recyclerView)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Create a list of Song objects
        val songs = listOf(
            Song("Song 1", R.drawable.first),
            Song("Song 2", R.drawable.second),
            Song("Song 3", R.drawable.third),
            Song("Song 4", R.drawable.fourth),
            Song("Song 5", R.drawable.fifth),
            Song("Song 6", R.drawable.sixth),
            Song("Song 7", R.drawable.seventh),
            Song("Song 8", R.drawable.eighth),
            Song("Song 9", R.drawable.nineth),
            Song("Song 10", R.drawable.tenth)
        )


        // Set up RecyclerView with the adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SongAdapter(this, songs)
    }
}
