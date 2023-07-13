package com.example.exam_biologies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.exam_biologies.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var _navController: NavController
    private lateinit var _binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)
    }

    override fun onStart() {
        super.onStart()
        _navController = findNavController(R.id.fragmentContainerView)
        _navController.addOnDestinationChangedListener{controller, destination, arguments ->
            when (destination.id){
                R.id.homeFragment -> Log.d("lm","Fragment 1")
                R.id.faceBookFragment -> Log.d("lm","Fragment 2")
                else -> Log.d("lm","????")
            }
        }

    }
}