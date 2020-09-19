package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class choice extends AppCompatActivity {
Button review ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choice);
        review = findViewById(R.id.review);
       review.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(choice.this,type.class);
                startActivity(intent);
            }
        });

    }
}