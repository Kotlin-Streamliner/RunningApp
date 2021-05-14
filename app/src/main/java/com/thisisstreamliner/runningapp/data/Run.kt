package com.thisisstreamliner.runningapp.data

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run(
    var image: Bitmap? = null,
    var timeStamp: Long = 0L, // means when run was
    var avarageSpeedInKHM: Float = 0f,
    var distanceInMeters: Int = 0,
    var timeInMillis: Long = 0L, // means how long run was
    var caloriesBurned: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}