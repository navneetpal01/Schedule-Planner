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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.schedule_planner.R
import com.example.schedule_planner.ui.theme.roboto_light
import com.example.schedule_planner.ui.theme.roboto_medium
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
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth(),
            thickness = 4.dp,
            color = colorResource(id = R.color.OnBoarding_Bottom_Divider)
        )
        Indicator(
            modifier = Modifier
                .padding(top = 60.dp)
                .align(Alignment.TopCenter),
            numberOfPages = 3,
            currentPage = 0
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp)
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            ElevatedButton(
                modifier = Modifier
                    .height(45.dp)
                    .fillMaxWidth(),
                onClick = {
                },
                shape = RoundedCornerShape(10.dp),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 1.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.OnBoarding_Bottom_FirstButton)),
            ) {
                Text(
                    text = "Log in",
                    fontSize = 20.sp,
                    fontFamily = roboto_regular,
                    color = colorResource(id = R.color.OnBoarding_Bottom_White)
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            ElevatedButton(
                modifier = Modifier
                    .height(45.dp)
                    .fillMaxWidth(),
                onClick = {
                },
                shape = RoundedCornerShape(10.dp),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 1.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.OnBoarding_Bottom_Second_Button)),
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 20.sp,
                    fontFamily = roboto_regular,
                    color = colorResource(id = R.color.System_Blue)
                )
            }
        }
        Text(
            modifier = Modifier
                .padding(bottom = 30.dp, start = 15.dp)
                .align(Alignment.BottomStart),
            lineHeight = 0.8.em,
            text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = colorResource(id = R.color.OnBoarding_Bottom_TextColor),
                        fontFamily = roboto_light,
                        fontSize = 12.sp
                    )
                ) {
                    append(text = "By logging in or registering, you agree to our ")
                }
                withStyle(
                    style = SpanStyle(
                        color = colorResource(id = R.color.System_Blue),
                        fontFamily = roboto_medium,
                        fontSize = 12.sp
                    )
                ) {
                    append(text = "Terms of")
                }
                append("\n")
                withStyle(
                    style = SpanStyle(
                        color = colorResource(id = R.color.System_Blue),
                        fontFamily = roboto_medium,
                        fontSize = 12.sp
                    )
                ) {
                    append("service")
                }
                withStyle(
                    style = SpanStyle(
                        color = colorResource(id = R.color.OnBoarding_Bottom_TextColor),
                        fontFamily = roboto_light,
                        fontSize = 12.sp
                    )
                ) {
                    append(text = " and ")
                }
                withStyle(
                    style = SpanStyle(
                        color = colorResource(id = R.color.System_Blue),
                        fontFamily = roboto_medium,
                        fontSize = 12.sp
                    )
                ) {
                    append("Privacy policy.")
                }


            }
        )

    }
}