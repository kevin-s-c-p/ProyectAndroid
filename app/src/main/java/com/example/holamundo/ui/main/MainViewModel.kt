package com.example.holamundo.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    fun firstFunction():String{
        return "Hola mundo"
    }

    fun concatenateInput(concatenatedString:String):String{
        return "Que onda $concatenatedString"
    }

    fun holas(holas:String):String = "Que onda x2 $holas"
}