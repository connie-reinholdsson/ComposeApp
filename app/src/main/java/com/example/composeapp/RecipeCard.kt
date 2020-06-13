package com.example.composeapp

import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.tooling.preview.Preview

@Composable
fun RecipeCard(recipe: Recipe) {
    Text(recipe.title)
}

@Composable
@Preview
fun DefaultRecipeCard() {
    RecipeCard(defaultRecipes[0])
}