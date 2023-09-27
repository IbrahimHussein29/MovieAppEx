package com.sec.movieappex.ui.main.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.sec.movieappex.R
import com.sec.movieappex.databinding.FragmentHomeBinding
import com.sec.movieappex.ui.main.home.item.FilmUiItem


class HomeFragment : Fragment() {
private lateinit var binding:FragmentHomeBinding
private lateinit var homeViewModel: HomeViewModel
private val newFilmAdapter by lazy{
    FilmAdapter(arrayListOf()){
        openNewFilmDetails(it)
    }

}
    private val commingFilmAdapter by lazy {
        FilmAdapter(arrayListOf()) {
            openCommingFilmDetails(it)
        }
    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentHomeBinding.inflate(layoutInflater)

        homeViewModel=ViewModelProvider(this)[HomeViewModel::class.java]

        callData()
        observeData()

        return binding.root


    }



    private fun observeData() {
        binding.newMoviesRecyclerView.adapter=newFilmAdapter
        binding.comingMoviesRecyclerView.adapter=commingFilmAdapter

        homeViewModel.newFilmData.observe(viewLifecycleOwner){
            binding.loading1.isVisible
            newFilmAdapter.items=it
           newFilmAdapter.notifyDataSetChanged()
            binding.loading1.isInvisible
        }
        homeViewModel.commingFilmData.observe(viewLifecycleOwner){
            binding.loading2.isVisible
            commingFilmAdapter.items=it
            commingFilmAdapter.notifyDataSetChanged()
            binding.loading1.isInvisible
        }
    }

    private fun callData() {
        homeViewModel.generateNewFilmData()
        homeViewModel.generateUpcommingFilmData()

    }

    private fun openNewFilmDetails(item: FilmUiItem) {
        val bundle= bundleOf("item" to item )

        findNavController().navigate(R.id.action_homeFragment_to_detailFragment,bundle)
    }
    private fun openCommingFilmDetails(item: FilmUiItem) {
        val bundle= bundleOf("item" to item )

        findNavController().navigate(R.id.action_homeFragment_to_detailFragment,bundle)

    }
}