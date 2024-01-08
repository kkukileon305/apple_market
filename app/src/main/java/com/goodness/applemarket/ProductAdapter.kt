package com.goodness.applemarket

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.goodness.applemarket.databinding.ProductItemBinding
import java.text.NumberFormat
import java.util.Locale

class ProductAdapter(
	private val mItems: List<Product>,
	private val context: Context
) : RecyclerView.Adapter<ProductAdapter.Holder>() {

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
		val binding = ProductItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
		return Holder(binding)
	}

	override fun onBindViewHolder(holder: Holder, position: Int) {
		holder.binding.apply {
			root.setOnClickListener {
				// navigate to product detail
				val intent = Intent(context, ProductDetail::class.java)
				intent.putExtra("Product", mItems[position])

				context.startActivity(intent)
			}

			// binding data
			tvProductTitle.text = mItems[position].title
			tvProductPlace.text = mItems[position].place
			tvProductPrice.text = "${NumberFormat.getNumberInstance(Locale.KOREA).format(mItems[position].price)}원"
			tvProductTotalLikes.text = mItems[position].totalLikes.toString()
			tvProductTotalComments.text = mItems[position].totalComments.toString()
			ivProductImage.setImageResource(mItems[position].image)
		}
	}

	override fun getItemCount(): Int {
		return mItems.size
	}

	inner class Holder(val binding: ProductItemBinding) : RecyclerView.ViewHolder(binding.root)
}