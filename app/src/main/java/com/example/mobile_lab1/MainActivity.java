package com.example.mobile_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);

        Button btnChangeText = (Button) findViewById(R.id.btnChangeText);
        btnChangeText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvMain.setText("Changed Text");
            }
        });

    }
}