package br.senai.sp.jandira.trip_room.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalDate

data class Travel(

    var id: Int = 0,
    var destiny: String = "",
    var description: String = "",
    var checkinDate: LocalDate = LocalDate.now(),
    var checkoutDate: LocalDate = LocalDate.now(),
    var image: Painter? = null
)
