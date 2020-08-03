package com.prajwal.my_first_kotlin_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val editText: EditText = findViewById(R.id.editText)

        button.setOnClickListener(View.OnClickListener
        {
            Toast.makeText(applicationContext, "Hello, " + editText.text, Toast.LENGTH_SHORT).show()
        })
    }
}