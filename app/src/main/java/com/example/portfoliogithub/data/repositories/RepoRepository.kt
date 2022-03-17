package com.example.portfoliogithub.data.repositories

import com.example.portfoliogithub.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String) : Flow<List<Repo>>
}