package com.example.composeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.Row
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import com.example.composeapp.ui.AppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            RecipeCard(defaultRecipes[0])
        }

    }

}

@Composable
@Preview
fun Greeting() {
//    Column {
//        Row {
//            Text(text = "Hello world!", style = TextStyle(color = Color.Red))
//            Text(text = "Hello blaaaa!", style = TextStyle(color = Color.Red))
//            Text(text = "Hello blaaaa!", style = TextStyle(color = Color.Red))
//        }
//
//        Row {
//            Text(text = "Hello world!", style = TextStyle(color = Color.Red))
//            Text(text = "Hello blaaaa!", style = TextStyle(color = Color.Red))
//            Text(text = "Hello blaaaa!", style = TextStyle(color = Color.Red))
//        }
//
//        Row {
//            Text(text = "Hello world!", style = TextStyle(color = Color.Red))
//            Text(text = "Hello blaaaa!", style = TextStyle(color = Color.Red))
//            Text(text = "Hello blaaaa!", style = TextStyle(color = Color.Red))
//        }
//    }
}



//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    AppTheme {
//        Greeting("Android")
//    }
//}