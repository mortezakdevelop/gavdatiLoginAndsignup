package com.example.livestocknavigation

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.livestocknavigation.ui.signUpUi

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
  NavHost(navController = navHostController , startDestination = Screen.Login.route ){
      composable(
          route = Screen.Login.route
      ){
          loginUi(navController = navHostController)
      }
      composable(
          route = Screen.SignUp.route
      ){
            signUpUi()
      }

  }

}