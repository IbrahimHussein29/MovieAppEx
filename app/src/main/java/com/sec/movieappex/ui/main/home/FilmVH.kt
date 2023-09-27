package com.sec.movieappex.ui.main.home

import androidx.recyclerview.widget.RecyclerView
import com.sec.movieappex.databinding.CellFilmBinding
import com.sec.movieappex.extensions.setImageUrl
import com.sec.movieappex.ui.main.home.item.FilmUiItem

class FilmVH(val binding: CellFilmBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(item:FilmUiItem){
        binding.filmImg.setImageUrl(item.poster)
        binding.fimTitleText.text=item.title
        binding.filmScoreText.text=item.imdb_rating
    }

}