package com.example.schedule_planner.presentation.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.example.schedule_planner.ui.theme.selectedGrad
import com.example.schedule_planner.ui.theme.unSelectedGrad

@Composable
fun Indicator(
    modifier: Modifier = Modifier,
    numberOfPages: Int,
    currentPage: Int,
    selectedColor: Brush = selectedGrad,
    unSelectedColor: Brush = unSelectedGrad
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Start
    ) {
        repeat(
          times = numberOfPages
        ) {page ->
            Box(
                modifier = Modifier
                    .height(5.dp)
                    .width(if (page == currentPage) 50.dp else 20.dp)
                    .padding(horizontal = 2.dp)
                    .background(
                        brush = if (page == currentPage) selectedColor else unSelectedColor,
                        shape = RoundedCornerShape(CornerSize(5.dp))
                    )
            )
        }
    }
}