package com.saam.composemvvmapp.network.model

import com.saam.composemvvmapp.domain.model.Recipe
import com.saam.composemvvmapp.util.DomainMapper

class RecipeDtoMapper: DomainMapper<RecipeDto, Recipe> {

    override fun mapFromModelToEntity(recipe: Recipe): RecipeDto {
        return RecipeDto(
            pk = recipe.id,
            title = recipe.title,
            publisher = recipe.publisher,
            featuredImage = recipe.featuredImage,
            rating = recipe.rating,
            sourceUrl = recipe.sourceUrl,
            description = recipe.description,
            cookingInstructions = recipe.cookingInstructions,
            ingredients = recipe.ingredients,
            dateAdded = recipe.dateAdded,
            dateUpdated = recipe.dateUpdated
        )
    }

    override fun mapFromEntityToModel(entity: RecipeDto): Recipe {
        return Recipe (
            id = entity.pk,
            title = entity.title,
            featuredImage = entity.featuredImage,
            rating = entity.rating,
            publisher = entity.publisher,
            sourceUrl = entity.sourceUrl,
            description = entity.description,
            cookingInstructions = entity.cookingInstructions,
            ingredients = entity.ingredients,
            dateAdded = entity.dateAdded,
            dateUpdated = entity.dateUpdated
        )
    }

    fun mapFromEntityList(entity: List<RecipeDto>): List<Recipe>{
        return entity.map {
            mapFromEntityToModel(it)
        }
    }

    fun mapFromModelList(model: List<Recipe>): List<RecipeDto>{
        return model.map{
            mapFromModelToEntity(it)
        }
    }


}