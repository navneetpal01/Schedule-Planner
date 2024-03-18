package com.example.schedule_planner.presentation.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.schedule_planner.R
import com.example.schedule_planner.ui.theme.roboto_regular

@Composable
fun OnBoardingBottom(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxHeight(0.4f)
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.OnBoarding_Bottom_White))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth(),
                thickness = 4.dp,
                color = colorResource(id = R.color.OnBoarding_Bottom_Divider)
            )
            Indicator(
                modifier = Modifier
                    .padding(vertical = 40.dp),
                numberOfPages = 3,
                currentPage = 0
            )
        }
        Column(
            modifier = Modifier
                .width(325.dp)
                .padding(bottom = 60.dp)
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            ElevatedButton(
                modifier = Modifier
                    .height(45.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 1.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.OnBoarding_Bottom_FirstButton)),
                onClick = {
                }
            ) {
            }
            Spacer(modifier = Modifier.height(15.dp))
            ElevatedButton(
                modifier = Modifier
                    .height(45.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 1.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.OnBoarding_Bottom_Second_Button)),
                onClick = {
                }
            ) {
            }
        }
        Text(
            modifier = Modifier
                .align(Alignment.BottomCenter),
            text = " By logging in or registering, you agree to our Terms of /n service and Privacy policy.",
            fontSize = 10.sp,
            fontFamily = roboto_regular,
            lineHeight = 0.5.em
        )
    }
}