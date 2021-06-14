package com.thisisstreamliner.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import com.thisisstreamliner.runningapp.R
import com.thisisstreamliner.runningapp.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment: Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewmodels()
}