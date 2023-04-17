package com.example.composeclass

import com.example.composeclass.model.Recipe
val defaultRecipes = listOf(
    Recipe(
        title = "Spaghetti Bolognese",
        ingredients = listOf("spaghetti", "tomatoes", "onion", "ground beef", "garlic", "olive oil", "salt", "pepper"),
        imageResource = R.drawable.spaghetti_bolognese,
        youtubeLink = "https://www.youtube.com/watch?v=p9A3Jy9P7fA"
    ),
    Recipe(
        title = "Caesar Salad",
        ingredients = listOf("romaine lettuce", "parmesan cheese", "croutons", "lemon juice", "olive oil", "garlic", "dijon mustard", "anchovy paste"),
        imageResource = R.drawable.caesar_salad,
        youtubeLink = "https://www.youtube.com/watch?v=KVKHlYpO-qM"
    ),
    Recipe(
        title = "Chocolate Chip Cookies",
        ingredients = listOf("flour", "butter", "sugar", "brown sugar", "eggs", "vanilla extract", "baking soda", "salt", "chocolate chips"),
        imageResource = R.drawable.chocolate_chip_cookies,
        youtubeLink = "https://www.youtube.com/watch?v=1KjBfR9vJ_k"
    ),



    Recipe("Pizza", listOf("cheese","flour","Pizaa Dough"),R.drawable.pizza,"https://www.youtube.com/watch?v=p9A3Jy9P7fA"),
    Recipe("Rice", listOf("basmati rice","water","salt"),R.drawable.rice, "https://www.youtube.com/watch?v=p9A3Jy9P7fA"),
    Recipe("Curry Rice", listOf("basmati rice","water","salt","beef","curry"),R.drawable.beef,"https://www.youtube.com/watch?v=p9A3Jy9P7fA"),
    Recipe("Cake", listOf("flour","eggs","Caramel"),R.drawable.recipe,"https://www.youtube.com/watch?v=p9A3Jy9P7fA")
)
