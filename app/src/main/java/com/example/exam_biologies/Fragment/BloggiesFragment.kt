package com.example.exam_biologies.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.exam_biologies.CheckCnx
import com.example.exam_biologies.R
import com.example.exam_biologies.databinding.FragmentBloggiesBinding
import com.example.exam_biologies.databinding.FragmentConnectedBinding
import com.example.exam_biologies.databinding.FragmentFaceBookBinding


class BloggiesFragment : Fragment() {

    private lateinit var _binding : FragmentBloggiesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBloggiesBinding.inflate(inflater, container, false)

        _binding.BloggiesBtn.setOnClickListener(){
            val checkCnx = CheckCnx(requireContext())
            val email = _binding.BloggiesMail.text.toString()
            val password = _binding.BloggiesPsw.text.toString()
            val password2 = _binding.BloggiesPsw2.text.toString()
            val login = _binding.BloggiesLogin.text.toString()
            val isValid = checkCnx.checkCredentialsBloggies(email, login, password, password2)
            if(isValid == true){
                val action = BloggiesFragmentDirections.actionBloggiesFragmentToConnectedFragment(origine = "Bloggies", message = "Bonjour " + login + " !")
                findNavController().navigate(action)
            }
        }
        return _binding.root
    }

}