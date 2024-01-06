package com.dave.jepacomposedemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dave.jepacomposedemo.ui.theme.JPCDemoTheme
import com.dave.jepacomposedemo.ui.theme.Purple80
import com.dave.jepacomposedemo.ui.theme.PurpleGrey80
import com.loc.composeloginscreen.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JPCDemoTheme {

                JPCDemoTheme {
                    LoginScreen()
                }
//                Row(modifier = Modifier.fillMaxWidth()){
//                    Box(modifier = Modifier.background(Color.Red).height(100.dp).weight(1f))
//                    Spacer(modifier= Modifier.width(36.dp))
//                    Box(modifier = Modifier.background(Color.Red).height(100.dp).weight(1f))
//                }



//                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart){
//                    Text("Hello", modifier = Modifier.align(Alignment.TopStart))
//                   Text("welcome", modifier = Modifier.align(Alignment.TopCenter))
//                    Text("welcome", modifier = Modifier.align(Alignment.TopEnd))
//                    Text("welcome", modifier = Modifier.align(Alignment.CenterStart))
//                    Text("welcome", modifier = Modifier.align(Alignment.Center))
//                    Text("welcome", modifier = Modifier.align(Alignment.CenterEnd))
//                    Text("welcome", modifier = Modifier.align(Alignment.BottomStart))
//                    Text("welcome", modifier = Modifier.align(Alignment.BottomCenter))
//                    Text("welcome", modifier = Modifier.align(Alignment.BottomEnd))

//                Column(modifier = Modifier.fillMaxSize(),
//                    verticalArrangement = Arrangement.SpaceEvenly,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                    Text(text = "Hello")
//                    Text(text = "Hi")
//                    Text(text = "Hi")
//                    Text(text = "Welcome")
//
//                }

//                Row(modifier = Modifier.fillMaxSize(),
//                    horizontalArrangement= Arrangement.SpaceEvenly,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Text(text = "Hello")
//                    Text(text = "Hi")
//                    Text(text = "Hi")
//                    Text(text = "Welcome")
//
//                }

//                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
//                    Box(
//                        modifier = Modifier
//                        //.size(100.dp)
//                        .width(150.dp)
//                        .height(100.dp)
//                        .clip(RoundedCornerShape(15.dp))
//                        .border(width = 3.dp, color=Color.Red,shape= CircleShape)
//                        .background(color = PurpleGrey80)
//                        .clickable {
//                            Log.d("test","click")
//                        },
//                        contentAlignment = Alignment.Center
//                    ){
//                        Text(text="Button", color = Color.White)
//                    }
//                }

                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JPCDemoTheme {
        Greeting("Android")
    }
}