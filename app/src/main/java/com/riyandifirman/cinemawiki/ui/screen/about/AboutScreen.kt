package com.riyandifirman.cinemawiki.ui.screen.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.riyandifirman.cinemawiki.R

@Composable
fun AboutScreen() {
    val drawableResId = R.drawable.ic_foto

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "About Me",
            style = TextStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(top = 50.dp)
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = rememberImagePainter(
                data = drawableResId,
                builder = {
                    crossfade(true)
                }
            ),
            contentDescription = "Profile Image",
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape)
        )
        Text(
            text = "Riyandi Firman Pratama",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(vertical = 16.dp)
        )
        Text(
            text = "riyandi.firman08@gmail.com",
            style = TextStyle(fontSize = 16.sp),
            textAlign = TextAlign.Center
        )
    }
}

@Preview (showBackground = true)
@Composable
fun AboutScreenPreview() {
    AboutScreen()
}