package com.example.composeapp

import androidx.compose.Composable
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.Column
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

@Composable
fun RecipeCard(recipe: Recipe) {
    Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp) {
        val image = imageResource(id = recipe.imageResource)
        Column {
            Image(asset = image)
            Text(text = recipe.title)

            for (ingredient in recipe.ingredients) {
                Text(text = "• $ingredient")
            }
        }
    }
}

@Composable
@Preview
fun DefaultRecipeCard() {
    MaterialTheme {
        RecipeCard(defaultRecipes[0])
    }
}
