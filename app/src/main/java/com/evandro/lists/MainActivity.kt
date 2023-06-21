package com.evandro.lists

import android.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAddList = findViewById<Button>(R.id.btnAddList)
        btnAddList.setOnClickListener {
            val view = layoutInflater.inflate(R.layout.custom_dialog, null)
            val builder = AlertDialog.Builder(this)
            builder.setTitle(getString(R.string.alert_title))
            builder.setView(view)

            val editText = view.findViewById<EditText>(R.id.dialogEditText)

            builder.setPositiveButton("OK") { dialog, which ->
                val userInput = editText.text.toString()
                // Lógica a ser executada quando o botão "OK" for clicado
                // userInput contém o texto inserido pelo usuário
            }

            val alertDialog = builder.create()
            alertDialog.show()
        }
    }

}