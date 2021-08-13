package com.bliss.csc.mentomentee0813;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv,warning;
    TextView textResult;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");
        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        warning = (Button) findViewById(R.id.warning);
        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 =edit1.getText().toString();
                num2 =edit2.getText().toString();
                result = Integer.parseInt(num1)+Integer.parseInt(num2);
                textResult.setText("계산 결과 : "+result.toString()); // int to string
                return false;
            }
        });

        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 =edit1.getText().toString();
                num2 =edit2.getText().toString();
                result = Integer.parseInt(num1)-Integer.parseInt(num2);
                textResult.setText("계산 결과 : "+result.toString()); // int to string
                return false;
            }
        });

        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 =edit1.getText().toString();
                num2 =edit2.getText().toString();
                result = Integer.parseInt(num1)*Integer.parseInt(num2);
                textResult.setText("계산 결과 : "+result.toString()); // int to string
                return false;
            }
        });
        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 =edit1.getText().toString();
                num2 =edit2.getText().toString();
                result = Integer.parseInt(num1)/Integer.parseInt(num2);
                textResult.setText("계산 결과 : "+result.toString()); // int to string
                return false;
            }
        });

        warning.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Toast.makeText(getApplicationContext(),"멘토멘티",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}