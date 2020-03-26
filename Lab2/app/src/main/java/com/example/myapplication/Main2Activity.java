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
        TextView SUMshow = (TextView)findViewById(R.id.textView9);

        Bundle bundle = this.getIntent().getExtras();

        BMIshow.setText("BMI = " +bundle.getString("BMIText"));
        SUMshow.setText("Caculation = " + bundle.getString("SUMText"));
    }
}
