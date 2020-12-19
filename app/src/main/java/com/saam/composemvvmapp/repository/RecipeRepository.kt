package com.saam.composemvvmapp.repository

import com.saam.composemvvmapp.domain.model.Recipe


interface RecipeRepository {

    suspend fun search(token: String, page: Int, query: String): List<Recipe>

    suspend fun get(token: String, id: Int): Recipe

}















