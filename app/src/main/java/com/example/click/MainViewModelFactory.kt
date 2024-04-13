package com.example.click

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.click.domain.AddCountUseCase

class MainViewModelFactory(context: Context) : ViewModelProvider.Factory {
    private val addCountUseCase = AddCountUseCase(context = context)

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(addCountUseCase) as T
    }
}