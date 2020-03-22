package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(bmiclicklistener);

        Button button_add = (Button)findViewById(R.id.button2);
        button_add.setOnClickListener(addclick);

        Button button_sub = (Button)findViewById(R.id.button3);
        button_sub.setOnClickListener(subclick);

        Button button_mul = (Button)findViewById(R.id.button4);
        button_mul.setOnClickListener(mulclick);

        Button button_div = (Button)findViewById(R.id.button5);
        button_div.setOnClickListener(divclick);
    }

    private View.OnClickListener bmiclicklistener = new View.OnClickListener(){
        public void onClick(View v){
            EditText heightText = (EditText)findViewById(R.id.editText);
            EditText weightText = (EditText)findViewById(R.id.editText2);

            //身高
            double height = Double.parseDouble(heightText.getText().toString());
            //體重
            double weight = Double.parseDouble(weightText.getText().toString());
            //bmi
            double BMI = weight/(height*height);

            TextView BMIshow = (TextView)findViewById(R.id.textView4);
            String show = String.valueOf(BMI);
            BMIshow.setText("BMI= " + show);
        }
    };

    private View.OnClickListener addclick = new View.OnClickListener(){
        public void onClick(View v){
            EditText numText1 = (EditText)findViewById(R.id.editText5);
            EditText numText2 = (EditText)findViewById(R.id.editText4);

            double num1 = Double.parseDouble(numText1.getText().toString());
            double num2 = Double.parseDouble(numText2.getText().toString());
            double SUM = num1 + num2;

            TextView SUMshow = (TextView)findViewById(R.id.textView5);
            String show = String.valueOf(SUM);
            SUMshow.setText("= " + show);
        }
    };

    private View.OnClickListener subclick = new View.OnClickListener(){
        public void onClick(View v){
            EditText numText1 = (EditText)findViewById(R.id.editText5);
            EditText numText2 = (EditText)findViewById(R.id.editText4);

            double num1 = Double.parseDouble(numText1.getText().toString());
            double num2 = Double.parseDouble(numText2.getText().toString());
            double SUM = num1 - num2;

            TextView SUMshow = (TextView)findViewById(R.id.textView5);
            String show = String.valueOf(SUM);
            SUMshow.setText("= " + show);
        }
    };

    private View.OnClickListener mulclick = new View.OnClickListener(){
        public void onClick(View v){
            EditText numText1 = (EditText)findViewById(R.id.editText5);
            EditText numText2 = (EditText)findViewById(R.id.editText4);

            double num1 = Double.parseDouble(numText1.getText().toString());
            double num2 = Double.parseDouble(numText2.getText().toString());
            double SUM = num1 * num2;

            TextView SUMshow = (TextView)findViewById(R.id.textView5);
            String show = String.valueOf(SUM);
            SUMshow.setText("= " + show);
        }
    };

    private View.OnClickListener divclick = new View.OnClickListener(){
        public void onClick(View v){
            EditText numText1 = (EditText)findViewById(R.id.editText5);
            EditText numText2 = (EditText)findViewById(R.id.editText4);

            double num1 = Double.parseDouble(numText1.getText().toString());
            double num2 = Double.parseDouble(numText2.getText().toString());
            double SUM = num1 / num2;

            TextView SUMshow = (TextView)findViewById(R.id.textView5);
            String show = String.valueOf(SUM);
            SUMshow.setText("= " + show);
        }
    };
}
