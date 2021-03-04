package com.example.open_close_recyclerview.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.open_close_recyclerview.R
import com.example.open_close_recyclerview.view.adapter.MainAdapter
import com.example.open_close_recyclerview.model.Model1
import com.example.open_close_recyclerview.model.Model2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MainAdapter()
        adapter.submitList(listOf(
            Model1("user1"), Model2("user2"), Model1("user3")
        ))
        mainRecyclerView.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        mainRecyclerView.adapter = adapter
    }
}