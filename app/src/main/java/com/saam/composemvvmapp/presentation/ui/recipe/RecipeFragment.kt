package com.saam.composemvvmapp.presentation.ui.recipe

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.AmbientContext
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.ui.tooling.preview.Preview
import com.saam.composemvvmapp.R.*
import com.saam.composemvvmapp.network.RecipeService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class RecipeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Column (
                    modifier= Modifier
                        .border(BorderStroke(2.dp, Color.Black))
                        .background(color = Color(0xFFF2F2F2))

                ) {
                    Image(
                        bitmap = imageFromResource(
                            res = context.resources,
                            resId = drawable.empty_plate
                        ),
                        modifier = Modifier.height(300.dp),
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                            .border(BorderStroke(2.dp, Color.Black)),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Row(
                            modifier = Modifier
                                .border(BorderStroke(2.dp, Color.Black))
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(
                                text = "Happy Meal",
                                style = TextStyle(
                                    color = Color.Red,
                                    fontSize = TextUnit.Companion.Sp(30)
                                )
                            )
                            Text(
                                text = "2.75$",
                                style = TextStyle(
                                    color = Color.Blue,
                                    fontSize = TextUnit.Companion.Sp(30)
                                )
                            )
                        }
                        Spacer(modifier = Modifier.padding(top = 16.dp))
                        Text(
                            text = "800 Calories",
                            style = TextStyle(
                                color = Color.Red,
                                fontSize = TextUnit.Companion.Sp(30)
                            )
                        )
                        Spacer(modifier = Modifier.padding(top = 50.dp))
                        Button(
                            onClick = { },
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(15.dp)
                        ) {
                            Text(text = "Order Now")
                        }
                    }
                }
            }
        }
    }
}






    
