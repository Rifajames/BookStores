package com.example.bookstores

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val book = intent.getParcelableExtra<Book>(MainActivity.INTENT_PARCELABLE)

        val imgSrc = findViewById<ImageView>(R.id.book_photo)
        val imTitle = findViewById<TextView>(R.id.book_nama)
        val imAuthor = findViewById<TextView>(R.id.book_author)
        val imdesc = findViewById<TextView>(R.id.book_desc)


        if (book != null) {
            imgSrc.setImageResource(book.imageSrc)
            imTitle.text = book.imTitle
            imAuthor.text = book.imAuthor
            imdesc.text = book.imDescrip
        }


    }
}