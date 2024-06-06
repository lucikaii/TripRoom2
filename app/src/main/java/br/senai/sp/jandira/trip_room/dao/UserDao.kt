package br.senai.sp.jandira.trip_room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.senai.sp.jandira.trip_room.model.Users

@Dao
interface UserDao {

    @Insert fun save(users: Users): Long
    @Update fun update(users: Users): Int
    @Delete fun delete(users: Users): Int

    @Query("SELECT * FROM tbl_usuarios ORDER BY name ASC") fun listAllUsers(): List<Users>
    @Query("SELECT * FROM tbl_usuarios WHERE id = :id") fun consultByIdUser(id: Long): Users

    @Query("SELECT * FROM tbl_usuarios WHERE email = :email AND password = :password")
    fun login(email: String, password: String): Users
}