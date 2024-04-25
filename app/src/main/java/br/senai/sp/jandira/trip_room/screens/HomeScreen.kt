package br.senai.sp.jandira.trip_room.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.trip_room.repository.CategoriesRepository
import br.senai.sp.jandira.trip_room.repository.TravelRepository
import br.senai.sp.jandira.trip_room.utils.encurtarData

@Composable
fun HomeScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xffA09C9C))
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

            Surface (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(197.dp)
            ){
                Image(
                    painter = painterResource(id = br.senai.sp.jandira.trip_room.R.drawable.parisbg),
                    contentDescription = "paisagem",
                    contentScale = ContentScale.Crop
                )

                Column (

                    modifier = Modifier
                        .padding(16.dp)
                ){
                    Column (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.End
                    ){
                        Card (
                            modifier = Modifier
                                .height(60.dp)
                                .width(60.dp),
                            shape = CircleShape
                        ){
                            Image(painter = painterResource(
                                id = br.senai.sp.jandira.trip_room.R.drawable.howl),
                                contentDescription = "Howl",
                                contentScale = ContentScale.Inside)
                        }
                        Text(text = "Kainan Braga", fontSize = 14.sp, color = Color.White, fontWeight = FontWeight.Bold)
                    }
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Bottom
                    ){

                        Row {
                            Icon(imageVector = Icons.Default.Place, contentDescription = "lugar", tint = Color(0xffFFFFFF))
                            Text(text = "You're in Paris", fontSize = 14.sp, color = Color(0xffFFFFFF))
                        }
                        Text(text = "My Trips", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color(0xffFFFFFF))
                    }
                }
            }


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {

                Text(
                    text = "Categories",
                    fontSize = 16.sp,
                    color = Color(0xff565454)
                )

                var categories = CategoriesRepository().listAllCategories()

                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {


                    items(categories) {
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .height(65.dp)
                                .width(110.dp)
                                .padding(end = 2.dp),
                            shape = RoundedCornerShape(8.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xff7d8cc4)
                            )
                        ) {

                            Column(
                                modifier = Modifier
                                    .fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {

                                Image(
                                    painter = it.image!!,
                                    contentDescription = "Category image",
                                    modifier = Modifier
                                        .height(32.dp)
                                        .width(32.dp)
                                )
                                Text(
                                    text = it.name,
                                    color = Color(0xffffffff)
                                )
                            }
                        }
                    }





                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            var pesquisa = remember {
                mutableStateOf("")
            }



                OutlinedTextField(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    value = pesquisa.value,
                    onValueChange = {
                        pesquisa.value = it
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffFFFFFF),
                        unfocusedContainerColor = Color(0xffFFFFFF),
                        focusedBorderColor = Color(0xffFFFFFF),
                        unfocusedBorderColor = Color(0xffFFFFFF)
                    ),
                    //shape = RoundedCornerShape(16.dp),
                    placeholder = {
                        Text(
                            text = "Search your destiny",
                            color = Color(
                                0xffA09C9C
                            )
                        )
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "search",
                            tint = Color(0xffA09C9C)
                        )
                    }
                )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Past Trips",
                fontSize = 16.sp,
                color = Color(0xff565454),
                modifier = Modifier.padding(start = 16.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            var travels = TravelRepository().listAllTravels()
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ){


                items(travels) {
                    Card (
                        modifier = Modifier
                            .width(330.dp)
                            .padding(bottom = 10.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xffFFFFFF)
                        )
                    ){
                        Surface (
                            modifier = Modifier.fillMaxWidth()
                        ){
                            Image(
                                painter = if (it.image == null) painterResource(id = br.senai.sp.jandira.trip_room.R.drawable.notimage) else it.image!!,
                                contentDescription = "destiny image",
                                contentScale = ContentScale.FillWidth
                            )

                        }
                        Column {

                        }
                        Row (
                            Modifier.padding(top = 5.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Icon(imageVector = Icons.Default.Place,
                                contentDescription = "",
                                tint = Color(0xff7d8cc4)
                            )
                            Text(text = "${it.destiny}, ${it.checkinDate.year}",
                                color = Color(0xff7d8cc4),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 4.dp)
                            )
                        }
                        Text(
                            text = it.description,
                            fontSize = 10.sp,
                            color = Color(0xffA09C9C),
                            modifier = Modifier.padding(start = 8.dp)

                            )
                        Text(text = "${encurtarData(it.checkinDate)} - ${encurtarData(it.checkoutDate)}",
                            color = Color(0xff7d8cc4),
                            modifier = Modifier
                                .align(Alignment.End)
                                .padding(end = 12.dp))
                    }

                }




                }



            }





        }
    }


@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}