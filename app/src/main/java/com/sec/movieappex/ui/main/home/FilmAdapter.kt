package com.sec.movieappex.ui.main.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.movieappex.databinding.CellFilmBinding
import com.sec.movieappex.ui.main.home.item.FilmUiItem

class FilmAdapter(
    var items: ArrayList<FilmUiItem>,
    var onItemClicked: (item: FilmUiItem) -> Unit
    ):RecyclerView.Adapter<FilmVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmVH {
val binding = CellFilmBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return FilmVH(binding)
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: FilmVH, position: Int) {
        val item=items[position]
    holder.bind(item)
        holder.binding.film.setOnClickListener{
            onItemClicked(item)
        }
    }
}