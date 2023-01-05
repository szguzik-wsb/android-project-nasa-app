package com.example.nasaapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView startText;
    private Button changeTextBtn;
    private Button changeTextBtn2;
    private Button changeToSecondActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startText = (TextView) findViewById(R.id.textView4);
        startText.setText(R.string.hello_manual_fragment);

        changeTextBtn = (Button) findViewById(R.id.button1);
        changeTextBtn.setOnClickListener(this);

        changeTextBtn2 = (Button) findViewById(R.id.button2);
        changeTextBtn2.setOnClickListener(this);

        changeToSecondActivityBtn = (Button) findViewById(R.id.button3);
        changeToSecondActivityBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == changeTextBtn.getId()) {
            startText.setText(R.string.hello_manual_fragment2);
        } else if (v.getId() == changeTextBtn2.getId()) {
            Toast.makeText(this, R.string.toast_1_show_text, Toast.LENGTH_LONG).show();
        } else if (v.getId() == changeToSecondActivityBtn.getId()) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
    }
}