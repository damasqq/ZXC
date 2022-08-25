package com.example.myfirstzxc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    static int count = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        button = findViewById(R.id.clickButton);
        textView = findViewById(R.id.textView2);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                button.setText(count+"");

                if (count > 10 && count < 50) {
                    textView.setText("мало");
                }else
                    textView.setText("давай жми");
                if (count > 1000){
                    textView.setText("автокликер выруби");
                }
                if (count == 100){
                    Toast.makeText(getApplicationContext(), "соточка бро", Toast.LENGTH_LONG).show();
                }
            }
        });

        //обработчик нажатия на объект
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });


    }
}