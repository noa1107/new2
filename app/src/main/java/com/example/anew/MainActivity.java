package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Iview
{
    private  presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new presenter(this);
    }


    @Override
    public void updateView(int row, int col, int player)
    {

    }

    @Override
    public void displayMassage(String message)
    {

    }
}