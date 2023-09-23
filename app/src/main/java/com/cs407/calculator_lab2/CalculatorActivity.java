package com.cs407.calculator_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);

        TextView resultTextView = findViewById(R.id.resultTextView);

        Intent intent = getIntent();
        String num1 = intent.getStringExtra("num1");
        String num2 = intent.getStringExtra("num2");
        String operation = intent.getStringExtra("operation");

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int result = 0;

        switch (operation) {
            case "addition":
                result = n1 + n2;
                break;
            case "subtraction":
                result = n1 - n2;
                break;
            case "multiplication":
                result = n1 * n2;
                break;
            case "division":
                if (n2 == 0) {
                    Toast.makeText(this, "Error! Cannot divide by zero", Toast.LENGTH_LONG).show();
                    return;
                }
                result = n1 / n2;
                break;
        }

        resultTextView.setText("Result: " + result);
    }
}
