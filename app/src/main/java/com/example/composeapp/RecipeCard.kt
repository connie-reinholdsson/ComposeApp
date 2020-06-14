package com.example.composeapp

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp

@Composable
fun RecipeCard(recipe: Recipe) {
    Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp) {
        Column {
            val image = imageResource(id = recipe.imageResource)
            Column {
                Image(asset = image)
            }

            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = recipe.title, style = TextStyle(fontSize = 24.sp))

                for (ingredient in recipe.ingredients) {
                    Text(text = "• $ingredient")
                }
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
