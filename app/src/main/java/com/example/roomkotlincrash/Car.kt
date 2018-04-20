package com.example.roomkotlincrash

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "cars")
data class Car(@PrimaryKey val id: String, val name: String)
