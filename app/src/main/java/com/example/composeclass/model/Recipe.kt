package com.example.composeclass.model

import androidx.annotation.DrawableRes

data class Recipe(
    val title: String,
    val ingredients: List<String>,
    @DrawableRes val imageResource: Int,
    val youtubeLink: String
)
