package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class type extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.type);
        radioGroup=findViewById(R.id.type);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                radioButton=findViewById(i);
                switch (radioButton.getId())
                {
                    case R.id.dry:
                        setContentView(R.layout.review_dry);
                        break;
                    case R.id.oily:
                        setContentView(R.layout.review_oily);
                        break;
                    case R.id.normal:
                        setContentView(R.layout.review);
                        break;
                    case R.id.combination:
                        setContentView(R.layout.review_combination);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Select Type", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}