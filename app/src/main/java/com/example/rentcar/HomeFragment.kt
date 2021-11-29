package com.example.rentcar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_home, container, false)

        val navHostFragment=childFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment
        view.findViewById<BottomNavigationView>(R.id.bottomNavigationView).setupWithNavController(  navController = navHostFragment.navController)

//        navHostFragment.navController.addOnDestinationChangedListener(_,destination ->
//        toolbar.title=destination.)


        return view
    }


}