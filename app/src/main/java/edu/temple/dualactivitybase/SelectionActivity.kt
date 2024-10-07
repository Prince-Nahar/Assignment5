package edu.temple.dualactivitybase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class SelectionActivity : AppCompatActivity() {

    val recyclerView : RecyclerView by lazy {
        findViewById(R.id.recyclerView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}