package com.example.apposterhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.apposterhw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.run {
            setDisplayShowTitleEnabled(false)
            title = "과제 리스트"
        }

        binding.recyclerview.adapter = PagingAdapter()
    }
}

class PagingSource(watchImage: Preview): PagingSource<>

class PagingAdapter : PagingDataAdapter<WatchResponse, PagingAdapter.WatchViewHolder>() {
    class WatchViewHolder(view:View):RecyclerView.ViewHolder(view)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WatchViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: WatchViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}