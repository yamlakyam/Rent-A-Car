package com.example.rentcar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation

class WlelcomeFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view= inflater.inflate(R.layout.fragment_wlelcome, container, false)

        view.findViewById<TextView>(R.id.registerTxt).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_wlelcomeFragment_to_registrationFragment))

        return view
    }

}