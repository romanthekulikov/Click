package com.example.click.domain

import android.content.Context

class AddCountUseCase(context: Context) {
    fun execute(currentCount: Int): Int {
        return currentCount + 1
    }
}