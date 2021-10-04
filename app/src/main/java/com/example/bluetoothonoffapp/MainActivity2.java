package com.example.bluetoothonoffapp;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    ImageButton i;
    BluetoothAdapter b;
    private  boolean bt = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        i = findViewById(R.id.imageButton);
        b = BluetoothAdapter.getDefaultAdapter();
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!bt){
                    b.enable();
                    i.setImageResource(R.drawable.c);
                }
                else {
                    i.setImageResource(R.drawable.c);
                    b.disable();
                }
            }
        });
    }
}