package com.example.focusminder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity<myDatabase> : AppCompatActivity() {
    private lateinit var database: myDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Room.databaseBuilder(
            applicationContext, myDatabase::class.java, "To_Do"
        ).build()

        add.setOnClickListener {
            val intent = Intent(this, CreateCard::class.java)
            startActivity(intent)
        }

        deleteAll.setOnClickListener {
            GlobalScope.launch {
                database.dao().deleteAll()
                runOnUiThread {
                    setRecycler()
                }
            }
        }

        setRecycler()
    }

    private fun setRecycler() {
        GlobalScope.launch {
            val data = database.dao().getAllData()
            runOnUiThread {
                recycler_view.adapter = Adapter(data)
                recycler_view.layoutManager = LinearLayoutManager(this@MainActivity)
                (recycler_view.adapter as Adapter).notifyDataSetChanged()
            }
        }
    }
}
