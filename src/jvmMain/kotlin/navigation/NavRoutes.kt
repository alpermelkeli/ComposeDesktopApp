package navigation

sealed class NavRoutes(val route:String) {
    object Home : NavRoutes("home")
    object SecondScreen : NavRoutes("second")
    object ThirdScreen : NavRoutes("third")
}