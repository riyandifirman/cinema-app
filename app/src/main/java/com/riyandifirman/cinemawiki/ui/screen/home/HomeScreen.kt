package com.riyandifirman.cinemawiki.ui.screen.home

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.riyandifirman.cinemawiki.component.MovieComponent

@Composable
fun HomeScreen(viewModel: HomeViewModel) {
    val movieList = viewModel.listMovie.value

    LazyColumn {
        items(movieList.size) { index ->
            MovieComponent(movie = movieList[index])
        }
    }
}