package com.example.steps_app_project.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UsersDao {

   @Query("SELECT * FROM Users")
    fun getAll(): List<Users>

    @Insert
    fun insert(vararg user : Users)
    @Delete
    fun delete(users: Users)


}