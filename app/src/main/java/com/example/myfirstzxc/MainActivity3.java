package com.example.myfirstzxc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView textView = findViewById(R.id.textView2);
        String str = getIntent().getStringExtra("data");
        textView.setText(str);
    }
}