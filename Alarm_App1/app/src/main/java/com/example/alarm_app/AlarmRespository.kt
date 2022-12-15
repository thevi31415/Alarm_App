package com.example.alarm_app

import android.app.Application
import androidx.lifecycle.LiveData

class AlarmRespository(app: Application) {
    private val alarmDao: AlarmDao
    init{
        val alarmDatabase: AlarmDatabase = AlarmDatabase.getInstance(app)
        alarmDao = alarmDatabase.getAlarmDao()
    }
    suspend fun insert(alarm: Alarm) = alarmDao.insert(alarm)
    suspend fun updatet(alarm: Alarm) = alarmDao.update(alarm)
    suspend fun delete(alarm: Alarm) = alarmDao.delete(alarm)
    fun  getAll(): LiveData<List<Alarm>> = alarmDao.getAll()
}