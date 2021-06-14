package com.thisisstreamliner.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import com.thisisstreamliner.runningapp.R
import com.thisisstreamliner.runningapp.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment: Fragment(R.layout.fragment_run) {

    private val viewModel: MainViewModel by viewmodels()
}