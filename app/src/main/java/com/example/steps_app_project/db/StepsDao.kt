package com.example.steps_app_project.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StepsDao {

    @Insert
    fun insert(vararg steps: Steps)

    @Query("SELECT * FROM Steps")
    fun getAll():List<Steps>

    @Delete
    fun delete(steps: Steps)

}