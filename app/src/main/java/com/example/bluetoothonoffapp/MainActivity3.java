package com.example.bluetoothonoffapp;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class MainActivity3 extends AppCompatActivity {
    ToggleButton t;
    BluetoothAdapter b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t = findViewById(R.id.toggleButton);
        b = BluetoothAdapter.getDefaultAdapter();
        t.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==false){
                    b.enable();
                }
                else{
                    b.disable();
                }
            }
        });
    }
}