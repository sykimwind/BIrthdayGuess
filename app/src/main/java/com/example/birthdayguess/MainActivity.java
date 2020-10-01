package com.example.birthdayguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "틀렸지 바보야!!!!", Toast.LENGTH_SHORT).show();

            }
        });

        Button button2 = findViewById(R.id.button2;
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "이것도 틀렸지 바보야!!!!", Toast.LENGTH_SHORT).show();

            }
        });

        Button button3 = findViewById(R.id.button3;
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "딩동댕!!", Toast.LENGTH_SHORT).show();

            }
        });




    }
}