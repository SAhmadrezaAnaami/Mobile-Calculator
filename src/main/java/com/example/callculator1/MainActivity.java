package com.example.callculator1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btn1 , btn2 , btn3 , btn4 , btn5 , btn6 , btn7 , btn8 , btn9 , btn0;
    private Button btnPlus , btnMinus , btnMulty , btnDivide , btnEqual , btnC;


    private EditText MainEditText , seconderyEditText;
    private String text , FirstNum , operator;

    private Double equal ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setObjects();


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTextToMainEditText("0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTextToMainEditText("1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTextToMainEditText("2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTextToMainEditText("3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTextToMainEditText("4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTextToMainEditText("5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTextToMainEditText("6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTextToMainEditText("7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTextToMainEditText("8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTextToMainEditText("9");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!MainEditText.getText().toString().equals("0")){

                    FirstNum = MainEditText.getText().toString();
                    operator = "+";

                    text = MainEditText.getText().toString() + "+";
                    seconderyEditText.setText(text);
                    MainEditText.setText("0");
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!MainEditText.getText().toString().equals("0")){

                    FirstNum = MainEditText.getText().toString();
                    operator = "-";

                    text = MainEditText.getText().toString() + "-";
                    seconderyEditText.setText(text);
                    MainEditText.setText("0");
                }
            }
        });
        btnMulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!MainEditText.getText().toString().equals("0")){

                    FirstNum = MainEditText.getText().toString();
                    operator = "*";

                    text = MainEditText.getText().toString() + "*";
                    seconderyEditText.setText(text);
                    MainEditText.setText("0");
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!MainEditText.getText().toString().equals("0")){


                    FirstNum = MainEditText.getText().toString();
                    operator = "/";

                    text = MainEditText.getText().toString() + "/";
                    seconderyEditText.setText(text);
                    MainEditText.setText("0");
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seconderyEditText.setText("0");
                MainEditText.setText("0");
                text = "0";
            }
        });



        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!MainEditText.getText().toString().equals("0") && !seconderyEditText.getText().toString().equals("0")){



                    switch (operator){
                        case "+":
//                            Toast.makeText(MainActivity.this, FirstNum , Toast.LENGTH_LONG).show();

                            equal = (Double.parseDouble(MainEditText.getText().toString())) + (Double.parseDouble(FirstNum));
                            seconderyEditText.setText("0");
                            MainEditText.setText(String.valueOf(equal));
                            break;
                        case "-":
                            equal = Double.parseDouble(MainEditText.getText().toString()) - Double.parseDouble(FirstNum);
                            seconderyEditText.setText("0");
                            MainEditText.setText(String.valueOf(equal));
                            break;
                        case "*":
                            equal = Double.parseDouble(MainEditText.getText().toString()) * Double.parseDouble(FirstNum);
                            seconderyEditText.setText("0");
                            MainEditText.setText(String.valueOf(equal));
                            break;
                        case "/":
                            equal = Double.parseDouble(FirstNum) / Double.parseDouble(MainEditText.getText().toString());
                            seconderyEditText.setText("0");
                            MainEditText.setText(String.valueOf(equal));
                            break;


                    }




                }
            }
        });


    }
    private void addTextToMainEditText(String Text){



        if(MainEditText.getText().toString().equals("0")){
            text = Text;
            MainEditText.setText(text);
        }
        else{
            text = MainEditText.getText().toString() + Text;
            MainEditText.setText(text);
        }




    }
    private void setObjects(){
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        MainEditText = (EditText) findViewById(R.id.EditTextMain);

        btnPlus = (Button)findViewById(R.id.btnPlus);
        btnMinus = (Button)findViewById(R.id.btnMinus);
        btnMulty = (Button)findViewById(R.id.btnMulty);
        btnDivide = (Button)findViewById(R.id.btnDevide);
        btnEqual = (Button)findViewById(R.id.btnEqual);

        seconderyEditText = (EditText) findViewById(R.id.EditTextMainTOP);

        btnC = (Button)findViewById(R.id.btnC);
    }

}






















