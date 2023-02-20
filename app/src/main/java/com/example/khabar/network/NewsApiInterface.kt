package com.example.khabar.network

import com.example.khabar.datamodels.IpDetailsModel
import retrofit2.http.Query
import retrofit2.http.Url
import  com.example.khabar.datamodels.News
import retrofit2.http.GET

interface NewsApiInterface {
    @GET
    suspend fun getIpDetails(@Url url: String): IpDetailsModel


    @GET("/v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("apiKey") apiKey: String,
        @Query("country") countryCode: String,
        @Query("category") category: String
    ): News

    @GET("/v2/everything")
    suspend fun getEverything(

        @Query("apiKey") apiKey: String, @Query("q") query: String
    ): News

}


