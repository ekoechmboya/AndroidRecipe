package com.example.composeclass

import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.material.Button
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import com.example.composeclass.model.Recipe



@Composable
fun RecipeCard(recipe: Recipe, modifier: Modifier, navController: NavController){
    Surface(shape = RoundedCornerShape(8.dp), elevation = 8.dp,
        modifier = modifier) {
        //    1
        val image = painterResource(id = recipe.imageResource)
//    layout /card to hold image and text of recipe
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { navController.navigate("details/${recipe.title}") }
        ) {
            androidx.compose.foundation.Image(painter = image,
                contentDescription = "Recipe Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(144.dp) ,
                contentScale = ContentScale.Crop
            )

                Text(recipe.title, modifier = Modifier.padding(5.dp) ,
                    style = MaterialTheme.typography.h4)
                val na = LocalUriHandler.current
                // Button jetpack compose
                Button(onClick = {
                    na.openUri(recipe.youtubeLink)
                },
                modifier= Modifier.background(Color.Red)){
                    Text("watch on youtube")
                }


            Text(text = "Ingredients....",
                modifier = Modifier.padding(5.dp)
            )
            for (ingredient in recipe.ingredients){
                Text(". $ingredient", modifier = Modifier.padding(5.dp))
            }
        }
    }
}


// dummy
