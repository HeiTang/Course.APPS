package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Formatter;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView BMIshow = (TextView)findViewById(R.id.textView4);
//        TextView SUMshow = (TextView)findViewById(R.id.textView9);

        Bundle bundle = this.getIntent().getExtras();

        double BMI = Double.parseDouble(bundle.getString("BMIText"));
//        double SUM = Double.parseDouble(bundle.getString("SUMText"));
        Formatter nf;
        BMIshow.setText("BMI = " + String.valueOf(BMI));
//        SUMshow.setText("Caculation = " + String.valueOf(SUM));
    }
}
