package com.example.composeapp

import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.foundation.Box
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

@Composable
fun RecipeCard(recipe: Recipe) {
    val image = imageResource(id = recipe.imageResource)
    Column {
        Image(asset = image)
        Text(text = recipe.title)

        for (ingredient in recipe.ingredients) {
            Text(text = ingredient)
        }
    }
}

@Composable
@Preview
fun DefaultRecipeCard() {
    RecipeCard(defaultRecipes[0])
}