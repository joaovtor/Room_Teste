package com.example.sqlite_teste

import android.content.Context
import androidx.room.Room

class DatabaseManager(private val applicationContext: Context) {

    val db = Room.databaseBuilder(
        applicationContext,
        AppDatabase::class.java, "database-name"
    ).build()

    fun getAllLogs(): List<LocationLog> {
        return db.locationLogDao().getAll()
    }

    fun insertLog(log: LocationLog) {
        db.locationLogDao().insertAll(log)
    }
}