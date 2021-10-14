package com.MVVMExample.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.MVVMExample.MainViewModel.MainViewModel;
import com.MVVMExample.myapplication.R;

public class ShowActivity extends AppCompatActivity {

    TextView textView;
    MainViewModel mainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        /// just get data from view model and show in this textview
        mainViewModel = ViewModelProvider.
        textView.setText();


    }
    private void init()
    {
        textView = findViewById(R.id.mytextview);
    }
}