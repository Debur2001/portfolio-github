package com.example.portfoliogithub.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.portfoliogithub.R
import com.example.portfoliogithub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }
}