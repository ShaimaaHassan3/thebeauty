package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class fashion extends AppCompatActivity {
RadioGroup radioGroup;
RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fashion);
        radioGroup=findViewById(R.id.groupfashion);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                radioButton=findViewById(i);
                switch (radioButton.getId())
                {
                    case R.id.dresses :
                        setContentView(R.layout.dress);
                        break;
                    case R.id.buttom:
                        setContentView(R.layout.buttoms);
                        break;
                    case R.id.sweetshirts :
                        setContentView(R.layout.sweetshirts);
                        break;
                    case R.id.coat_jacket :
                        setContentView(R.layout.coat_jackets);
                        break;
                }
            }
        });
    }
}