package com.example.sqlite_teste

import android.location.Location
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface LocationLogDAO {
    @Query("SELECT * FROM locationLog")
    fun getAll(): List<LocationLog>

    @Query("SELECT * FROM locationLog WHERE userId IN (:userId)")
    fun loadAllByIds(userId: Int): List<LocationLog>

    @Insert
    fun insertAll(vararg locationLog: LocationLog)

    @Delete
    fun delete(locationLog: LocationLog)
}
