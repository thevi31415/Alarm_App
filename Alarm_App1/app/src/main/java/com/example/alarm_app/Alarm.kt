package com.example.alarm_app

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Alarm(
    @PrimaryKey val uid: Long?,
    @ColumnInfo var hour: Int,
    @ColumnInfo var minute: Int,
    @ColumnInfo var mon: Boolean,
    @ColumnInfo var tue: Boolean,
    @ColumnInfo var web: Boolean,
    @ColumnInfo var thu: Boolean,
    @ColumnInfo var  fri: Boolean,
    @ColumnInfo var sat: Boolean,
    @ColumnInfo var sun: Boolean,
    @ColumnInfo var start: Boolean,

    )
