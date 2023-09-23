package com.cs407.calculator_lab2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        String num1 = myTextField.getText().toString();
        String num2 = myTextField2.getText().toString();
        String operation = view.getTag().toString(); // Add a tag to each button in XML to identify the operation

        goToActivity(num1, num2, operation);
    }

    public void goToActivity(String num1, String num2, String operation) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        intent.putExtra("num1", num1);
        intent.putExtra("num2", num2);
        intent.putExtra("operation", operation);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
