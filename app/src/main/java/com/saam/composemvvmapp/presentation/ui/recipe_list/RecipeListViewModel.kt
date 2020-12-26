package com.saam.composemvvmapp.presentation.ui.recipe_list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saam.composemvvmapp.domain.model.Recipe
import com.saam.composemvvmapp.repository.RecipeRepository
import kotlinx.coroutines.launch
import javax.inject.Named

class RecipeListViewModel
@ViewModelInject
constructor(
    private val recipeRepository: RecipeRepository,
    @Named("auth_token") private val token: String
): ViewModel() {

    val recipes: MutableState<List<Recipe>> = mutableStateOf(ArrayList())

    init {
        newSearch()
    }

    fun newSearch(){
        viewModelScope.launch {
            val result= recipeRepository.search(
                token= token,
                page= 1,
                query = "chicken"
            )
            recipes.value= result
        }
    }
}