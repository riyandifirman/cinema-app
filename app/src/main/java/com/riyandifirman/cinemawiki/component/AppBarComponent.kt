package com.riyandifirman.cinemawiki.component

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.riyandifirman.cinemawiki.R

@Composable
fun MyAppBar() {
    TopAppBar(
        title = { Text(
            text = "Cinema Wiki",
            color = colorResource(id = R.color.white),
            style = MaterialTheme.typography.h6,
            fontWeight = FontWeight.Bold) },
        actions = {
            IconButton(onClick = { /* Aksi saat menu About di-klik */ }) {
                Icon(
                    painter = painterResource(R.drawable.ic_about_profile),
                    contentDescription = "about_page",
                    tint = MaterialTheme.colors.onPrimary,
                    modifier = Modifier.size(36.dp)
                )
            }
        },
        backgroundColor = colorResource(id = R.color.black)
    )
}