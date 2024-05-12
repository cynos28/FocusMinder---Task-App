package com.example.focusminder.model

import androidx.room.Entity
import android.os.Parcelable
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "task")
@Parcelize
data class Task(
    @PrimaryKey(autoGenerate = true)
    val id :Int,
    val taskTitle:String,
    val taskDesc:String
):Parcelable
