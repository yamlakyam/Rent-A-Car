package com.example.rentcar.feed

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rentcar.R

class CarsAdapter(private val cars: List<Car>, private val onCarClick: (Int) -> Unit) :
    RecyclerView.Adapter<CarsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_car, parent, false)

        return CarsViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        holder.carImage.setImageResource(cars[position].picture)
        holder.carType.text = cars[position].name
        holder.carLocation.text = cars[position].location
        holder.price.text = cars[position].price

        holder.bind(cars[position],onCarClick)
    }

    override fun getItemCount(): Int {
        return cars.size
    }
}