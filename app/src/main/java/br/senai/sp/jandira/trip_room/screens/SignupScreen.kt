package br.senai.sp.jandira.trip_room.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.trip_room.R
import br.senai.sp.jandira.trip_room.model.Users
import br.senai.sp.jandira.trip_room.repository.UserRepository

@Composable
fun SignupScreen(navController: NavController){

    val ur = UserRepository(LocalContext.current)
    var name = remember {
        mutableStateOf("")
    }
    var email = remember {
        mutableStateOf("")
    }
    var password = remember {
        mutableStateOf("")
    }
    var confirmPassword = remember {
        mutableStateOf("")
    }
    var isOverEightteen = remember {
        mutableStateOf(false)
    }
    var errorMessage = remember {
        mutableStateOf("")
    }

    Surface (
        modifier = Modifier
            .fillMaxSize()
    ){

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
                        ))
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.signup),
                    color = Color(0xff7d8cc4),
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(id = R.string.signup_message),
                    color = Color(0xffA09C9C),
                    fontSize = 14.sp
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp),
                horizontalArrangement = Arrangement.Center
            ) {

                Card(
                    modifier = Modifier
                        .height(100.dp)
                        .width(100.dp),
                    shape = CircleShape,
                    border = BorderStroke(width = 2.dp, color = Color(0xff7d8cc4))
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Person,
                        contentDescription = "foto de perfil",
                        tint = Color(0xff7d8cc4),
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp)
                            .padding(start = 17.dp, top = 17.dp)
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 25.dp)
            ) {

                OutlinedTextField(
                    value = name.value,
                    onValueChange = {
                                    name.value = it
                    },
                    label = {
                        Text(text = stringResource(id = R.string.username), color = Color(0xff000000))
                    },
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xff7d8cc4),
                        focusedBorderColor = Color(0xff7d8cc4)
                    )
                )

                OutlinedTextField(
                    value = email.value,
                    onValueChange = {
                                    email.value = it
                    },
                    label = {
                        Text(text = stringResource(id = R.string.email), color = Color(0xff000000))
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xff7d8cc4),
                        focusedBorderColor = Color(0xff7d8cc4)
                    )
                )

                OutlinedTextField(
                    value = password.value,
                    onValueChange = {
                                    password.value = it
                    },
                    label = {
                        Text(text = stringResource(id = R.string.password), color = Color(0xff000000))
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xff7d8cc4),
                        focusedBorderColor = Color(0xff7d8cc4)
                    )
                )

                OutlinedTextField(
                    value = confirmPassword.value,
                    onValueChange = {
                                    confirmPassword.value = it
                    },
                    label = {
                        Text(text = stringResource(id = R.string.confirm_password), color = Color(0xff000000))
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xff7d8cc4),
                        focusedBorderColor = Color(0xff7d8cc4)
                    )
                )
                Text(text = errorMessage.value, color = Color.Red)
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp)
            ) {
                Checkbox(
                    checked = isOverEightteen.value,
                    onCheckedChange = {
                                      isOverEightteen.value = it
                    },
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color(0xff7d8cc4),
                        uncheckedColor = Color(0xff7d8cc4),
                        checkmarkColor = Color(0xffffffff)
                    )
                )
                Text(text = stringResource(id = R.string.over_age))
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, top = 15.dp)
            ) {
                Button(
                    onClick = {

                        if (isOverEightteen.value === true){

                            if (confirmPassword.value == password.value){

                                val user = Users(
                                    name = name.value,
                                    email = email.value,
                                    password = password.value
                                )

                                ur.save(user)
                            } else{
                                errorMessage.value = "As senhas devem ser iguais"
                            }
                        } else{
                            errorMessage.value = "Não tem idade suficiente para se cadastrar"
                        }

                    },
                    modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xff7d8cc4)
                    )
                ) {
                    Text(text = stringResource(id = R.string.create_account))
                }
            }

            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = stringResource(id = R.string.signup_change_to_login),
                    fontSize = 12.sp,
                    color = Color(0xffA09C9C)
                )
                Text(
                    text = stringResource(id = R.string.login),
                    fontSize = 12.sp,
                    color = Color(0xff7d8cc4),
                    fontWeight = FontWeight.Bold
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
fun SignupScreenPreview() {
    SignupScreen(navController = rememberNavController())
}