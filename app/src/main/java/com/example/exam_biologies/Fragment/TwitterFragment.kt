package com.example.exam_biologies.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.exam_biologies.CheckCnx
import com.example.exam_biologies.R
import com.example.exam_biologies.databinding.FragmentHomeBinding
import com.example.exam_biologies.databinding.FragmentTwitterBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class TwitterFragment : Fragment() {

    private lateinit var _binding : FragmentTwitterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTwitterBinding.inflate(inflater, container, false)
        _binding.TwitterBtn.setOnClickListener(){
            val checkCnx = CheckCnx(requireContext())
            val email = _binding.TwitterMail.text.toString()
            val password = _binding.TwitterPsw.text.toString()
            val isValid = checkCnx.checkCredentials(email, password)
            if(isValid == true){
                //val action = TwitterFragmentDirections.actionFirstFragmentToSecondFragment(origine = "Twitter", message = "Félicitation vous êtes connecté!")
                //findNavController().navigate(action)
            }
        }
        return _binding.root
    }

}