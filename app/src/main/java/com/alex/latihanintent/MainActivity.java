package com.alex.latihanintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btntest = findViewById(R.id.btntest1);
        btntest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Siswa siswa = new Siswa("12345","Alex","Medan");
                Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
//                intent.putExtra("EXTRA1","Pemrograman");
//                intent.putExtra("EXTRA2", "Android");
                //intent.putExtra("DATASISWA",siswa);
//                startActivity(intent);
                startActivityForResult(intent, 3);
            }
        });

        Button btntest3 = findViewById(R.id.btntestCamera);
        btntest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_CAMERA_BUTTON);
                intent.setData(Uri.parse("tel:081392227732"));
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==3) {
            TextView tv = findViewById(R.id.tview);
            String str = data.getStringExtra("PESAN");
            tv.setText(str);
        }
    }
}