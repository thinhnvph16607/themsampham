package com.bai.themsampham;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    Button btn_LoaiSP,btn_SanPham;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_LoaiSP = findViewById(R.id.btn_LoaiSP);
        btn_SanPham = findViewById(R.id.btn_SanPham);

        btn_LoaiSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThemLoaiSP.class);
                startActivity(intent);
            }
        });
        btn_SanPham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThemLoaiSP.class);
                startActivity(intent);
            }
        });

    }
}