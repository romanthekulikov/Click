package com.example.click

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.click.domain.AddCountUseCase

const val DEFAULT_COUNTER_VALUE = 0

class MainViewModel(private val addCountUseCase: AddCountUseCase) : ViewModel() {
    var count: MutableLiveData<Int> = MutableLiveData(DEFAULT_COUNTER_VALUE)

    fun addCount() {
        count.value = addCountUseCase.execute(count.value!!)
    }
}