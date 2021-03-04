package com.example.open_close_recyclerview.view.adapter.tiles

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.open_close_recyclerview.R
import com.example.open_close_recyclerview.common.Tile
import com.example.open_close_recyclerview.common.ListItem
import com.example.open_close_recyclerview.model.Model2
import com.example.open_close_recyclerview.view.adapter.viewHolders.Model2ViewHolder

object Model2Tile : Tile<ListItem>() {
    override fun isTypeOf(item: ListItem?): Boolean {
        return item is Model2
    }

    override fun type(): Int {
        return R.layout.list_item_type_2
    }

    override fun holder(parent: ViewGroup): RecyclerView.ViewHolder {
        return Model2ViewHolder(parent.viewOf(type()))
    }

    override fun bind(holder: RecyclerView.ViewHolder, item: ListItem?) {
        if (holder is Model2ViewHolder && item is Model2) {
            holder.bind(item)
        }
    }
}