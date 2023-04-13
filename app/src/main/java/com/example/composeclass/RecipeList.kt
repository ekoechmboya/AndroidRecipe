package com.example.composeclass

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composeclass.model.Recipe

@Composable
fun RecipeList(recipes: List<Recipe>) {
    //composable's representation of a recyclerview
    LazyColumn{
        items(recipes) {item ->
            RecipeCard(recipe = item, Modifier.padding(12.dp))
        }
    }
}