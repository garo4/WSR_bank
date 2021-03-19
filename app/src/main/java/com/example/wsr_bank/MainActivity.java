package com.example.wsr_bank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout maps;
    TextView TextDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextDate = findViewById(R.id.TextDate);

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String dateTime = simpleDateFormat.format(calendar.getTime());
        TextDate.setText(dateTime);

        maps = (LinearLayout) findViewById(R.id.mapBank);
        maps.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId())  {
            case R.id.mapBank:
                Intent intent1 = new Intent(this, mapBank.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }

    public void onLogin(View v){
        Intent intent2 = new Intent(this, Login.class);
        startActivity(intent2);
    }

}