package com.example.cilca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButton(View v) {
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView result = (TextView) findViewById(R.id.result);
        int x1 = Integer.parseInt(num1.getText().toString());
        int x2 = Integer.parseInt(num2.getText().toString());
        int r = x1 + x2;
        result.setText(Integer.toString(r));
    }

    public void onButton1(View v) {
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView result = (TextView) findViewById(R.id.result);
        int x1 = Integer.parseInt(num1.getText().toString());
        int x2 = Integer.parseInt(num2.getText().toString());
        int r = x1 - x2;
        result.setText(Integer.toString(r));
    }
    public void onButton2(View v) {
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView result = (TextView) findViewById(R.id.result);
        int x1 = Integer.parseInt(num1.getText().toString());
        int x2 = Integer.parseInt(num2.getText().toString());
        int r = x1 * x2;
        result.setText(Integer.toString(r));
    }

    public void onButton3(View v) {
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView result = (TextView) findViewById(R.id.result);
        int x1 = Integer.parseInt(num1.getText().toString());
        int x2 = Integer.parseInt(num2.getText().toString());
        int r = x1 / x2;
        result.setText(Integer.toString(r));
    }

}