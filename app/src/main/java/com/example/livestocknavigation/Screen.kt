package com.example.livestocknavigation

sealed class Screen(var route:String){
    object Login:Screen(route = "login_ui")
    object SignUp:Screen(route = "sign_up_ui")
}
