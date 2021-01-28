package com.example.holamundo.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.holamundo.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    //public

    //protected

    //private
    private lateinit var viewModel: MainViewModel
    private lateinit var textView: TextView
    private lateinit var textView2: TextView
    //private lateinit var textViewName: TextView
    private lateinit var inputEmail: EditText
    private lateinit var inputNumber: EditText
    private lateinit var inputPassword: EditText
    private lateinit var inputName: EditText
    private lateinit var sendButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.first_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.quepex)
        textView2 = view.findViewById(R.id.quepex2)
        inputName = view.findViewById(R.id.elinput)
        inputEmail = view.findViewById(R.id.email_input)
        inputNumber = view.findViewById(R.id.cellphone_input)
        inputPassword = view.findViewById(R.id.password_input)
        sendButton = view.findViewById(R.id.enviar)
        //textViewName = view.findViewById(R.id.name)
    }

    override fun onResume() {
        super.onResume()
        textView.text = viewModel.firstFunction()
        sendButton.setOnClickListener { view ->
            val button = view as Button
            //setInput(button.text.toString())
            showInformation()
        }
    }

    private fun showInformation(){
        val infoPerson = arrayListOf<EditText>(inputName,inputEmail,inputNumber,inputPassword)
        textView.text = "Aqui esta la Informacion de: ${inputName.text}"
        textView2.text = viewModel.concatenateInput(infoPerson)
    }
    /*private fun setInput(text: String) {

        val buttonTextWithInputText = "$text ${inputName.text}"
        textView2.text = viewModel.concatenateInput(buttonTextWithInputText)
    }*/
}