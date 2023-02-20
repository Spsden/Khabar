package com.example.khabar.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.core.view.WindowCompat
import com.example.khabar.state.BaseState
import com.example.khabar.ui.HomePage
import com.example.khabar.ui.theme.KhabarTheme
import com.example.khabar.viewmodel.BaseVM
import com.example.khabar.viewmodel.HomeVM


abstract class BaseActivity<VM : BaseVM<State>, State : BaseState> : ComponentActivity() {
    abstract val viewModel: VM

    @Composable
    abstract fun Content()

    final override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            KhabarTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Content()
                    // Greeting("Android")
                }
            }


        }


    }
}