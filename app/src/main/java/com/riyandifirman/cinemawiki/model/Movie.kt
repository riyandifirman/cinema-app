package com.riyandifirman.cinemawiki.model

data class Movie(
    val id: Int,
    val poster: Int,
    val title: String,
    val years: String,
    val rating: String,
    val duration: String,
    val genre: String,
    val director: String,
    val writer: String,
    val stars: String,
    val overview: Int
)
