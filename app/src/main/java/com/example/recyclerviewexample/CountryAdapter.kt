package com.example.recyclerviewexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CountryAdapter : RecyclerView.Adapter<CountryViewHolder>() {

    private val mItems: MutableList<Country> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_country, parent, false)

        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int = mItems.size

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(mItems[position])
    }

    fun submitItems(items: List<Country>) {
        mItems.clear()
        mItems.addAll(items)
        notifyDataSetChanged()
    }
}