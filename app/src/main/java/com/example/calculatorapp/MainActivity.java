package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button);
        final TextView output = findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               output.setText("1");
           }
        });
    }
}
