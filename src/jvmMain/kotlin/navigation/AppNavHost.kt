package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import screen.Home
import screen.SecondScreen

@Composable
fun AppNavHost(navController: NavHostController, startDestination:String){

    NavHost(navController = navController, startDestination = startDestination){

        composable(NavRoutes.Home.route){
            Home(onSecondClicked = {navController.navigate(NavRoutes.SecondScreen.route)})
        }
        composable(NavRoutes.SecondScreen.route){
            SecondScreen(onClickedBack = {navController.popBackStack()})
        }


    }

}