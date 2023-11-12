package com.example.zetpackcompose5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zetpackcompose5.ui.theme.Zetpackcompose5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Zetpackcompose5Theme {
                // A surface container using the 'background' color from the theme
                Surface(

                ) {

                }
            }
        }
    }
}

fun Card(modifier: Modifier, shape: RoundedCornerShape, elevation: Dp, content: ColumnScope.() -> Unit) {

}

@Composable
fun Imagecard()

{
    val isFavorite by rememberSaveable{
        mutableStateOf(false)
    }

    Card(
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .padding(16.dp),
        shape = RoundedCornerShape(8.dp) ,
        elevation = 5.dp
    ){

        Box(
            modifier = Modifier.height(200.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.poster),
                contentDescription = "poster",
                contentScale = ContentScale.Crop,

            )
          Box(
              modifier = Modifier.fillMaxSize(),
              contentAlignment = Alignment.TopEnd,
          ) {
              IconButton(onClick = {
                    isFavorite= !isFavorite
              }) {
                  Icon(imageVector = if(isFavorite) Icons.Default.Favorite else Icons.Default FavoriteBorder,
                        contentDescription = "favorite" ,
                        tint = Color.White,
                        )
              }

          }
        }
    }
}
