package com.example.focusminder.repository

import androidx.room.Query
import com.example.focusminder.database.TaskDatabase
import com.example.focusminder.model.Task

class TaskRepository(private val db : TaskDatabase) {

    suspend fun insertTask(task: Task) =db.getTaskDao().insertTask(task)
    suspend fun deleteTask(task: Task) =db.getTaskDao().deleteTask(task)
    suspend fun updateTask(task: Task) =db.getTaskDao().updateTask(task)

    fun getAlTask() = db.getTaskDao().getAllTask()
    fun searchTask(query: String?) = db.getTaskDao().searchTask(query)

}