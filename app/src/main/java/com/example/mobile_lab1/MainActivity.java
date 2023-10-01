package com.example.mobile_lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);


        Button btnChangeColor = findViewById(R.id.btnChangeColor);
    }

    public void onBtnChangeTextClick(View view) {
        this.tvMain.setText("Changed Text");
    }

    public void onBtnChangeColorClick(View view) {

        this.tvMain.setTextColor(0xFFFF0000);
    }
}
