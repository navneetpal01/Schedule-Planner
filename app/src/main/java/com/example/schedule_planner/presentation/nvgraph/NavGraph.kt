package com.example.schedule_planner.presentation.nvgraph

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph(
    startDestination : String
){
    val navController : NavHostController  = rememberNavController()
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
    ){
        val statusBarPadding = it.calculateTopPadding()
        NavHost(
            modifier = Modifier
                .fillMaxSize(),
            navController = navController,
            startDestination = startDestination
        ){

        }
    }
}