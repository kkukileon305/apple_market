package com.goodness.applemarket

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
	val image: Int,
	val title: String,
	val desc: String,
	val price: Int,
	val seller: String,
	val totalComments: Int,
	val totalLikes: Int,
	val place: String
) : Parcelable