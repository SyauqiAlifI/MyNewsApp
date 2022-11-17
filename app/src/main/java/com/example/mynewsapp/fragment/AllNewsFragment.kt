package com.example.mynewsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mynewsapp.R
import com.example.mynewsapp.databinding.FragmentAllNewsBinding

class AllNewsFragment : Fragment() {
    private lateinit var binding: FragmentAllNewsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAllNewsBinding.inflate(inflater, container, false)
        return binding.root
    }
}