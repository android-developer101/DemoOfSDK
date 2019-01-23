package com.structure.demoofsdk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.structure.mylibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToasterMessage.s(this,"Hello Toast");
    }
}
