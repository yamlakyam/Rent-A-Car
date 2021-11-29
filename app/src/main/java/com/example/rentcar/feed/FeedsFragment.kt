package com.example.rentcar.feed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rentcar.HomeFragmentDirections
import com.example.rentcar.R

class FeedsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_feeds, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.feedRV)
        recyclerView.layoutManager = LinearLayoutManager(context)
        val adapter = CarsAdapter(CARS, ::onCarClick)
        recyclerView.adapter = adapter

        return view
    }

    private fun onCarClick(carId: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToCarFragment(carId)
        activity?.findNavController(R.id.nav_container)?.navigate(action)
    }

}