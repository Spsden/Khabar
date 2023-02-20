package com.example.khabar.ui

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.khabar.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){

    LaunchedEffect(key1 = true) {

        delay(1000)
        navController.navigate("home") {
            popUpTo("splash_screen") {
                inclusive = true
            }
        }
    }
    
    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.news),
            contentDescription = "",
            alignment = Alignment.Center, modifier = Modifier
                .fillMaxSize().padding(60.dp)

        )
        Text(
            text = "Khabar",
            textAlign = TextAlign.Center,

            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.BottomCenter).padding(16.dp)
        )
        
    }

}