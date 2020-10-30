package com.example.recyclerviewexample

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row_country.view.*

class CountryViewHolder(
    view: View,
    private val clickListener: ((Country) -> Unit)
) : RecyclerView.ViewHolder(view) {

    fun bind(item: Country) = with(itemView) {
        iv_country.setImageResource(item.image)
        tv_country.text = item.name

        setOnClickListener { clickListener(item) }
    }
}