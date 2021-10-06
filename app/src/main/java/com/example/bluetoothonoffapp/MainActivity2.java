package com.example.bluetoothonoffapp;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    Button btn;
    ImageButton i;
    BluetoothAdapter b;
    private  boolean bt = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        i = findViewById(R.id.imageButton);
        b = BluetoothAdapter.getDefaultAdapter();
        btn = findViewById(R.id.button4);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!bt){
                    b.enable();
                    i.setImageResource(R.drawable.c);
                    bt = true;
                }
                else {
                    i.setImageResource(R.drawable.c);
                    b.disable();
                    bt = false;
                }
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}