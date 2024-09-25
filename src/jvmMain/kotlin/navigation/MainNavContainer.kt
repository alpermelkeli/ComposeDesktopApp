package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MainNavContainer(startDestination:String){
    val navController = rememberNavController()
    AppNavHost(navController = navController, startDestination)
}