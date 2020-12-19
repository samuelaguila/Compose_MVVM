package com.saam.composemvvmapp.repository

import com.saam.composemvvmapp.domain.model.Recipe
import com.saam.composemvvmapp.network.RecipeService
import com.saam.composemvvmapp.network.model.RecipeDtoMapper
import com.saam.composemvvmapp.repository.RecipeRepository
import javax.inject.Inject
import javax.inject.Named

class RecipeRepositoryImpl
constructor(
    private val recipeService: RecipeService,
    private val mapper: RecipeDtoMapper,
): RecipeRepository {

    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        return mapper.mapFromEntityList(recipeService.search(token = token, page = page, query = query).recipes)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapFromEntityToModel(recipeService.get(token = token, id))
    }

}