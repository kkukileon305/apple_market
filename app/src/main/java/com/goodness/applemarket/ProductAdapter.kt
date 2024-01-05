package com.goodness.applemarket

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.goodness.applemarket.databinding.ProductItemBinding

class ProductAdapter(
	val mItems: List<Product>,
	val context: Context
) : RecyclerView.Adapter<ProductAdapter.Holder>() {

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
		val binding = ProductItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
		return Holder(binding)
	}

	override fun onBindViewHolder(holder: Holder, position: Int) {
		holder.binding.apply {
			root.setOnClickListener {
				val intent = Intent(context, ProductDetail::class.java)

				mItems[position].apply {
					intent.putExtra(IntentKey.TITLE.key, title)
					intent.putExtra(IntentKey.DESC.key, desc)
					intent.putExtra(IntentKey.IMAGE.key, image)
					intent.putExtra(IntentKey.PRICE.key, price)
					intent.putExtra(IntentKey.TOTALLIKES.key, totalLikes)
					intent.putExtra(IntentKey.TOTALCOMMENTS.key, totalComments)
				}

				context.startActivity(intent)
			}

			tvProductTitle.text = mItems[position].title
			tvProductDesc.text = mItems[position].desc
			tvProductPrice.text = mItems[position].price.toString()
			ivProductImage.setImageResource(mItems[position].image)
		}
	}

	override fun getItemCount(): Int {
		return mItems.size
	}

	inner class Holder(val binding: ProductItemBinding) : RecyclerView.ViewHolder(binding.root)
}