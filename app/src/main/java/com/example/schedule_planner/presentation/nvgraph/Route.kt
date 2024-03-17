package com.example.schedule_planner.presentation.nvgraph

sealed class Route(
    val route : String
){
    object AppStartNavigation : Route(route = "AppStartNavigation")
    object SchedulePlannerNavigation : Route(route = "SchedulePlannerNavigation")
    object OnBoardingScreen : Route(route = "OnBoardingScreen")
    object HomeScreen : Route(route = "HomeScreen")
}