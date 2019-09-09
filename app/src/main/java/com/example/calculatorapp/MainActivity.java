package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    char operation = '+';
    double previous = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        Button btn3 = findViewById(R.id.button3);
        Button btn4 = findViewById(R.id.button4);
        Button btn5 = findViewById(R.id.button5);
        Button btn6 = findViewById(R.id.button6);
        Button btn7 = findViewById(R.id.button7);
        Button btn8 = findViewById(R.id.button8);
        Button btn9 = findViewById(R.id.button9);
        Button btn0 = findViewById(R.id.button0);
        Button btnEqual = findViewById(R.id.Equal);
        Button btnReset = findViewById(R.id.Reset);
        Button btnAdd = findViewById(R.id.Addition);
        Button btnSub = findViewById(R.id.Subtraction);
        Button btnMul = findViewById(R.id.Multiplication);
        Button btnDiv = findViewById(R.id.Division);
        Button btnDec = findViewById(R.id.Decimal);
        Button btnExp = findViewById(R.id.Exponent);
        Button btnPer = findViewById(R.id.Percent);
        Button btnSig = findViewById(R.id.sign);

        final TextView output = findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               output.setText(output.getText().toString()+"1");
           }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                output.setText(output.getText().toString()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                output.setText(output.getText().toString()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                output.setText(output.getText().toString()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                output.setText(output.getText().toString()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                output.setText(output.getText().toString()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                output.setText(output.getText().toString()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                output.setText(output.getText().toString()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                output.setText(output.getText().toString()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                output.setText(output.getText().toString()+"0");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                operation = '+';
                try {
                    previous = Double.parseDouble(output.getText().toString());
                    output.setText("");
                }
                catch(Exception e){}
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                operation = '-';
                try {
                    previous = Double.parseDouble(output.getText().toString());
                    output.setText("");
                }
                catch(Exception e){}
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                operation = '*';
                try {
                    previous = Double.parseDouble(output.getText().toString());
                    output.setText("");
                }
                catch(Exception e){}
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                operation = '/';
                try {
                    previous = Double.parseDouble(output.getText().toString());
                    output.setText("");
                }
                catch(Exception e){}
            }
        });

        btnExp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                operation ='^';
                try {
                    previous = Double.parseDouble(output.getText().toString());
                    output.setText("");
                }
                catch(Exception e){}
            }
        });

        btnPer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try {
                    double percent = Double.parseDouble(output.getText().toString())/100;
                    output.setText(""+percent);
                }
                catch(Exception e){}
            }
        });

        btnSig.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try {
                    output.setText("-"+output.getText().toString());
                }
                catch(Exception e){}
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                output.setText("");
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                output.setText(output.getText().toString()+".");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                if(operation=='+'){
                    double result = previous+Double.parseDouble(output.getText().toString());
                    output.setText(result+"");
                }
                if(operation=='-'){
                    double result = previous-Double.parseDouble(output.getText().toString());
                    output.setText(result+"");
                }
                if(operation=='*'){
                    double result = previous*Double.parseDouble(output.getText().toString());
                    output.setText(result+"");
                }
                if(operation=='/'){
                    double result = previous/Double.parseDouble(output.getText().toString());
                    output.setText(result+"");
                }
                if(operation=='^') {
                    double result = Math.pow(previous, Double.parseDouble(output.getText().toString()));
                    output.setText(result+"");
                }
            }catch(Exception e){}
            }
        });
    }
}
