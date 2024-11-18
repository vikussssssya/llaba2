package com.example.lab2n;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //переход на 2 экран
    public void Go2(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    //переход на 3 экран
    public void Go3(View v) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void Go4(View v) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void exit(View v) {
        this.finishAffinity();
    }
}