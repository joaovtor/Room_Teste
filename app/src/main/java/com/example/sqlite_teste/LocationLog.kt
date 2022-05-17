package com.example.sqlite_teste

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

    @Entity
    data class LocationLog(
        @PrimaryKey val uid: Int,
        @ColumnInfo(name = "userId") val userId: Int?,
        @ColumnInfo(name = "lat") val lat: Double?,
        @ColumnInfo(name = "long") val long: Double?,
        @ColumnInfo(name = "timestamp") val timestamp: String?
)
