package com.example.aplikasiresepminuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class splash2 extends AppCompatActivity {

    ImageView pilih;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        pilih =(ImageView) findViewById(R.id.pilih);
        pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(splash2.this, daftarminuman.class);
                startActivity(intent);
            }
        });
    }
}