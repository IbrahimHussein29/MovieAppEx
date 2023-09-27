package com.sec.movieappex.ui.main.detail

import androidx.recyclerview.widget.RecyclerView
import com.sec.movieappex.databinding.CellDetailImgBinding
import com.sec.movieappex.extensions.setImageUrl

class DetailImgVH(var binding:CellDetailImgBinding):RecyclerView.ViewHolder(binding.root) {

    fun bind(img:String){
        binding.detailImg.setImageUrl(img)
    }
}