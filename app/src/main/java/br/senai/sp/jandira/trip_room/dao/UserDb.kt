package br.senai.sp.jandira.trip_room.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.trip_room.model.Users

@Database(entities = [Users::class], version = 1)
abstract class UserDb: RoomDatabase() {

    abstract fun userDao(): UserDao
    companion object{

        private lateinit var instancia: UserDb

        fun getDataBase(context: Context): UserDb{

            instancia = Room
                .databaseBuilder(
                    context,
                    UserDb::class.java,
                    "db_users"
                )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
            return instancia
        }
    }
}