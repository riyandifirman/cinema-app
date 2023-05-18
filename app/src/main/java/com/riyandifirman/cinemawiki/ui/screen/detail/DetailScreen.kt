package com.riyandifirman.cinemawiki.ui.screen.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.riyandifirman.cinemawiki.R
import com.riyandifirman.cinemawiki.model.Movie

@Composable
fun DetailScreen(movie: Movie) {
    val drawableResId = movie.poster
    val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(scrollState)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, bottom = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = rememberImagePainter(
                        data = drawableResId,
                        builder = {
                            crossfade(true)
                        }
                    ),
                    contentDescription = movie.title,
                    modifier = Modifier
                        .size(250.dp, 300.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Column(
                    modifier = Modifier
                        .padding(start = 2.dp)
                ) {
                    Text(
                        text = movie.title,
                        style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
                        modifier = Modifier.padding(bottom = 16.dp, end = 16.dp)
                    )
                    Text(
                        text = "Year: ${movie.years}",
                        style = TextStyle(fontSize = 16.sp),
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Row(
                        modifier = Modifier.padding(bottom = 16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_star_yellow),
                            contentDescription = "rating",
                            modifier = Modifier.size(12.dp)
                        )
                        Text(
                            text = "${movie.rating}",
                            style = TextStyle(fontSize = 16.sp),
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    }
                    Text(
                        text = "Duration: ${movie.duration}",
                        style = TextStyle(fontSize = 16.sp),
                        modifier = Modifier.padding(bottom = 16.dp)
                    )
                    Text(
                        text = "Genre: ${movie.genre}",
                        style = TextStyle(fontSize = 16.sp),
                        modifier = Modifier.padding(bottom = 16.dp, end = 16.dp)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Text(
                    text = "Detail Movie",
                    style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(start = 24.dp)
                )
            }
            Row(modifier = Modifier
                .padding(bottom = 16.dp)) {
                Text(
                    text = "Director: ${movie.director}",
                    style = TextStyle(fontSize = 16.sp),
                    modifier = Modifier.padding(start = 24.dp)
                )
            }
            Row(modifier = Modifier
                .padding(bottom = 16.dp)) {
                Text(
                    text = "Writer: ${movie.writer}",
                    style = TextStyle(fontSize = 16.sp),
                    modifier = Modifier.padding(start = 24.dp)
                )
            }
            Row(modifier = Modifier
                .padding(bottom = 16.dp)) {
                Text(
                    text = "Stars: ${movie.stars}",
                    style = TextStyle(fontSize = 16.sp),
                    modifier = Modifier.padding(start = 24.dp, end = 16.dp)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Text(
                    text = "Overview Movie",
                    style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(start = 24.dp)
                )
            }
            Row(modifier = Modifier) {
                Text(
                    text = stringResource(id = movie.overview),
                    style = TextStyle(fontSize = 16.sp),
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(start = 24.dp, end = 16.dp)
                )
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(movie = Movie(
        1,
        com.riyandifirman.cinemawiki.R.drawable.movie_1,
        "Tokyo Drift",
        "1992",
        "8.9",
        "1h",
        "Drama",
        "Tim Robbins",
        "Tim Robbins",
        "Tim Robbins",
        com.riyandifirman.cinemawiki.R.string.overview_movie1,
    ))
}