package screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.dp

@Composable
fun Home(onSecondClicked:()->Unit){
    Scaffold(modifier = Modifier.fillMaxSize(), topBar = { Text("HomeScreen")
        Button(onClick = {onSecondClicked()}
        ){
            Text("To Second")
        }},
        bottomBar = {BottomNavigation(modifier = Modifier.fillMaxWidth().height(20.dp), backgroundColor = Color.Black, contentColor = White){} }
    ){

    }

}