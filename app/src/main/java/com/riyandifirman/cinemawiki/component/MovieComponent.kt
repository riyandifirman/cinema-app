package com.riyandifirman.cinemawiki.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.riyandifirman.cinemawiki.model.Movie

@Composable
fun MovieComponent(movie: Movie) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(movie.poster),
            contentDescription = movie.title,
            modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(4.dp))
        )
        Column(
            modifier = Modifier.padding(start = 16.dp)
        ) {
            Text(text = movie.title, style = MaterialTheme.typography.h6)
            Text(text = movie.years, style = MaterialTheme.typography.body2)
            Text(text = movie.rating, style = MaterialTheme.typography.body2)
        }
    }
}