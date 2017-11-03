package com.example.billy.diceapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button btnRoll;
    private TextView tvMyResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRoll = (Button)findViewById(R.id.btnRoll);
        tvMyResult = (TextView)findViewById(R.id.tvMyResult);

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int result = rand.nextInt(6)+1;
                tvMyResult.setText(String.valueOf(result));
            }
        });



    }
}
