package com.fxj.androidNavigationTest01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var navHostFragment= supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        var navController= navHostFragment.findNavController()

        var btn01=findViewById<Button>(R.id.btn01)

        btn01.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                navController.navigate(R.id.second_fragment)
            }
        })

    }
}