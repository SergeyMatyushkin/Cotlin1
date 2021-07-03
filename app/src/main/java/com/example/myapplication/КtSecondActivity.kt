package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {
    private var secondButton: Button? = null
    private var stringEditText: EditText? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        stringEditText = findViewById(R.id.string_edit_text)
        secondButton = findViewById(R.id.button)
        secondButton.setOnClickListener(View.OnClickListener { showAlertDialog(stringEditText.getText().toString(), null) })
    }

    private fun showAlertDialog(message: String?, title: String?) {
        val builder = AlertDialog.Builder(this@SecondActivity)
                .setPositiveButton("Ok") { dialog, i -> Toast.makeText(this@SecondActivity, "Оле, Оле, Оле", Toast.LENGTH_SHORT).show() }
        if (message != null) {
            builder.setMessage(message)
        }
        if (title != null) {
            builder.setTitle(title)
        }
        builder.show()
    }
}