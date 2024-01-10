package mx.ipn.escom.verac.foodtruck.app

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import mx.ipn.escom.verac.foodtruck.screens.SignUpScreen

@Composable
fun FoodTruckApp(){
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ){
        SignUpScreen()

    }
}