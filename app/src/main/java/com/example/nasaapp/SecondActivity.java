package com.example.nasaapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button changeToFirstActivityBtn;
    private Button showWsbPageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        changeToFirstActivityBtn = (Button) findViewById(R.id.button4);
        showWsbPageBtn = (Button) findViewById(R.id.button5);

        // Przez metodę zagniezdzona
        changeToFirstActivityBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Jawne przekazanie intentu - czyli co chcemy zrobic i jak chcemy zrobic
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
        // Przez metodę zagniezdzona
        showWsbPageBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wsb.pl"));
                startActivity(intent);
            }
        });
    }
}