package com.example.open_close_recyclerview.view.adapter.tiles

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.open_close_recyclerview.R
import com.example.open_close_recyclerview.common.Tile
import com.example.open_close_recyclerview.common.ListItem
import com.example.open_close_recyclerview.model.Model1
import com.example.open_close_recyclerview.view.adapter.viewHolders.Model1ViewHolder

object Model1Tile : Tile<ListItem>() {
    override fun isTypeOf(item: ListItem?): Boolean {
        return item is Model1
    }

    override fun type(): Int {
        return R.layout.list_item_type_1
    }

    override fun holder(parent: ViewGroup): RecyclerView.ViewHolder {
        return Model1ViewHolder(parent.viewOf(type()))
    }

    override fun bind(holder: RecyclerView.ViewHolder, item: ListItem?) {
        if (holder is Model1ViewHolder && item is Model1) {
            holder.bind(item)
        }
    }
}