package com.example.practice.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.R

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val textView: TextView
    init {
        // Define click listener for the ViewHolder's View
        textView = view.findViewById(R.id.textView)
    }
}