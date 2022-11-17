package com.example.mynewsapp

import android.content.Intent
import com.example.mynewsapp.data.DataNews
import com.example.mynewsapp.databinding.NewsHeadlineBinding

fun bindNewsHeadline(binding: NewsHeadlineBinding, position: Int){
    binding.apply {
        imgHeadline.setImageResource(DataNews.photoHeadline[position])
        tvTitleHeadline.text = DataNews.titleHeadline[position]
        tvDescHeadline.text = DataNews.contentHeadline[position]
        tvDateHeadline.text = DataNews.dateHeadline[position]
        tvAuthorHeadline.text = DataNews.authorHeadline[position]
    }

    binding.root.setOnClickListener {
        val intentToDetail = Intent(binding.root.context, DetailActivity::class.java)
    }
}