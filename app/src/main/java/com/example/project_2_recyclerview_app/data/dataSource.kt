package com.example.project_2_recyclerview_app.data

import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.Book

class dataSource {

    fun Bookload():List<Book>{

        return listOf(
            Book(R.string.name1,R.string.page1,R.string.hour1,R.drawable.pic1),
            Book(R.string.name2,R.string.page2,R.string.hour2,R.drawable.pic2),
            Book(R.string.name3,R.string.page3,R.string.hour3,R.drawable.pic3),
            Book(R.string.name4,R.string.page4,R.string.hour4,R.drawable.pic4),
            Book(R.string.name5,R.string.page5,R.string.hour5,R.drawable.pic5),
            Book(R.string.name6,R.string.page6,R.string.hour6,R.drawable.pic6),
            Book(R.string.name7,R.string.page7,R.string.hour7,R.drawable.pic7),
            Book(R.string.name8,R.string.page8,R.string.hour8,R.drawable.pic8),
            Book(R.string.name9,R.string.page9,R.string.hour9,R.drawable.pic9),
            Book(R.string.name10,R.string.page10,R.string.hour10,R.drawable.pic10),
            Book(R.string.name11,R.string.page11,R.string.hour11,R.drawable.pic11),
            Book(R.string.name12,R.string.page12,R.string.hour12,R.drawable.pic12),
            Book(R.string.name13,R.string.page13,R.string.hour13,R.drawable.pic13),
            Book(R.string.name14,R.string.page14,R.string.hour14,R.drawable.pic14),
            Book(R.string.name15,R.string.page15,R.string.hour15,R.drawable.pic15)
        )
    }
}