package com.example.holamundo.ui.main

import android.widget.EditText
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    fun firstFunction():String{
        return "Hola mundo"
    }

    fun concatenateInput(concatenatedString:ArrayList<EditText>):String{
        val informationUser = "Correo : ${concatenatedString[1].text} \n Numero: ${concatenatedString[2].text} \n Contraseña: ${concatenatedString[3].text}"

        return informationUser
    }

    fun holas(holas:String):String = "Que onda x2 $holas"
}