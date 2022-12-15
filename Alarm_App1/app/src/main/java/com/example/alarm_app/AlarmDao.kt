package com.example.alarm_app

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface AlarmDao {
    @Insert
    suspend fun insert(alarm: Alarm)
    @Update
    suspend fun update(alarm: Alarm)
    @Delete
    suspend fun delete(alarm: Alarm)
    @Query("SELECT *FROM ALARM")
    fun getAll(): LiveData<List<Alarm>>
}