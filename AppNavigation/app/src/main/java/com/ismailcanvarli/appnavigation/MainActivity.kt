package com.ismailcanvarli.appnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Explicitly Deeplink with NavDeepLinkBuilder
        // Genelde notificationlarda kullanılır.
        NavDeepLinkBuilder(this).setGraph(R.navigation.nav_graph)
            .setDestination(R.id.profileFragment).setArguments(bundleOf("userId" to 5))
            .createPendingIntent()
    }

    // biz en çok bunu kullanacağız.
    fun getNavControllerViaView() {
        val navHostFragmentView =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        val navController = navHostFragmentView.navController

        // Explicitly Deep Link Navigation with Navcontroller
        navController.createDeepLink().setDestination(R.id.profileFragment)
            .setArguments(bundleOf("userId" to 5)).createPendingIntent()
    }

    override fun onResume() {
        super.onResume()
        getNavControllerViaView()
    }
}