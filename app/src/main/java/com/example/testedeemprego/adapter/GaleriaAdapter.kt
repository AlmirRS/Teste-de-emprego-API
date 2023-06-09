package com.example.testedeemprego.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.testedeemprego.databinding.ActivityMainBinding
import com.example.testedeemprego.databinding.ItemListaBinding


class GaleriaAdapter : Adapter<GaleriaAdapter.GaleriaViewHolder>() {

    fun adicionarLista(){

    }

    inner class GaleriaViewHolder(binding: ItemListaBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(){

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GaleriaViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: GaleriaViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}