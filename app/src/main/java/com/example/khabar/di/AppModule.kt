package com.example.khabar.di

import com.example.khabar.BuildConfig
import com.example.khabar.datamodels.ApiKey
import com.example.khabar.network.NewsApiInterface
import com.example.khabar.repository.*
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {



    //@Singleton
    @Provides
    fun providesApiService() =
        Retrofit.Builder().baseUrl(BuildConfig.BASE_URL).client(OkHttpClient())
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(NewsApiInterface::class.java)

   // @Singleton
    @Provides
    fun providesApiKey() = ApiKey(BuildConfig.API_KEY)


}

