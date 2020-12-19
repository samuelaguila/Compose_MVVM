package com.saam.composemvvmapp.presentation.ui.recipe_list

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.saam.composemvvmapp.repository.RecipeRepository
import javax.inject.Named

class RecipeListViewModel
@ViewModelInject
constructor(
    private val recipeRepository: RecipeRepository,
    @Named("auth_token") private val token: String
): ViewModel() {
}