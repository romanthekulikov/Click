package com.example.click

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.click.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mainVM: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainVM = MainViewModelFactory(this).create(MainViewModel::class.java)

        binding.mainArea.setOnClickListener {
            mainVM.addCount()
        }

        mainVM.count.observe(this@MainActivity) {
            binding.counter.text = it.toString()
        }
    }
}