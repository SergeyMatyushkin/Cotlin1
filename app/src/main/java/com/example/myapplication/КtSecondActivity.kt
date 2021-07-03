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

        val title: String? = null

        secondButton.setOnClickListener {
            showAlertDialog(stringEditText.text.toString(), title ?: "")
        }
    }

    private fun showAlertDialog(message: String?, title: String?): Boolean {
        AlertDialog.Builder(this).apply {
            setPositiveButton("Ok") { _, _ ->
                Toast.makeText(this@KotlinActivity, "Оле, Оле, Оле", Toast.LENGTH_SHORT).show()
            }
            message?.let {
                setMessage(message)
            }

                setTitle(title)
                show()
        }



        return true
    }
}