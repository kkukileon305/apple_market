package com.goodness.applemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.goodness.applemarket.databinding.ActivityProductDetailBinding

class ProductDetail : AppCompatActivity() {
	private val binding by lazy { ActivityProductDetailBinding.inflate(layoutInflater) }

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		intent.getStringExtra(IntentKey.TITLE.key)?.let {
			binding.tvProductTitle.text = it
		}
	}
}