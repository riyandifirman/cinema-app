package com.riyandifirman.cinemawiki.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.riyandifirman.cinemawiki.ui.screen.about.AboutScreen
import com.riyandifirman.cinemawiki.ui.screen.home.HomeScreen
import com.riyandifirman.cinemawiki.ui.screen.home.HomeViewModel

@Composable
fun MainApp() {
    val navController = rememberNavController()
    val viewModel: HomeViewModel = viewModel()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController = navController, viewModel = viewModel)
        }
        composable("about") {
            AboutScreen()
        }
    }
}