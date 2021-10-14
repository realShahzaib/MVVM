package com.MVVMExample.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.MVVMExample.myapplication.R;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void savedDataClicked(View view) {

        startActivity(new Intent(MainActivity.this,ShowActivity.class));
    }

    public void init()
    {
        editText = findViewById(R.id.edittext);
    }
}