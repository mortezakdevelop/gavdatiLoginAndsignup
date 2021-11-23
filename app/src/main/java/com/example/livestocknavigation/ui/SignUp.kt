package com.example.livestocknavigation.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun signUpUi(){

    var inputNumber by remember {
        mutableStateOf("")
    }

    var fullName by remember{
        mutableStateOf("")
    }
    var password by remember{
        mutableStateOf("")
    }

    Scaffold(modifier = Modifier.fillMaxSize(),

        ) {


        Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Spacer(modifier = Modifier.fillMaxHeight(0.10f))
            OutlinedTextField(value = fullName, onValueChange = {
                fullName = it

            },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 5.dp)
                    .background(Color.White)
            )
            OutlinedTextField(value = password, onValueChange = {
                password = it

            },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 5.dp)
                    .background(Color.White)
            )
            OutlinedTextField(value = password, onValueChange = {
                password = it

            },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.fillMaxHeight(0.20f))

            Button(modifier = Modifier.fillMaxWidth(0.3f),shape = RoundedCornerShape(10.dp),onClick = {

            },
            ) {
                Text(text = "ادامه")
            }
        }
    }
}
