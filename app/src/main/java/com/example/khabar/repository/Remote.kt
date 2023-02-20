package com.example.khabar.repository

import com.example.khabar.datamodels.ApiKey
import com.example.khabar.datamodels.IpDetailsModel
import com.example.khabar.datamodels.News
import com.example.khabar.network.NewsApiInterface
import javax.inject.Inject

interface Remote {
    suspend fun getIpInfo(): IpDetailsModel
    suspend fun getTopHeadlines(countryCode: String, category: String): News
    suspend fun getNews(query: String): News
}


class RemoteImplementation @Inject constructor(
    private val apiKey: ApiKey, private val api: NewsApiInterface
) : Remote {
    override suspend fun getIpInfo(): IpDetailsModel {
        val url = "http://ip-api.com/json"
        return api.getIpDetails(url)
    }

    override suspend fun getTopHeadlines(countryCode: String, category: String): News {
        return api.getTopHeadlines(apiKey.key, countryCode, category)
    }

    override suspend fun getNews(query: String): News {
        return api.getEverything(apiKey.key, query)
    }
}