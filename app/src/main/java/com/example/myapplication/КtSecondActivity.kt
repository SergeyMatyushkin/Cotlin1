package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {
    private lateinit var secondButton: Button
    private lateinit var stringEditText: EditText

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        stringEditText = findViewById(R.id.string_edit_text)
        secondButton = findViewById(R.id.button)
        secondButton.setOnClickListener {
            showAlertDialog(stringEditText.text.toString(), null) }
    }

    private fun showAlertDialog(message: String?, title: String?): Boolean {
        val builder = AlertDialog.Builder(this)
                .setPositiveButton("Ok") { _, _ ->
                    Toast.makeText(this, "Оле, Оле, Оле", Toast.LENGTH_SHORT).show() }


        message?.let {
            builder.setMessage(message)
        }
        if (title != null) {
            builder.setTitle(title)
        }
        builder.show()
        return true
    }
}