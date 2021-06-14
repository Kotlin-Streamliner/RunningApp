package com.thisisstreamliner.runningapp.repositories

import com.thisisstreamliner.runningapp.data.Run
import com.thisisstreamliner.runningapp.data.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDAO
) {

    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByAverageSpeed() = runDao.getAllRunsSortedByAverageSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getTotalAverageSpeed() = runDao.totalAverageSpeed()

    fun getTotalDistance() = runDao.totalDistance()

    fun getTotalCaloriesBurned() = runDao.totalCaloriesBurned()

    fun getTotalTimeInMillis() = runDao.totalTimeInMillis()
}