package com.example.schedule_planner.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.schedule_planner.R

val roboto_black = FontFamily(Font(R.font.roboto_black))
val roboto_blackitalic = FontFamily(Font(R.font.roboto_blackitalic))
val roboto_bold = FontFamily(Font(R.font.roboto_bold))
val roboto_bolditalic = FontFamily(Font(R.font.roboto_bolditalic))
val roboto_italic= FontFamily(Font(R.font.roboto_italic))
val roboto_light = FontFamily(Font(R.font.roboto_light))
val roboto_lightitalic = FontFamily(Font(R.font.roboto_lightitalic))
val roboto_medium = FontFamily(Font(R.font.roboto_medium))
val roboto_mediumitalic = FontFamily(Font(R.font.roboto_mediumitalic))
val roboto_regular = FontFamily(Font(R.font.roboto_regular))
val roboto_thin = FontFamily(Font(R.font.roboto_thin))
val roboto_thinitalic = FontFamily(Font(R.font.roboto_thinitalic))




data class SchedulePlannerDimens(
    val oneDp : Dp,
    val fiveDp : Dp
)

val smallSchedulePlannerDimens = SchedulePlannerDimens(
    oneDp = 1.dp,
    fiveDp = 5.dp
)

//main 361
val compactSchedulePlannerDimens = SchedulePlannerDimens(
    oneDp = 1.dp,
    fiveDp = 5.dp
)

val mediumSchedulePlannerDimens = SchedulePlannerDimens(
    oneDp = 1.dp,
    fiveDp = 5.dp
)

val largeSchedulePlannerDimens = SchedulePlannerDimens(
    oneDp = 1.dp,
    fiveDp = 5.dp
)