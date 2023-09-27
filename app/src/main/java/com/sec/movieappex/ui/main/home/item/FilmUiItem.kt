package com.sec.movieappex.ui.main.home.item

import java.io.Serializable

data class FilmUiItem(
    val actors: String,
    val id: Int,

    val imdb_rating: String,
    val plot: String,
    val poster: String,
    val rated: String,
    val released: String,
    val runtime: String,
    val title: String,

    ) : Serializable