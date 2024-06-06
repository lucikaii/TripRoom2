package br.senai.sp.jandira.trip_room.model

import androidx.compose.ui.graphics.painter.Painter
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_usuarios")
data class Users(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var name: String = "",
    var email: String = "",
    var password: String = ""
)
