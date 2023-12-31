package com.example.jetpackcomposepractice

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposepractice.ui.theme.JetPackComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
               Box(modifier = Modifier
                   .background(color = androidx.compose.ui.graphics.Color.Green)
                   .fillMaxWidth()
                   .height(200.dp),
               ){
                   Text(text = "Hello")
                   Box(
                       modifier = Modifier
                           .fillMaxSize()
                           .padding(16.dp),
                       contentAlignment = Alignment.BottomEnd,
                       ){
                       Text(text = "12345~~~!!!")
                   }
                    
                }
            }
        }
    }

@Composable
fun Greeting(name: String){
    Text(text = "Hello $name!")
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    JetPackComposePracticeTheme {
        Greeting("김민재")
    }
}


