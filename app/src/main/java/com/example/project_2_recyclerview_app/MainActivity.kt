package com.example.project_2_recyclerview_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2_recyclerview_app.adapter.booksAdapter
import com.example.project_2_recyclerview_app.data.dataSource
import com.example.project_2_recyclerview_app.model.Book

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Connect the adapter with the data here
        val listOfBook:List<Book> = dataSource().Bookload()
        val BookAdapter  = booksAdapter(listOfBook,this)
        // Bind the recyclerview and the adapter here
        val recyclerView:RecyclerView = findViewById(R.id.Rec_item)

        recyclerView.adapter = BookAdapter
        recyclerView.setHasFixedSize(true)
    }
}