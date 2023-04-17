package com.example.composeclass

import RecipeDetails
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.composeclass.model.Recipe
import com.example.composeclass.ui.theme.ComposeClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeClassTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "recipeList") {
                    composable("recipeList") {
                        RecipeList(navController = navController, recipes = defaultRecipes)
                    }
                    composable("details/{recipeId}") { backStackEntry ->
                        val recipeId = backStackEntry.arguments?.getString("recipeId")
                        RecipeDetails(recipeTitle = recipeId)
                    }
                }
            }
        }
    }
}



