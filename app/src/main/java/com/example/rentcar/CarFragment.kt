package com.example.rentcar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.rentcar.feed.CARS

class CarFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val id = CarFragmentArgs.fromBundle(requireArguments()).id
        val car = CARS.get(id)



        val view = inflater.inflate(R.layout.fragment_car, container, false)
        view.findViewById<TextView>(R.id.carName).text = car.name
        view.findViewById<TextView>(R.id.carLocation).text = car.location
        view.findViewById<TextView>(R.id.carRentPrice).text = car.price
        view.findViewById<ImageView>(R.id.carImagee).setImageResource(car.picture)
        return view

    }


}