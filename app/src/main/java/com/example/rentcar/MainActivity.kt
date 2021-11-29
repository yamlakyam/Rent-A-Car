package com.example.rentcar

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.navigation.NavDeepLinkBuilder

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendFakeNotification()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun sendFakeNotification() {
        val notificationManager =getSystemService(NOTIFICATION_SERVICE) as NotificationManager

        val importance=NotificationManager.IMPORTANCE_DEFAULT
        val channel= NotificationChannel("channel0","name",importance)
        notificationManager.createNotificationChannel(channel)

        val args= CarFragmentArgs.Builder(3).build().toBundle()
        val pendingIntent = NavDeepLinkBuilder(this).setGraph(R.navigation.nav_graph).setDestination(R.id.carFragment).setArguments(args).createPendingIntent()

        val notification = Notification.Builder(this).setContentTitle("Now on Sale!").setAutoCancel(true).setSmallIcon(R.drawable.car).setContentIntent(pendingIntent)
        notification.setChannelId("channel0")

        notificationManager.notify(0,notification.build())

    }
}