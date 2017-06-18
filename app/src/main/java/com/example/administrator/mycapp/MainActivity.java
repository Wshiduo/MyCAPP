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

    Toast.makeText(this, "aaa", Toast.LENGTH_LONG);
    Toast.makeText(this, "aaa", Toast.LENGTH_LONG);
    Toast.makeText(this, "aaa", Toast.LENGTH_LONG);
    Toast.makeText(this, "aaa", Toast.LENGTH_LONG);
    Toast.makeText(this, "aaa", Toast.LENGTH_LONG);
    Toast.makeText(this, "eeeeeeeeeee", Toast.LENGTH_LONG);
  }
}
