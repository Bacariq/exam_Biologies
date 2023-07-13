package com.example.exam_biologies.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.exam_biologies.R
import com.example.exam_biologies.databinding.FragmentConnectedBinding
import com.example.exam_biologies.databinding.FragmentHomeBinding

class ConnectedFragment : Fragment() {

    private  val args : ConnectedFragmentArgs by navArgs()
    private lateinit var _binding : FragmentConnectedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentConnectedBinding.inflate(inflater, container, false)
        val origine = args.origine;
        _binding.ConnectedMessage.text = args.message;
        when (origine) {
            "Twitter" -> {
                _binding.ConnectedImage.setImageResource(R.drawable.twitter)
            }
            "FaceBook" -> {
                _binding.ConnectedImage.setImageResource(R.drawable.facebook)
            }
            "Bloggies" -> {
                _binding.ConnectedImage.setImageResource(R.drawable.bloggies)
            }
            else -> {
            }
        }

        return _binding.root
    }

}