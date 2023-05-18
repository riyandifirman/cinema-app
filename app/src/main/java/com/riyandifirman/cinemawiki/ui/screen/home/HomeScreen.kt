package com.riyandifirman.cinemawiki.ui.screen.home

import android.annotation.SuppressLint
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.riyandifirman.cinemawiki.component.MovieComponent
import com.riyandifirman.cinemawiki.component.MyAppBar
import com.riyandifirman.cinemawiki.model.Movie

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController, viewModel: HomeViewModel) {
    val movieList = viewModel.listMovie.value
    val navigateToDetail: (Movie) -> Unit = { movie ->
        navController.navigate("detail/${movie.id}")
    }

    Scaffold(
        topBar = {
            MyAppBar(navController)
        },
        content = {
            LazyColumn {
                items(movieList.size) { index ->
                    MovieComponent(movie = movieList[index]) {
                        navigateToDetail(movieList[index])
                    }
                }
            }
        }
    )
}