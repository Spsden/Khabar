package com.example.khabar.repository

import com.example.khabar.datamodels.ApiKey
import com.example.khabar.datamodels.IpDetailsModel
import com.example.khabar.datamodels.News
import com.example.khabar.datamodels.NewsCategory
import com.example.khabar.network.NewsApiInterface
import javax.inject.Inject
interface NewsRepo {
    suspend fun getIpInfo(): IpDetailsModel
    suspend fun getTopHeadlines(countryCode: String, category: String): News
    suspend fun getNews(query: String): News
    suspend fun getNewsCategories(): List<NewsCategory>
}

class NewsRepoImpl @Inject constructor(
   private val remote:Remote
):NewsRepo  {
    override suspend fun getIpInfo(): IpDetailsModel {
       return remote.getIpInfo()
    }

    override suspend fun getTopHeadlines(countryCode: String, category: String): News {
        return remote.getTopHeadlines(countryCode,category)
    }

    override suspend fun getNews(query: String): News {
       return  remote.getNews(query)
    }

    override suspend fun getNewsCategories(): List<NewsCategory> {
        return listOf(
            NewsCategory(displayName = "Business", category = "business"),
            NewsCategory(displayName = "Entertainment", category = "entertainment"),
            NewsCategory(displayName = "General", category = "general"),
            NewsCategory(displayName = "Health", category = "health"),
            NewsCategory(displayName = "Science", category = "science"),
            NewsCategory(displayName = "Sports", category = "sports"),
            NewsCategory(displayName = "Technology", category = "technology"),
        )
    }

}




//class RepoImpl @Inject constructor(private val remoteDS: RemoteDS) : Repo {
//    override suspend fun getIpInfo(): IpInfoResponse {
//        return remoteDS.getIpInfo()
//    }
//
//    override suspend fun getTopHeadlines(countryCode: String, category: String): NewsResponse {
//        return remoteDS.getTopHeadlines(countryCode, category)
//    }
//
//    override suspend fun getNews(query: String): NewsResponse {
//        return remoteDS.getNews(query)
//    }
//
//    override suspend fun getNewsCategories(): List<NewsCategory> {
//        return listOf(
//            NewsCategory(displayName = "Business", category = "business"),
//            NewsCategory(displayName = "Entertainment", category = "entertainment"),
//            NewsCategory(displayName = "General", category = "general"),
//            NewsCategory(displayName = "Health", category = "health"),
//            NewsCategory(displayName = "Science", category = "science"),
//            NewsCategory(displayName = "Sports", category = "sports"),
//            NewsCategory(displayName = "Technology", category = "technology"),
//        )
//    }
//}

