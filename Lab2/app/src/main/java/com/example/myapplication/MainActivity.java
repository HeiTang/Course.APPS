package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button button,button_add,button_sub,button_mul,button_div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化控制項
        initViews();
        //初始化資料
        initData();
        //設定監聽事件
        setListeners();
    }

    private void initViews() {
        button = (Button)findViewById(R.id.button);
        button_add = (Button)findViewById(R.id.button2);
        button_sub = (Button)findViewById(R.id.button3);
        button_mul = (Button)findViewById(R.id.button4);
        button_div = (Button)findViewById(R.id.button5);
    }

    private void initData() {
    }

    private void setListeners() {
        button.setOnClickListener(bmiclicklistener);
        button_add.setOnClickListener(addclicklistener);
        button_sub.setOnClickListener(subclicklistener);
        button_mul.setOnClickListener(mulclicklistener);
        button_div.setOnClickListener(divclicklistener);
    }

    private View.OnClickListener bmiclicklistener = new View.OnClickListener(){
        @Override
        public  void onClick(View v){
            Intent intent_BMI = new Intent();
            intent_BMI.setClass(MainActivity.this, Main2Activity.class);

            EditText heightText = (EditText)findViewById(R.id.editText);
            EditText weightText = (EditText)findViewById(R.id.editText2);

            //身高
            double height = Double.parseDouble(heightText.getText().toString());
            //體重
            double weight = Double.parseDouble(weightText.getText().toString());
            //bmi
            double BMI = weight/(height*height);

            Bundle bundle = new Bundle();
            bundle.putString("BMIText", String.valueOf(BMI));
            intent_BMI.putExtras(bundle);
            startActivity(intent_BMI);
        }
    };

    private View.OnClickListener addclicklistener = new View.OnClickListener(){
        @Override
        public  void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, Main2Activity.class);

            EditText numText1 = (EditText)findViewById(R.id.editText5);
            EditText numText2 = (EditText)findViewById(R.id.editText4);

            double num1 = Double.parseDouble(numText1.getText().toString());
            double num2 = Double.parseDouble(numText2.getText().toString());
            double SUM = num1 + num2;

            Bundle bundle = new Bundle();
            bundle.putString("SUMText", String.valueOf(SUM));
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };

    private View.OnClickListener subclicklistener = new View.OnClickListener(){
        @Override
        public  void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, Main2Activity.class);

            EditText numText1 = (EditText)findViewById(R.id.editText5);
            EditText numText2 = (EditText)findViewById(R.id.editText4);

            double num1 = Double.parseDouble(numText1.getText().toString());
            double num2 = Double.parseDouble(numText2.getText().toString());
            double SUM = num1 - num2;

            Bundle bundle = new Bundle();
            bundle.putString("SUMText", String.valueOf(SUM));
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };

    private View.OnClickListener mulclicklistener = new View.OnClickListener(){
        @Override
        public  void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, Main2Activity.class);

            EditText numText1 = (EditText)findViewById(R.id.editText5);
            EditText numText2 = (EditText)findViewById(R.id.editText4);

            double num1 = Double.parseDouble(numText1.getText().toString());
            double num2 = Double.parseDouble(numText2.getText().toString());
            double SUM = num1 * num2;

            Bundle bundle = new Bundle();
            bundle.putString("SUMText", String.valueOf(SUM));
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };

    private View.OnClickListener divclicklistener = new View.OnClickListener(){
        @Override
        public  void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, Main2Activity.class);

            EditText numText1 = (EditText)findViewById(R.id.editText5);
            EditText numText2 = (EditText)findViewById(R.id.editText4);

            double num1 = Double.parseDouble(numText1.getText().toString());
            double num2 = Double.parseDouble(numText2.getText().toString());
            double SUM = num1 / num2;

            Bundle bundle = new Bundle();
            bundle.putString("SUMText", String.valueOf(SUM));
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };
}

