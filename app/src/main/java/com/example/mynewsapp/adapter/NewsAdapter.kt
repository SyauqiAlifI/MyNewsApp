package com.example.mynewsapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mynewsapp.DetailActivity
import com.example.mynewsapp.data.News
import com.example.mynewsapp.databinding.RowItemNewsBinding

class NewsAdapter(private val listNews: ArrayList<News>) :
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    class MyViewHolder(private val itemNewsBinding: RowItemNewsBinding) :
        RecyclerView.ViewHolder(itemNewsBinding.root) {
            fun bindItem(news: News){
                itemNewsBinding.apply {
                    tvTitle.text = news.title
                    tvCategory.text = news.category
                    tvDate.text = news.date
                    tvTime.text = news.time
                    imgNews.setImageResource(news.photo)
                }
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        RowItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItem(listNews[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailActivity::class.java)

            intent.putExtra(DetailActivity.NEWS_DATA, listNews[position])
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount() = listNews.size
}