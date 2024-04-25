package br.senai.sp.jandira.trip_room

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.trip_room.screens.HomeScreen
import br.senai.sp.jandira.trip_room.screens.LoginScreen
import br.senai.sp.jandira.trip_room.screens.SignupScreen
import br.senai.sp.jandira.trip_room.ui.theme.TRIPROOMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TRIPROOMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "Login"
                    ){
                        composable(route = "Login"){ LoginScreen(navController)}
                        composable(route = "Signup"){ SignupScreen(navController)}
                        composable(route = "Home"){ HomeScreen()}
                    }
                }
            }
        }
    }

}

@Composable
fun Greeting() {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TRIPROOMTheme {
        Greeting()
    }
}