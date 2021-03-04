package com.example.open_close_recyclerview.common

import androidx.recyclerview.widget.DiffUtil

val BASE_DIFF_CALLBACK = object : DiffUtil.ItemCallback<ListItem>() {

    override fun areItemsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ListItem, newItem: ListItem): Boolean {
        return oldItem == newItem
    }
}