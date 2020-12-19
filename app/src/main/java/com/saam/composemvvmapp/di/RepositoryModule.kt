package com.saam.composemvvmapp.di

import com.saam.composemvvmapp.network.RecipeService
import com.saam.composemvvmapp.network.model.RecipeDtoMapper
import com.saam.composemvvmapp.repository.RecipeRepository
import com.saam.composemvvmapp.repository.RecipeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService: RecipeService,
        recipeMapper: RecipeDtoMapper,
    ): RecipeRepository {
        return RecipeRepositoryImpl(
            recipeService = recipeService,
            mapper = recipeMapper
        )
    }
}












