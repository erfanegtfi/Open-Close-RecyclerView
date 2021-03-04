package com.example.open_close_recyclerview.view.adapter.viewHolders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.open_close_recyclerview.model.Model2
import kotlinx.android.synthetic.main.list_item_type_2.view.*

class Model2ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(model: Model2) {
        view.itemTitleType2.text = model.title
    }
}