package com.example.testedeemprego

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
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
        galeriaAdaper.adicionarLista(
            listOf(
                "https://th.bing.com/th/id/R.4b64e209729e5e331d1c0bcff819ae37?rik=Z2aA1HY7x75ItA&riu=http%3a%2f%2fwww.mascotahogar.com%2f1280x1024%2ffondo-de-un-pequeno-gato-siames.jpg&ehk=lRcY4%2fHBcK8Sa2ub3JICSLF3bSNs%2bGXO0hSUHDgItGs%3d&risl=&pid=ImgRaw&r=0",
                "https://th.bing.com/th/id/OIP.2hB7_M3r68i73u4cz6_n3QHaHa?pid=ImgDet&rs=1",
                "https://th.bing.com/th/id/R.1cb130c23c6cec052da205cef7fc088e?rik=to4vHejs4u2zGQ&riu=http%3a%2f%2f3.bp.blogspot.com%2f-tMNrU015ueY%2fTq6nx1t1W6I%2fAAAAAAAAABE%2fJrbR3NV0szI%2fs1600%2fgatos-filhotes.jpg&ehk=DJ6ESwA1GXNMOsEvhyFV4PESS0yU%2b5cfNNW0FZcdK6w%3d&risl=&pid=ImgRaw&r=0",
                "https://th.bing.com/th/id/R.4b64e209729e5e331d1c0bcff819ae37?rik=Z2aA1HY7x75ItA&riu=http%3a%2f%2fwww.mascotahogar.com%2f1280x1024%2ffondo-de-un-pequeno-gato-siames.jpg&ehk=lRcY4%2fHBcK8Sa2ub3JICSLF3bSNs%2bGXO0hSUHDgItGs%3d&risl=&pid=ImgRaw&r=0",
                "https://th.bing.com/th/id/R.4b64e209729e5e331d1c0bcff819ae37?rik=Z2aA1HY7x75ItA&riu=http%3a%2f%2fwww.mascotahogar.com%2f1280x1024%2ffondo-de-un-pequeno-gato-siames.jpg&ehk=lRcY4%2fHBcK8Sa2ub3JICSLF3bSNs%2bGXO0hSUHDgItGs%3d&risl=&pid=ImgRaw&r=0",
                "https://th.bing.com/th/id/R.4b64e209729e5e331d1c0bcff819ae37?rik=Z2aA1HY7x75ItA&riu=http%3a%2f%2fwww.mascotahogar.com%2f1280x1024%2ffondo-de-un-pequeno-gato-siames.jpg&ehk=lRcY4%2fHBcK8Sa2ub3JICSLF3bSNs%2bGXO0hSUHDgItGs%3d&risl=&pid=ImgRaw&r=0",
                "https://th.bing.com/th/id/R.4b64e209729e5e331d1c0bcff819ae37?rik=Z2aA1HY7x75ItA&riu=http%3a%2f%2fwww.mascotahogar.com%2f1280x1024%2ffondo-de-un-pequeno-gato-siames.jpg&ehk=lRcY4%2fHBcK8Sa2ub3JICSLF3bSNs%2bGXO0hSUHDgItGs%3d&risl=&pid=ImgRaw&r=0",
                "https://th.bing.com/th/id/R.4b64e209729e5e331d1c0bcff819ae37?rik=Z2aA1HY7x75ItA&riu=http%3a%2f%2fwww.mascotahogar.com%2f1280x1024%2ffondo-de-un-pequeno-gato-siames.jpg&ehk=lRcY4%2fHBcK8Sa2ub3JICSLF3bSNs%2bGXO0hSUHDgItGs%3d&risl=&pid=ImgRaw&r=0",
                "https://th.bing.com/th/id/R.4b64e209729e5e331d1c0bcff819ae37?rik=Z2aA1HY7x75ItA&riu=http%3a%2f%2fwww.mascotahogar.com%2f1280x1024%2ffondo-de-un-pequeno-gato-siames.jpg&ehk=lRcY4%2fHBcK8Sa2ub3JICSLF3bSNs%2bGXO0hSUHDgItGs%3d&risl=&pid=ImgRaw&r=0",
                "https://th.bing.com/th/id/R.4b64e209729e5e331d1c0bcff819ae37?rik=Z2aA1HY7x75ItA&riu=http%3a%2f%2fwww.mascotahogar.com%2f1280x1024%2ffondo-de-un-pequeno-gato-siames.jpg&ehk=lRcY4%2fHBcK8Sa2ub3JICSLF3bSNs%2bGXO0hSUHDgItGs%3d&risl=&pid=ImgRaw&r=0"
            )
        )
        binding.rvGaleria.adapter = galeriaAdaper
        binding.rvGaleria.setHasFixedSize(true)
        binding.rvGaleria.layoutManager = GridLayoutManager(
            this,
            3,
            RecyclerView.VERTICAL,
            false
        )

    }
}