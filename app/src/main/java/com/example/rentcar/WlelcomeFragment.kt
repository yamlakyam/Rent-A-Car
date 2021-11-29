package com.example.rentcar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class WlelcomeFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view= inflater.inflate(R.layout.fragment_wlelcome, container, false)

        view.findViewById<TextView>(R.id.registerTxt).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_wlelcomeFragment_to_registrationFragment))

        view.findViewById<Button>(R.id.loginButton).setOnClickListener{
            val email =view.findViewById<EditText>(R.id.editTextTextEmailAddress2).text.toString()
            val password =view.findViewById<EditText>(R.id.editTextTextPassword).text.toString()

            if(email.isNotEmpty() && password.isNotEmpty()){
                findNavController().navigate(R.id.action_wlelcomeFragment_to_homeFragment)
            }
        }

        return view
    }

}