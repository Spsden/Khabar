package com.example.khabar.di

import com.example.khabar.repository.NewsRepo
import com.example.khabar.repository.NewsRepoImpl
import com.example.khabar.repository.Remote
import com.example.khabar.repository.RemoteImplementation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepoModule {
    @Binds
    abstract fun bindRemoteDS(remoteDsImpl: RemoteImplementation): Remote

    @Binds
    abstract fun bindRepo(repoImpl: NewsRepoImpl): NewsRepo
}