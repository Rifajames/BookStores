package com.example.bookstores

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Book(
    val imageSrc : Int,
    val imTitle   : String,
    val imAuthor    : String,
    val imDescrip: String
) : Parcelable