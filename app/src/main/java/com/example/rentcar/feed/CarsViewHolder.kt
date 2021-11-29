package com.example.rentcar.feed

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rentcar.R

class CarsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val carImage:ImageView=itemView.findViewById(R.id.carImage)
    val carType:TextView = itemView.findViewById(R.id.carTypeTxt)
    val carLocation:TextView =itemView.findViewById(R.id.locationText)
    val price:TextView=itemView.findViewById(R.id.priceTxt)
}