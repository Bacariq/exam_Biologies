package com.example.exam_biologies.Fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.exam_biologies.R
import com.example.exam_biologies.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var _binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        _binding.btnTwitter.setOnClickListener(){
            val action = R.id.action_homeFragment_to_twitterFragment
            findNavController().navigate(action)
        }

        _binding.btnFaceBook.setOnClickListener(){
            val action = R.id.action_homeFragment_to_faceBookFragment
            findNavController().navigate(action)
        }

        _binding.BtnBloggies.setOnClickListener(){
            val action = R.id.action_homeFragment_to_bloggiesFragment
            findNavController().navigate(action)
        }

        return _binding.root
    }
}