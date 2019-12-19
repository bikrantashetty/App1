package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i2=getIntent();
        Bundle b=i2.getExtras();
        Toast.makeText(this, "Welcome "+b.getString(MainActivity.msg), Toast.LENGTH_SHORT).show();
    }
}
