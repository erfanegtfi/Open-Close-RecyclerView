package com.example.open_close_recyclerview.common

interface ListItem {
    val id: String?
    override fun equals(other: Any?): Boolean
}