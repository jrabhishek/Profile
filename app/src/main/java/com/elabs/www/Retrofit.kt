package com.elabs.www

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomUserApi {
    @GET("/api/?inc=name,email,cell&noinfo&nat=gb")
    fun getUsers(@Query("results") results: Int): Call<ProfileResponce>
}


private val retrofit = Retrofit.Builder().baseUrl("https://randomuser.me")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val userApi = retrofit.create(RandomUserApi::class.java)