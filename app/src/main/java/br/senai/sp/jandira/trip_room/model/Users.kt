package br.senai.sp.jandira.trip_room.model

import androidx.compose.ui.graphics.painter.Painter

data class Users(
    var id: Long = 0,
    var name: String = "",
    var email: String = "",
    var password: String = "",
    var userImage: Painter? = null
)
