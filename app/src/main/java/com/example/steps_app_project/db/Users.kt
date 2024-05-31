package com.example.steps_app_project.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Users(
    @PrimaryKey
    val id : String,
    val name : String,
    val gender : String,
    val born : String
)

