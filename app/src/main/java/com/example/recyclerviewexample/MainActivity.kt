package com.example.recyclerviewexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_country.layoutManager = LinearLayoutManager(this)

        val adapter = CountryAdapter()

        rv_country.adapter = adapter

        val items = listOf(
            Country(image = R.drawable.ic_launcher_background, name = "Indonesia"),
            Country(image = R.drawable.ic_launcher_background, name = "Vietnam"),
            Country(image = R.drawable.ic_launcher_background, name = "Singapore"),
            Country(image = R.drawable.ic_launcher_background, name = "Thailand"),
            Country(image = R.drawable.ic_launcher_background, name = "Malaysia")
        )

        adapter.submitItems(items)
    }
}