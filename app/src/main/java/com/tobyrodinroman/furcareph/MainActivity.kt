package com.tobyrodinroman.furcareph

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.tobyrodinroman.furcareph.navigation.AppNavigation
import com.tobyrodinroman.furcareph.theme.FurCarePHTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FurCarePHTheme {
                AppNavigation()
            }
        }
    }
}
