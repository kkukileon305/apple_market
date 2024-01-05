package com.goodness.applemarket

data class Product(
	val image: Int,
	val title: String,
	val desc: String,
	val price: Int,
	val totalComments: Int,
	val totalLikes: Int
)