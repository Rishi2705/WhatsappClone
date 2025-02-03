package com.example.whatsappclone

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        var wplist = mutableListOf<Whatsapp>(
            Whatsapp(R.drawable.logo, "Name1", "last message1", "time1"),
            Whatsapp(R.drawable.logo, "Name2", "last message2", "time2"),
            Whatsapp(R.drawable.logo, "Name3", "last message3", "time3"),
        )
        val recycle = findViewById<RecyclerView>(R.id.recycle)
        val adapter = Adapter(wplist)
        recycle.adapter = adapter
        recycle.layoutManager = LinearLayoutManager(this)

    }
}