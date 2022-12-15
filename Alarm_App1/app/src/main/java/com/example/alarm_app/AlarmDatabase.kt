package com.example.alarm_app

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import okhttp3.internal.connection.RouteDatabase

@Database(entities = [Alarm::class], version = 1, exportSchema = false)
abstract class AlarmDatabase: RoomDatabase(){
    abstract fun getAlarmDao(): AlarmDao
    companion object{
        @Volatile
        private var instance: AlarmDatabase?=null
        fun getInstance(context: Context): AlarmDatabase{
            if(instance == null){
                instance =
                    Room.databaseBuilder(
                        context,
                        AlarmDatabase::class.java,
                        "AlarmDatabase"
                    ).build()
            }
            return instance!!
        }


    }
}