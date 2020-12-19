package com.saam.composemvvmapp.network.response

import com.google.gson.annotations.SerializedName
import com.saam.composemvvmapp.network.model.RecipeDto

class RecipeSearchResponse(

    @SerializedName("count")
    var count: Int,

    @SerializedName("results")
    var recipes: List<RecipeDto>,
)



