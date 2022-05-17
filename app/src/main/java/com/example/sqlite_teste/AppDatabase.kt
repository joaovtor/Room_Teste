package com.example.sqlite_teste

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [LocationLog::class], version = 1)
    abstract class AppDatabase : RoomDatabase() {
        abstract fun locationLogDao(): LocationLogDAO
    }
