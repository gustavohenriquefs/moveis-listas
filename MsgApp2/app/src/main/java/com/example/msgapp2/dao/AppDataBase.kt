package com.example.msgapp2.dao

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [com.example.msgapp2.model.Message::class], version =  1, exportSchema = false)
abstract class AppDataBase: RoomDatabase() {
    abstract fun messageDao(): MessageDao
}