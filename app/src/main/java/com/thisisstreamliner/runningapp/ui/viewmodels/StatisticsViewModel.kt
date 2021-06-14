package com.thisisstreamliner.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.thisisstreamliner.runningapp.repositories.MainRepository
import javax.inject.Inject

class StatisticsViewModel @Inject constructor(
    val mainRepository: MainRepository
        ): ViewModel() {
}