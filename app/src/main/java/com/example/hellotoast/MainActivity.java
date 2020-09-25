package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mShowCount;
    private int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=findViewById(R.id.textCount);
    }

    public void showToast(View view) {
        Toast.makeText(this, "HELLO TOAST!", Toast.LENGTH_LONG).show();
        mCount = mCount-mCount;
        mShowCount.setText(Integer.toString(mCount));
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount!=null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}