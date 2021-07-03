package com.example.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class JavaActivity extends AppCompatActivity {
    private Button secondButton;
    private EditText stringEditText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        stringEditText = findViewById(R.id.string_edit_text);

        secondButton = findViewById(R.id.button);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog(stringEditText.getText().toString(), null);


            }
        });
        NoteEntity note = new NoteEntity("", "", "", 01);
    }

    private void showAlertDialog(String message, String title) {
        AlertDialog.Builder builder = new AlertDialog.Builder(JavaActivity.this)
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        Toast.makeText(JavaActivity.this, "Оле, Оле, Оле", Toast.LENGTH_SHORT).show();
                    }
                });
        if (message != null) {
            builder.setMessage(message);
        }
        if (title != null) {
            builder.setTitle(title);
        }

        builder.show();
    }
}
