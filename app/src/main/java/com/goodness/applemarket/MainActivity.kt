package com.goodness.applemarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.goodness.applemarket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		setRV()
	}

	private fun setRV() {
		val datas = listOf(
			Product(
				title = "제목1",
				desc = "설명1",
				image = R.drawable.ic_launcher_background,
				price = 20000,
				totalComments = 20,
				totalLikes = 290,
				place = "ㅁㅁ동"
			),
			Product(
				title = "제목2",
				desc = "설명2",
				image = R.drawable.ic_launcher_background,
				price = 40000,
				totalComments = 20,
				totalLikes = 290,
				place = "ㅁㅁ동"
			),
			Product(
				title = "제목3",
				desc = "설명3",
				image = R.drawable.ic_launcher_background,
				price = 30000,
				totalComments = 20,
				totalLikes = 290,
				place = "ㅁㅁ동"
			),
			Product(
				title = "제목3",
				desc = "설명3",
				image = R.drawable.ic_launcher_background,
				price = 30000,
				totalComments = 20,
				totalLikes = 290,
				place = "ㅁㅁ동"
			),
			Product(
				title = "제목3",
				desc = "설명3",
				image = R.drawable.ic_launcher_background,
				price = 30000,
				totalComments = 20,
				totalLikes = 290,
				place = "ㅁㅁ동"
			),
			Product(
				title = "제목3",
				desc = "설명3",
				image = R.drawable.ic_launcher_background,
				price = 30000,
				totalComments = 20,
				totalLikes = 290,
				place = "ㅁㅁ동"
			)
		)


		binding.rvProducts.adapter = ProductAdapter(datas, this)
		binding.rvProducts.layoutManager = LinearLayoutManager(this)
	}
}