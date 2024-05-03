package com.alex.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DestinationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

//        Siswa getDataSiswa = getIntent().getParcelableExtra("DATASISWA");
        String extra1 = getIntent().getStringExtra("EXTRA1");
        String extra2 = getIntent().getStringExtra("EXTRA2");
        TextView tv = findViewById(R.id.textView);
        tv.setText(extra1 + " " + extra2);

        Button btntest2 = findViewById(R.id.btntest2);
        btntest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("PESAN","Ini adalah pengembalian dari Destination Activity");
                setResult(3, intent);
                finish();
            }
        });
    }
}