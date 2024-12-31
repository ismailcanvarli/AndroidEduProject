package com.ismailcanvarli.appnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //getNavControllerViaFragment()
    }

    // biz en çok bunu kullanacağız.
    fun getNavControllerViaView() {
        val navHostFragmentView =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        navHostFragmentView.navController
    }

    override fun onResume() {
        super.onResume()
        getNavControllerViaView()
    }
}