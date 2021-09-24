package com.example.cinema.framework.repository

import com.example.cinema.framework.datas.Film
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TmdbAPI {
    @GET("movie/{category}")
    fun getMovies(
        @Path("category") category: String,
        @Query("api_key") apiKey: String,
        @Query("language") language: String,
        @Query("page") page: Int
    ): Call<MoviesResponse>

    @GET("movie/{latest}")
    fun getMovies(
        @Query("api_key") apiKey: String,
        @Query("language") language: String,
    ): Call<Film>
}