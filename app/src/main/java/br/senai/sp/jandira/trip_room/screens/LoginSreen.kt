package br.senai.sp.jandira.trip_room.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowRight
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun LoginScreen(navController: NavController){

    Surface (
        modifier = Modifier
            .fillMaxSize()
    ){

        var email = remember {
            mutableStateOf("")
        }

        var password = remember {
            mutableStateOf("")
        }

        Column (
            modifier = Modifier
                .fillMaxSize()
        ){

            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ){

                Box(
                    modifier = Modifier
                        .height(40.dp)
                        .width(120.dp)
                        .background(
                            color = Color(0xff7D8CC4),
                            shape = RoundedCornerShape(bottomStart = 16.dp)
                        )
                )
            }

            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 35.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Card (
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(containerColor = Color(0xff7D8CC4))
                ){

                }
            }
            Column (
                modifier = Modifier
                    .padding(start = 16.dp, top = 30.dp)
            ){

                Text(
                    text = "Login",
                    color = Color(0xff7D8CC4),
                    fontSize = 48.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                Text(
                    text = "Please, sign in to continue",
                    color = Color(0xffA09C9C),
                    fontSize = 14.sp
                )
            }

            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 60.dp)
            ){

                OutlinedTextField(
                    value = email.value,
                    onValueChange = {
                        email.value = it
                    },
                    label = {
                        Text(text = "E-mail")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xff7d8cc4),
                        focusedBorderColor = Color(0xff7d8cc4)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                )

                OutlinedTextField(
                    value = password.value,
                    onValueChange = {
                        password.value = it
                    },
                    label = {
                        Text(text = "Senha")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xff7d8cc4),
                        focusedBorderColor = Color(0xff7d8cc4)
                    ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp)
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 30.dp, end = 16.dp)
                    .align(alignment = Alignment.End)
            ) {
                Button(
                    modifier = Modifier
                        .height(50.dp)
                        .width(130.dp),
                    shape = RoundedCornerShape(16.dp),
                    onClick = {
                              if (email.value == "kainan" && password.value == "kai123"){

                                  navController.navigate("Home")
                              } else{

                              }
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xff7d8cc4))
                ) {

                    Text(text = "SIGN IN", color = Color(0xffffffff))
                    Icon(
                        imageVector = Icons.Outlined.KeyboardArrowRight,
                        contentDescription = "Seta"
                    )
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 30.dp, end = 16.dp)
                    .align(alignment = Alignment.End)
            ) {
                Text(
                    text = "Don't have an account?",
                    color = Color(0xffA09C9C),
                    fontSize = 12.sp
                )
                Text(
                    text = "Sign Up",
                    color = Color(0xff7d8cc4),
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    modifier = Modifier.clickable {
                        navController.navigate("Signup")
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalAlignment = Alignment.Bottom
            ) {
                Box(
                    modifier = Modifier
                        .height(40.dp)
                        .width(120.dp)
                        .background(
                            color = Color(0xff7d8cc4),
                            shape = RoundedCornerShape(topEnd = 16.dp)
                        )
                )
            }






        }
    }
}


@Preview (showSystemUi = true)
@Composable
fun LoginSreenPreview() {

}