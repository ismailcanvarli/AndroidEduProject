package com.ismailcanvarli.appnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DashboardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    // Fragment içerisindeki view'lar burada tanımlanır.
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // DashboardFragment içerisindeki btnOpenProfileFragment butonuna
        // tıklandığında ProfileFragment'e geçiş yapılır.
        val btnOpenProfileFragment = view.findViewById<Button>(R.id.btn_open_profile_fragment)
        btnOpenProfileFragment.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_profileFragment)
        }
    }
}