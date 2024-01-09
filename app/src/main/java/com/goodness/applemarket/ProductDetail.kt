package com.goodness.applemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.goodness.applemarket.databinding.ActivityProductDetailBinding
import java.text.NumberFormat
import java.util.Locale

class ProductDetail : AppCompatActivity() {
	private val binding by lazy { ActivityProductDetailBinding.inflate(layoutInflater) }

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		bindData()
		setHandler()
	}

	private fun bindData() {
		intent.getParcelableExtra<Product>("Product")?.let { product ->
			binding.tvProductSeller.text = product.seller
			binding.tvProductPlace.text = product.place
			binding.ivProductImage.setImageResource(product.image)
			binding.tvProductTitle.text = product.title
			binding.tvProductDesc.text = product.desc
			binding.tvProductPrice.text = "${NumberFormat.getNumberInstance(Locale.KOREA).format(product.price)}원"
		}
	}

	private fun setHandler() {
		binding.ivHome.setOnClickListener {
			finish()
		}
	}
}