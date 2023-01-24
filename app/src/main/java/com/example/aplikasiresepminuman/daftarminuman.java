package com.example.aplikasiresepminuman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class daftarminuman extends AppCompatActivity {
    ImageButton regal, brown, mango, strawberry, milkshake, dalgona, choco, charcoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarminuman);

        regal =(ImageButton) findViewById(R.id.regal);
        regal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(daftarminuman.this, resepregal.class);
                startActivity(intent);
            }
        });
        brown =(ImageButton) findViewById(R.id.brown);
        brown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(daftarminuman.this, resepbrown.class);
                startActivity(intent);
            }
        });
        mango =(ImageButton) findViewById(R.id.mango);
        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(daftarminuman.this, resepmango.class);
                startActivity(intent);
            }
        });
        strawberry =(ImageButton) findViewById(R.id.strawberry);
        strawberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(daftarminuman.this, resepstrawberry.class);
                startActivity(intent);
            }
        });
        milkshake =(ImageButton) findViewById(R.id.milkshake);
        milkshake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(daftarminuman.this, resepmilkshake.class);
                startActivity(intent);
            }
        });
        dalgona =(ImageButton) findViewById(R.id.dalgona);
        dalgona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(daftarminuman.this, resepdalgona.class);
                startActivity(intent);
            }
        });
        choco =(ImageButton) findViewById(R.id.choco);
        choco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(daftarminuman.this, resepchoco.class);
                startActivity(intent);
            }
        });
        charcoal =(ImageButton) findViewById(R.id.charcoal);
        charcoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(daftarminuman.this, resepcharcoal.class);
                startActivity(intent);
            }
        });
    }
}