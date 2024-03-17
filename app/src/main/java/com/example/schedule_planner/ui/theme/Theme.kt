package com.example.schedule_planner.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun SchedulePlannerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    windowSizeClass: WindowSizeClass,
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val orientation = when{
        windowSizeClass.width.size > windowSizeClass.height.size -> Orientation.Landscape
        else -> Orientation.Portrait
    }

    val sizeThatMatters = when(orientation){
        Orientation.Portrait -> windowSizeClass.width
        Orientation.Landscape -> windowSizeClass.height
    }


    val schedulePlannerDimens = when(sizeThatMatters){
        is WindowSize.Small -> smallSchedulePlannerDimens
        is WindowSize.Compact -> compactSchedulePlannerDimens
        is WindowSize.Medium -> mediumSchedulePlannerDimens
        else -> largeSchedulePlannerDimens
    }

    ProvidesAppUtils(schedulePlannerDimens = schedulePlannerDimens, orientation = orientation) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }

}

object AppTheme{
    val schedulePlannerDimens : SchedulePlannerDimens
    @Composable
    get() = LocalSchedulePlannerDimens.current

    val orientation : Orientation
    @Composable
    get() = LocalOrientationMode.current
}