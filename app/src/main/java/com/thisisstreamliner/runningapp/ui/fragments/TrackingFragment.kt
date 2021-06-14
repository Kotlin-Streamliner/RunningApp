package com.thisisstreamliner.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import com.thisisstreamliner.runningapp.R
import com.thisisstreamliner.runningapp.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TrackingFragment: Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewmodels()
}