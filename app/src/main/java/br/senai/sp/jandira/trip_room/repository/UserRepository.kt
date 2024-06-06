package br.senai.sp.jandira.trip_room.repository

import android.content.Context
import br.senai.sp.jandira.trip_room.dao.UserDb
import br.senai.sp.jandira.trip_room.model.Users

class UserRepository(context: Context) {

    private val db = UserDb.getDataBase(context).userDao()

    fun save(users: Users): Long{
        return  db.save(users)
    }
    fun listAllUsers(): List<Users>{
        return db.listAllUsers()
    }

    fun login(email: String, password: String): Users{
return db.login(email, password)
    }
}