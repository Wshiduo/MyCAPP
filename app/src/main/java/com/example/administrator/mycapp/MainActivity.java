package com.example.administrator.mycapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    int lengthLong = Toast.LENGTH_LONG;
    int a = Toast.LENGTH_LONG;
    int b = Toast.LENGTH_LONG;

    Toast.makeText(this, "aa4354353453454355435a", Toast.LENGTH_LONG);
    Toast.makeText(this, "345345435435455345", Toast.LENGTH_LONG);
  }
}
