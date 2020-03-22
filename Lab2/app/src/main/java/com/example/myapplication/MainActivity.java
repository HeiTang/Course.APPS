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
        button_sub = (Button)findViewById(R.id.button3);
        button_mul = (Button)findViewById(R.id.button4);
        button_div = (Button)findViewById(R.id.button5);
    }

    private void initData() {
    }

    private void setListeners() {
        button.setOnTouchListener(new bmiclicklistener());
//        button_add.setOnTouchListener(new bmiclicklistener());
//        button_add.setOnTouchListener(new addclick());
//        button_sub.setOnTouchListener(subclick);
//        button_mul.setOnTouchListener(mulclick);
//        button_div.setOnTouchListener(divclick);
    }

    private final class bmiclicklistener implements View.OnTouchListener{
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            Button cat = (Button)v;
            if(cat == button){
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main2Activity.class);

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
                intent.putExtras(bundle);
                startActivity(intent);
            }
//            if(cat == button_add){
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this, Main2Activity.class);
//
//                EditText numText1 = (EditText)findViewById(R.id.editText5);
//                EditText numText2 = (EditText)findViewById(R.id.editText4);
//
//                double num1 = Double.parseDouble(numText1.getText().toString());
//                double num2 = Double.parseDouble(numText2.getText().toString());
//                double SUM = num1 + num2;
//
//                Bundle bundle = new Bundle();
//                bundle.putString("SUMText", String.valueOf(SUM));
//                intent.putExtras(bundle);
//                startActivity(intent);
//            }
            return false;
        }
    }

//    private final class addclick implements View.OnTouchListener{
//        @Override
//        public boolean onTouch(View v, MotionEvent event) {
//            Button cat = (Button)v;
//            if(cat == button){
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this, Main2Activity.class);
//
//                EditText numText1 = (EditText)findViewById(R.id.editText5);
//                EditText numText2 = (EditText)findViewById(R.id.editText4);
//
//                double num1 = Double.parseDouble(numText1.getText().toString());
//                double num2 = Double.parseDouble(numText2.getText().toString());
//                double SUM = num1 + num2;
//
//                Bundle bundle = new Bundle();
//                bundle.putString("SUMText", String.valueOf(SUM));
//                intent.putExtras(bundle);
//                startActivity(intent);
//            }
//            return false;
//        }
//    }

//    private View.OnClickListener addclick = new View.OnClickListener(){
//        public void onClick(View v){

//
//            TextView SUMshow = (TextView)findViewById(R.id.textView5);
//            String show = String.valueOf(SUM);
//            SUMshow.setText("= " + show);
//        }
//    };
//
//    private View.OnClickListener subclick = new View.OnClickListener(){
//        public void onClick(View v){
//            EditText numText1 = (EditText)findViewById(R.id.editText5);
//            EditText numText2 = (EditText)findViewById(R.id.editText4);
//
//            double num1 = Double.parseDouble(numText1.getText().toString());
//            double num2 = Double.parseDouble(numText2.getText().toString());
//            double SUM = num1 - num2;
//
//            TextView SUMshow = (TextView)findViewById(R.id.textView5);
//            String show = String.valueOf(SUM);
//            SUMshow.setText("= " + show);
//        }
//    };
//
//    private View.OnClickListener mulclick = new View.OnClickListener(){
//        public void onClick(View v){
//            EditText numText1 = (EditText)findViewById(R.id.editText5);
//            EditText numText2 = (EditText)findViewById(R.id.editText4);
//
//            double num1 = Double.parseDouble(numText1.getText().toString());
//            double num2 = Double.parseDouble(numText2.getText().toString());
//            double SUM = num1 * num2;
//
//            TextView SUMshow = (TextView)findViewById(R.id.textView5);
//            String show = String.valueOf(SUM);
//            SUMshow.setText("= " + show);
//        }
//    };
//
//    private View.OnClickListener divclick = new View.OnClickListener(){
//        public void onClick(View v){
//            EditText numText1 = (EditText)findViewById(R.id.editText5);
//            EditText numText2 = (EditText)findViewById(R.id.editText4);
//
//            double num1 = Double.parseDouble(numText1.getText().toString());
//            double num2 = Double.parseDouble(numText2.getText().toString());
//            double SUM = num1 / num2;
//
//            TextView SUMshow = (TextView)findViewById(R.id.textView5);
//            String show = String.valueOf(SUM);
//            SUMshow.setText("= " + show);
//        }
//    };
}
