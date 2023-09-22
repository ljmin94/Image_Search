package com.example.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.search.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setFragment(0)

        binding.search.setOnClickListener {
            setFragment(0)
        }
        binding.wishlist.setOnClickListener {
            setFragment(1)
        }
    }

    private fun setFragment(frag : Int) {
        val btn = supportFragmentManager.beginTransaction()
        when(frag)
        {
            0 -> {
                btn.replace(R.id.frameLayout, SearchFragment()).commit()
            }
            1 -> {
                btn.replace(R.id.frameLayout, WishListFragment()).commit()
            }
        }
    }
}