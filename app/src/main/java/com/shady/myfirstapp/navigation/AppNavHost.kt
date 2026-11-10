package com.shady.myfirstapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.shady.myfirstapp.ui.theme.screen.about.Aboutscreen
import com.shady.myfirstapp.ui.theme.screen.dashboard.DashboardScreen
import com.shady.myfirstapp.ui.theme.screen.home.Homescreen
import com.shady.myfirstapp.ui.theme.screen.login.Loginscreen
import com.shady.myfirstapp.ui.theme.screen.profile.ProfileScreen
import com.shady.myfirstapp.ui.theme.screen.register.registerscreen
import com.shady.myfirstapp.ui.theme.screen.intent.SystemActionScreen
import com.shady.myfirstapp.ui.theme.screen.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH
) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_SPLASH) {
            SplashScreen(navController = navController)
        }
        composable(ROUTE_HOME) {
            Homescreen(navController = navController)
        }
        composable(ROUTE_LOGIN) {
            Loginscreen(navController = navController)
        }
        composable(ROUTE_REGISTER) {
            registerscreen(navController = navController)
        }
        composable(ROUTE_DASHBOARD) {
            DashboardScreen(navController = navController)
        }
        composable(ROUTE_ABOUT) {
            Aboutscreen(navController = navController)
        }
        composable(ROUTE_PROFILE) {
            ProfileScreen(navController = navController)
        }
        composable(ROUTE_INTENT) {
            SystemActionScreen(navController = navController)
        }
    }
}
