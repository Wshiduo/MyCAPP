package com.example.administrator.mycapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toast.makeText(this, "aaa", Toast.LENGTH_LONG);
    Toast.makeText(this, "bbb", Toast.LENGTH_LONG);
  }
}
