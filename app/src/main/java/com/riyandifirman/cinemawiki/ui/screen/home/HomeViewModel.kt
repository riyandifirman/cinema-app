package com.riyandifirman.cinemawiki.ui.screen.home

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import com.riyandifirman.cinemawiki.R
import com.riyandifirman.cinemawiki.model.Movie

class HomeViewModel : ViewModel() {
    private val _listMovie = mutableStateListOf<Movie>()

    val listMovie: SnapshotStateList<Movie> = _listMovie

    init {
        _listMovie.addAll(getDummyListMovie())
    }

    private fun getDummyListMovie(): List<Movie> {
        return listOf(
            Movie(1, R.drawable.movie_1, "The Fast and the Furious: Tokyo Drift", "2006", "6.0", "1h 44m", "Action, Crime, Thriller", "Justin Lim", "Chris Morgan", "Lucas Black, Sung Kang, Bow Wow", R.string.overview_movie1),
            Movie(2, R.drawable.movie_2, "Titanic", "1997", "7.9", "3h 15m", "Drama, Romance", "James Cameron", "James Cameron", "Leonardo DiCaprio, Kate Winslet, Billy Zane", R.string.overview_movie2),
            Movie(3, R.drawable.movie_3, "Dunkirk", "2017", "7.8", "1h 47m", "Action, Drama, History", "Christopher Nolan", "Christopher Nolan", "Fionn Whitehead, Tom Glynn-Carney, Jack Lowden", R.string.overview_movie3),
            Movie(4, R.drawable.movie_4, "Ada Apa Dengan Cinta 2", "2016", "7.3", "2h 4m", "Drama, Romance", "Riri Riza", "Mira Lesmana", "Dian Sastrowardoyo, Nicholas Saputra, Titi Kamal", R.string.overview_movie4),
            Movie(5, R.drawable.movie_5, "Dilan 1990", "2018", "7.2", "1h 50m", "Drama, Romance", "Fajar Bustomi, Pidi Baiq", "Pidi Baiq", "Iqbaal Ramadhan, Vanesha Prescilla, Ira Wibowo", R.string.overview_movie5),
            Movie(6, R.drawable.movie_6, "Dua Garis Biru", "2019", "7.8", "1h 53m", "Drama", "Gina S. Noer", "Gina S. Noer", "Angga Yunanda, Adhisty Zara, Cut Mini", R.string.overview_movie6),
            Movie(7, R.drawable.movie_7, "The Raid : Redemption", "2011", "7.6", "1h 41m", "Action, Crime, Thriller", "Gareth Evans", "Gareth Evans", "Iko Uwais, Ananda George, Ray Sahetapy", R.string.overview_movie7),
            Movie(8, R.drawable.movie_8, "Mr. Bean Holiday", "2007", "6.4", "1h 30m", "Comedy, Family", "Steve Bendelack", "Simon McBurney", "Rowan Atkinson, Emma de Caunes, Willem Dafoe", R.string.overview_movie8),
            Movie(10, R.drawable.movie_9, "John Wick", "2014", "7.4", "1h 41m", "Action, Crime, Thriller", "Chad Stahelski", "Derek Kolstad", "Keanu Reeves, Michael Nyqvist, Alfie Allen", R.string.overview_movie9),
            Movie(11, R.drawable.movie_10, "3 Idiots", "2009", "8.4", "2h 51m", "Comedy, Drama", "Rajkumar Hirani", "Rajkumar Hirani", "Aamir Khan, Madhavan, Mona Singh", R.string.overview_movie10),
            Movie(12, R.drawable.movie_11, "Cek Toko Sebelah", "2016", "8.0", "1h 44m", "Comedy, Drama", "Ernest Prakasa", "Ernest Prakasa", "Ernest Prakasa, Dion Wiyoko, Adinia Wirasti", R.string.overview_movie11),
            Movie(13, R.drawable.movie_12, "Searching", "2018", "7.6", "1h 42m", "Drama, Mystery, Thriller", "Aneesh Chaganty", "Aneesh Chaganty", "John Cho, Debra Messing, Joseph Lee", R.string.overview_movie12),
            Movie(13, R.drawable.movie_13, "Interstellar", "2014", "8.6", "2h 49m", "Adventure, Drama, Sci-Fi", "Christopher Nolan", "Jonathan Nolan, Christopher Nolan", "Matthew McConaughey, Anne Hathaway, Jessica Chastain", R.string.overview_movie13),
            Movie(14, R.drawable.movie_14, "The Shawshank Redemption", "1994", "8.7", "2h 22m", "Drama", "Frank Darabont", "Stephen King", "Tim Robbins, Morgan Freeman, Bob Gunton", R.string.overview_movie14),
            Movie(15, R.drawable.movie_15, "The Godfather", "1972", "9.2", "2h 58m", "Crime, Drama", "Francis Ford Coppola", "Mario Puzo", "Marlon Brando, Al Pacino, James Caan", R.string.overview_movie15),
        )
    }
}