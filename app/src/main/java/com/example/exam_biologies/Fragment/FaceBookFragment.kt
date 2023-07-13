package com.example.exam_biologies.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.exam_biologies.CheckCnx
import com.example.exam_biologies.R
import com.example.exam_biologies.databinding.FragmentFaceBookBinding
import com.example.exam_biologies.databinding.FragmentHomeBinding
import com.example.exam_biologies.databinding.FragmentTwitterBinding

class FaceBookFragment : Fragment() {

    private lateinit var _binding : FragmentFaceBookBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFaceBookBinding.inflate(inflater, container, false)
        _binding.FaceBookBtn.setOnClickListener(){
            val checkCnx = CheckCnx(requireContext())
            val email = _binding.FaceBookMail.text.toString()
            val password = _binding.FaceBookPsw.text.toString()
            val isValid = checkCnx.checkCredentials(email, password)
            if(isValid == true){
                //val action = FaceBookFragmentDirections.actionFirstFragmentToSecondFragment(origine = "FaceBook", message = "Félicitation vous êtes connecté!")
                //findNavController().navigate(action)
            }
        }
        return _binding.root
    }

}