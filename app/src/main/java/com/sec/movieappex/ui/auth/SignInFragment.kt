package com.sec.movieappex.ui.auth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sec.movieappex.R
import com.sec.movieappex.databinding.FragmentSignInBinding
import com.sec.movieappex.ui.main.MainActivity

class SignInFragment : Fragment() {

    private lateinit var binding: FragmentSignInBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignInBinding.inflate(layoutInflater)

        setClickListeners()



        return binding.root
    }

    private fun setClickListeners() {
        binding.registerText.setOnClickListener(){
            findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)

        }



            binding.loginBtn.setOnClickListener() {
                startActivity(Intent(requireActivity(), MainActivity::class.java).apply {
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

                })
                requireActivity().finish()
            }
        
    }


}