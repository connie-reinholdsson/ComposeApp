package com.example.composeapp.ui

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.unit.dp
import com.example.composeapp.Recipe
import com.example.composeapp.RecipeCard

@Composable
fun RecipeList(recipes: List<Recipe>) {
    VerticalScroller { // Scrollable list
        Column {
            for (recipe in recipes) {
                Modifier.padding(16.dp)
                RecipeCard(recipe = recipe)
            }
        }
    }
}