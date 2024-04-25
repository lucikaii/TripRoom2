package br.senai.sp.jandira.trip_room.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.trip_room.R
import br.senai.sp.jandira.trip_room.model.Travel
import java.time.LocalDate

class TravelRepository {

    @Composable
    fun listAllTravels(): List<Travel>{


        val londres = Travel(
            id = 1,
            destiny = "London",
            description = "London is the capital and largest city of England, and the United Kingdom, with a population of around 8.8 million.",
            checkinDate = LocalDate.of(2024,2,18),
            checkoutDate = LocalDate.of(2024,2,24),
            image = painterResource(id = R.drawable.london)
        )
        val seoul = Travel(
            id = 2,
            destiny = "Seoul",
            description = "Seoul, officially Seoul Special City and formerly known as Hanseong and Keijo is the capital of South Korea",
            checkinDate = LocalDate.of(2024,12,1),
            checkoutDate = LocalDate.of(2024,12,28),
            image = painterResource(id = R.drawable.seoul)
        )
        val paris = Travel(
            id = 3,
            destiny = "Paris",
            description = "Paris, the cosmopolitan capital of France, is one of the largest agglomerations in Europe, with 2.2 million people living in the dense central city.",
            checkinDate = LocalDate.of(2023,2,8),
            checkoutDate = LocalDate.of(2023,3,4),
            image = painterResource(id = R.drawable.paris)
        )
        val rio = Travel(
            id = 4,
            destiny = "Rio",
            description = "Rio de Janeiro, or simply Rio, is the capital of the state of Rio de Janeiro. It is the second most populous city in Brazil after São Paulo",
            checkinDate = LocalDate.of(2021,12,29),
            checkoutDate = LocalDate.of(2022,1,10),
            image = painterResource(id = R.drawable.rio)
        )
        val tokyo = Travel(
            id = 5,
            destiny = "Tokyo",
            description = "Tokyo is the capital of Japan and one of the most populous cities in the world, with a population of over 14 million residents as of 2023.",
            checkinDate = LocalDate.of(2024,4,10),
            checkoutDate = LocalDate.of(2024,4,20),
            image = painterResource(id = R.drawable.tokyo)
        )
        val saopaulo = Travel(
            id = 6,
            destiny = "São Paulo",
            description = "São Paulo is the most populous city in Brazil and the capital of the state of São Paulo.",
            checkinDate = LocalDate.of(2024, 3, 10),
            checkoutDate = LocalDate.of(2024, 3, 17),
            image = painterResource(id = R.drawable.saopaulo)


        )
        val dubai = Travel(
            id = 7,
            destiny = "Dubai",
            description = "Dubai is the most populous city in the United Arab Emirates and the capital of Emirate of Dubai",
            checkinDate = LocalDate.of(2024,4,10),
            checkoutDate = LocalDate.of(2024,4,20),
            image = painterResource(id = R.drawable.dubai)
        )
        val pequim = Travel(
            id = 8,
            destiny = "Beijing",
            description = "Beijing is the capital of Chine, with more than 22 million residents, and is the world's most populous national capital city as well as China's second largest city after Shanghai",
            checkinDate = LocalDate.of(2024,4,10),
            checkoutDate = LocalDate.of(2024,4,20),
            image = painterResource(id = R.drawable.pequim)
        )
        val jandira = Travel(
            id = 9,
            destiny = "Jandira",
            description = "Jandira a municipality in the state of São Paulo, the best city in the world with the highest IDH .",
            checkinDate = LocalDate.of(2006, 7, 24),
            checkoutDate = LocalDate.of(2026, 2, 21),
            image = painterResource(id = R.drawable.jandira)
        )


        return listOf(jandira ,londres, seoul, paris, rio, tokyo, saopaulo, dubai, pequim)
    }

}