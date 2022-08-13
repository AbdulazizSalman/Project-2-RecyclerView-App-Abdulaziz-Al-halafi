package com.example.project_2_recyclerview_app.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Book

class booksAdapter(
    val dataSet:List<Book>,
    val context: Context
):RecyclerView.Adapter<booksAdapter.booksViewHolder>() {


    class booksViewHolder(private val view :View):RecyclerView.ViewHolder(view){
         val imageView:ImageView = view.findViewById(R.id.image_item)
         val titleView:TextView = view.findViewById(R.id.title_item)
         val hourView:TextView = view.findViewById(R.id.Hours_item)
         val pageView:TextView = view.findViewById(R.id.page_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): booksViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout,parent,false)
        return booksViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: booksViewHolder, position: Int) {
        val item = dataSet[position]
        holder.titleView.text=context.getString(item.titleId)
        holder.pageView.text=context.getString(item.pageId)
        holder.hourView.text=context.getString(item.hourId)
        holder.imageView.setImageResource(item.imageId)
    }

    override fun getItemCount()= dataSet.size

}