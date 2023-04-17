
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeclass.defaultRecipes
import com.example.composeclass.model.Recipe

@Composable
fun RecipeDetails(recipeTitle: String?) {
    val recipe = defaultRecipes.find { it.title == recipeTitle }
    recipe?.let {
        Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            val image = painterResource(id = recipe.imageResource)
            androidx.compose.foundation.Image(
                painter = image,
                contentDescription = "Recipe Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(240.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                recipe.title,
                modifier = Modifier.padding(top = 16.dp),
                style = MaterialTheme.typography.h4
            )

            Text(
                "Ingredients:",
                modifier = Modifier.padding(top = 16.dp),
                style = MaterialTheme.typography.h6
            )
            for (ingredient in recipe.ingredients) {
                Text(". $ingredient", modifier = Modifier.padding(top = 8.dp))
            }
        }
    } ?: run {
        Text("Recipe not found!")
    }
}
