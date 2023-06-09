package com.example.testedeemprego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testedeemprego.adapter.GaleriaAdapter
import com.example.testedeemprego.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var galeriaAdaper : GaleriaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        galeriaAdaper = GaleriaAdapter()
        binding.rvGaleria.adapter = galeriaAdaper

    }
}