package com.example.alarm_app
import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
class AlarmViewModel(application: Application): ViewModel() {
    private val alarmRespository: AlarmRespository= AlarmRespository(application)
    fun insertNote(alarm: Alarm) = viewModelScope.launch {
        alarmRespository.insert(alarm)
    }
    fun updatetNote(alarm: Alarm) = viewModelScope.launch {
        alarmRespository.updatet(alarm)
    }
    fun deleteNote(alarm: Alarm) = viewModelScope.launch {
        alarmRespository.delete(alarm)
    }
    fun getAllNote(): LiveData<List<Alarm>> =alarmRespository.getAll()
    class NoteViewModelFactory(private val application: Application): ViewModelProvider.Factory{
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if(modelClass.isAssignableFrom(AlarmViewModel::class.java))
            {
                @Suppress("UNCHECKED_CAST")
                return AlarmViewModel(application) as T
            }
            throw  IllegalAccessException("Unable construct viewModel")
        }
    }
}