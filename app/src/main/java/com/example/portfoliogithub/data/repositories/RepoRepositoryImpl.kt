package com.example.portfoliogithub.data.repositories

import com.example.portfoliogithub.data.model.Repo
import com.example.portfoliogithub.data.services.GitHubService
import kotlinx.coroutines.flow.flow

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository{

    override suspend fun listRepositories(user: String) = flow {
        val repoList = service.listRepositories(user)
        emit(repoList)
    }
}