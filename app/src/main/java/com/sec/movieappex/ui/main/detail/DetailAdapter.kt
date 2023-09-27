package com.sec.movieappex.ui.main.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.movieappex.databinding.CellDetailImgBinding

class DetailAdapter(var images:ArrayList<String>):RecyclerView.Adapter<DetailImgVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailImgVH {
        val binding=CellDetailImgBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DetailImgVH(binding)
    }

    override fun getItemCount(): Int {
     return images.size
    }

    override fun onBindViewHolder(holder: DetailImgVH, position: Int) {
        val img=images[position]
       holder.bind(img)
    }
}