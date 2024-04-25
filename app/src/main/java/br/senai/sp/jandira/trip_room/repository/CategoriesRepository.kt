package br.senai.sp.jandira.trip_room.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.trip_room.R
import br.senai.sp.jandira.trip_room.model.Categories

class CategoriesRepository {

    @Composable
    fun listAllCategories(): List<Categories>{

        val montain = Categories(

            id = 1,
            name = "Montain",
            image = painterResource(id = R.drawable.montanha)
        )
        
        val beach = Categories(
            id = 2,
            name = "Beach",
            image = painterResource(id = R.drawable.beach)
        )

        val snow = Categories(
            id = 3,
            name = "Snow",
            image = painterResource(id = R.drawable.ski)
        )

        return listOf(montain, beach, snow)
    }
}