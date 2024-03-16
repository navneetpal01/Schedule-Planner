package com.example.schedule_planner.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember

@Composable
fun ProvidesAppUtils(
    schedulePlannerDimens: SchedulePlannerDimens,
    orientation: Orientation,
    content : @Composable () -> Unit
){
    val schedulePlannerDimens = remember { schedulePlannerDimens }
    val orientation = remember { orientation }
    CompositionLocalProvider(
        LocalSchedulePlannerDimens provides schedulePlannerDimens,
        LocalOrientationMode provides orientation,
        content = content
    )
}

val LocalSchedulePlannerDimens = compositionLocalOf {
    smallSchedulePlannerDimens
}

val LocalOrientationMode = compositionLocalOf {
    Orientation.Portrait
}