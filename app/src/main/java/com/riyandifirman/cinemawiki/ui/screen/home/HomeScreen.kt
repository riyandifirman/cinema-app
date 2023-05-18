package com.riyandifirman.cinemawiki.ui.screen.home

import android.annotation.SuppressLint
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.riyandifirman.cinemawiki.component.MovieComponent
import com.riyandifirman.cinemawiki.component.MyAppBar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(viewModel: HomeViewModel) {
    val movieList = viewModel.listMovie.value

    Scaffold(
        topBar = {
            MyAppBar()
        },
        content = {
            LazyColumn {
                items(movieList.size) { index ->
                    MovieComponent(movie = movieList[index])
                }
            }
        }
    )
}