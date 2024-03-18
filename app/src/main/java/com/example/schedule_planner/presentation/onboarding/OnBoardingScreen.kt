package com.example.schedule_planner.presentation.onboarding

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import com.example.schedule_planner.presentation.onboarding.components.OnBoardingBottom
import com.example.schedule_planner.presentation.onboarding.components.OnBoardingTop

@Composable
fun OnBoardingScreen(
    statusBarPadding: Dp
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        OnBoardingTop(
            modifier = Modifier
                .padding(top = statusBarPadding)
        )
        OnBoardingBottom(
            modifier = Modifier
                .align(Alignment.BottomCenter)
        )
    }
}