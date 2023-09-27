package com.sec.movieappex.ui.main.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sec.movieappex.R
import com.sec.movieappex.databinding.FragmentDetailBinding
import com.sec.movieappex.extensions.setImageUrl
import com.sec.movieappex.ui.main.home.item.FilmUiItem


class DetailFragment : Fragment() {

private lateinit var binding: FragmentDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

    binding= FragmentDetailBinding.inflate(layoutInflater)

        bindData()

        return binding.root
    }

    private fun bindData() {
        binding.backArrow.setOnClickListener {
            findNavController().popBackStack()
        }
val filmDetails= requireArguments().getSerializable("item") as FilmUiItem
        binding.movieTitleText.text=filmDetails.title
        binding.posterNormalImg.setImageUrl(filmDetails.poster)
        binding.posterLargeImg.setImageUrl(filmDetails.poster)
        binding.movieRateText.text=filmDetails.rated
        binding.movieDateText.text=filmDetails.released
        binding.movieTimeText.text=filmDetails.runtime
        binding.movieInfoText.text=filmDetails.plot
        binding.actorInfoText.text=filmDetails.actors


    }


}