package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class skin_fashion extends AppCompatActivity {
Button skin_care ,fashion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skin_fashion);
        skin_care = findViewById(R.id.skin);
        fashion=findViewById(R.id.fashoin);
        skin_care.setOnClickListener(new View.OnClickListener()  {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(skin_fashion.this,choice.class);
            startActivity(intent);
        }
    });
        fashion.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(skin_fashion.this,fashion.class);
                startActivity(intent);
            }
        });
    }
}