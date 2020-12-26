package com.saam.composemvvmapp.presentation.ui.recipe_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.saam.composemvvmapp.R
import com.saam.composemvvmapp.presentation.components.RecipeCard
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RecipeListFragment : Fragment() {

    private val viewModel: RecipeListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {

                val items= viewModel.recipes.value

                LazyColumn {
                    itemsIndexed(
                        items = items
                    ){ index, item ->
                        RecipeCard(
                            recipe = item,
                            onClick = {})
                    }
                }
            }
        }
    }
}