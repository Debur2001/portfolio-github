package com.example.portfoliogithub.data.repositories

import com.example.portfoliogithub.core.RemoteException
import com.example.portfoliogithub.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository{

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            throw RemoteException(ex.message ?: "Não foi possível fazer a busca no momento")
        }
    }
}