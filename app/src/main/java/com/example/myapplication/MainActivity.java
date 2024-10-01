package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Declare TextView as a class-level variable
    private TextView txtview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtview = findViewById(R.id.textView);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // updating textView
    public void displayMsg(View view) {
        EditText editText = findViewById(R.id.editTextTextMultiLine);
        txtview.setText(editText.getText().toString());
    }

    //To change colour of text view
    public void changeColour(View view) {
        txtview.setTextColor(getResources().getColor(android.R.color.holo_red_light));

    }

    //To change the size of text view
    public void changeSize(View view) {
        txtview.setTextSize(24);
    }
}
