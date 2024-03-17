package com.example.schedule_planner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import com.example.schedule_planner.presentation.nvgraph.NavGraph
import com.example.schedule_planner.presentation.nvgraph.Route
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
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = colorResource(id = R.color.System_White))
                ){
                    NavGraph(startDestination = Route.AppStartNavigation.route)
                }
            }
        }
    }
}

