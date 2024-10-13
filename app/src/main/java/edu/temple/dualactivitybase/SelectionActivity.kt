package edu.temple.dualactivitybase


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager


class SelectionActivity : AppCompatActivity() {


    val recyclerView: RecyclerView by lazy {
        findViewById(R.id.recyclerView)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Create a list of Song objects
        val songs = listOf(
            Song("A Bar Song (Tipsy)", R.drawable.first),
            Song("Birds Of A Feather", R.drawable.second),
            Song("Timeless", R.drawable.third),
            Song("I Had Some Help", R.drawable.fourth),
            Song("Espresso", R.drawable.fifth),
            Song("Die With A Smile", R.drawable.sixth),
            Song("Good Luck, Babe!", R.drawable.seventh),
            Song("Lose Control", R.drawable.eighth),
            Song("Taste", R.drawable.nineth),
            Song("Please Please Please", R.drawable.tenth)
        )


        // Set up RecyclerView with the adapter
        val staggeredGridLayoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = staggeredGridLayoutManager

        // Set the adapter
        recyclerView.adapter = SongAdapter(this, songs)
    }
}
