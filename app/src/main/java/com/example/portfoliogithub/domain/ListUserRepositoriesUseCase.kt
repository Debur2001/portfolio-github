package com.example.portfoliogithub.domain

import com.example.portfoliogithub.core.UseCase
import com.example.portfoliogithub.data.model.Repo
import com.example.portfoliogithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}