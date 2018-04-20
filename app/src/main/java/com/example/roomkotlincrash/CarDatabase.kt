package com.example.roomkotlincrash

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [(Car::class)], version = 1, exportSchema = false)
abstract class CarDatabase : RoomDatabase() {

    abstract fun dao(): CarDao
}
