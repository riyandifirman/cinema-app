package com.riyandifirman.cinemawiki.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.riyandifirman.cinemawiki.model.Movie

@Composable
fun MovieComponent(movie: Movie) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = 4.dp,
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(movie.poster),
                contentDescription = movie.title,
                modifier = Modifier
                    .size(60.dp, 90.dp)
                    .clip(RoundedCornerShape(10.dp))
            )
            Column(
                modifier = Modifier
                    .width(320.dp)
                    .padding(start = 16.dp)
            ) {
                Text(text = movie.title, style = MaterialTheme.typography.h6, maxLines = 1, overflow = TextOverflow.Ellipsis)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = movie.years, style = MaterialTheme.typography.body1)
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp),
                horizontalAlignment = Alignment.End
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(com.riyandifirman.cinemawiki.R.drawable.ic_star_yellow),
                        contentDescription = "rating",
                        modifier = Modifier.size(12.dp)
                    )
                    Text(text = movie.rating, style = MaterialTheme.typography.body2, modifier = Modifier.padding(start = 4.dp))
                }
            }
        }
    }
}