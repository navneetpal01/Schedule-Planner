package com.example.schedule_planner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.schedule_planner.ui.theme.SchedulePlannerTheme
import com.example.schedule_planner.ui.theme.rememberWindowSizeClass

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.light(
                android.graphics.Color.TRANSPARENT,
                android.graphics.Color.TRANSPARENT
            )
        )
        super.onCreate(savedInstanceState)
        setContent {
            val windowSize = rememberWindowSizeClass()
            SchedulePlannerTheme(windowSizeClass = windowSize, darkTheme = false) {

            }
        }
    }
}

