package com.example.steps_app_project.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Steps(
    @PrimaryKey
    val id: String,
    val steps : Int,
    val date : String,
    val day : String
    ){}


