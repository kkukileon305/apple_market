package com.goodness.applemarket

import android.Manifest
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.addCallback
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.goodness.applemarket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

	private val myNotificationID = 1
	private val channelID = "default"

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		setRV()
		setBackPressedHandle()
		setBellClickHandle()
	}

	private fun setRV() {
		binding.rvProducts.adapter = ProductAdapter(Product.DUMMY_DATA, this)
		binding.rvProducts.layoutManager = LinearLayoutManager(this)
	}

	private fun setBackPressedHandle() {
		onBackPressedDispatcher.addCallback(this) {
			showDialog("종료", "정말 종료하시겠습니까?") { _, which ->
				when (which) {
					DialogInterface.BUTTON_POSITIVE -> finish()
				}
			}
		}
	}

	private fun setBellClickHandle() {
		binding.ivNotification.setOnClickListener {
			val builder = NotificationCompat.Builder(this, channelID)

			builder.apply {
				setSmallIcon(R.mipmap.ic_launcher)
				setContentTitle("키워드 알림")
				setContentText("설정한 키워드에 대한 알림이 도착함...")
				priority = NotificationManager.IMPORTANCE_DEFAULT
			}

			createNotificationChannel()
			if (ActivityCompat.checkSelfPermission(
					this,
					Manifest.permission.POST_NOTIFICATIONS
				) != PackageManager.PERMISSION_GRANTED
			) {
				// 알림 권한 거부
				showDialog("알림", "알림 권한을 허용해주세요.")
			} else {
				NotificationManagerCompat.from(this).notify(myNotificationID, builder.build())
			}
		}
	}

	private fun createNotificationChannel() {
		val channel = NotificationChannel(
			channelID, "default",
			NotificationManager.IMPORTANCE_DEFAULT
		)
		channel.description = "description text of this channel."
		val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
		notificationManager.createNotificationChannel(channel)
	}

	private fun showDialog(title: String, message: String, onClickListener: DialogInterface.OnClickListener? = null) {
		val builder = AlertDialog.Builder(this@MainActivity)

		builder.apply {
			setTitle(title)
			setMessage(message)
			setIcon(R.drawable.chat)
		}

		if (onClickListener != null) {
			builder.setPositiveButton("확인", onClickListener)
			builder.setNegativeButton("취소", onClickListener)
		} else {
			builder.setPositiveButton("확인") { dialog, _ -> dialog.dismiss() }
		}

		builder.show()
	}
}