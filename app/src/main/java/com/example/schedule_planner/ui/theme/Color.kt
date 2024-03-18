package com.example.schedule_planner.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)


//-------------------------------------------------------------
val selectedGrad1 = Color(0xFF46A6FF)
val selectedGrad2 = Color(0xFF55FFF5)
val unselectedGrad = Color(0xFFd9d9d9)

val selectedGrad = Brush.linearGradient(
    listOf(selectedGrad1, selectedGrad2)
)
val unSelectedGrad = Brush.linearGradient(
    listOf(unselectedGrad, unselectedGrad)
)