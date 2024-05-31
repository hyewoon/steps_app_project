package com.example.steps_app_project.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Users::class, Steps::class], version = 1)
abstract class StepsAppDataBase : RoomDatabase() {

    //UserDao타입을 반환하는 추상 메소드 선언
    abstract fun UsersDao(): UsersDao

    //StepsDAO타입을 반환하는 추상 메소드 선언
    abstract fun StepsDao(): StepsDao

    //appDataBase 싱클톤 생성 : 앱 전체에서 사용할 수 있는하나의 인스턴스

    companion object {
        @Volatile
        private var INSTANCE: StepsAppDataBase? = null

        fun getDatabase(context: Context): StepsAppDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    StepsAppDataBase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}

