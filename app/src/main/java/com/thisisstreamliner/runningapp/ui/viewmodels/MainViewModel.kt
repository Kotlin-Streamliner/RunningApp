package com.thisisstreamliner.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.thisisstreamliner.runningapp.repositories.MainRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel() {
}