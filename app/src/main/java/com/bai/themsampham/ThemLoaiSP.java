package com.bai.themsampham;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bai.themsampham.model.LoaiSP;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ThemLoaiSP extends AppCompatActivity {
    TextInputEditText txt_id,txt_tenSP,txt_soSPTL,txt_linkAnh;
    Button btn_themLoaiSP;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_loai_sp);
        txt_id = findViewById(R.id.txt_id);
        txt_tenSP = findViewById(R.id.txt_tenSP);
        txt_soSPTL = findViewById(R.id.txt_SoSPTL);
        txt_linkAnh = findViewById(R.id.txt_linkAnh);
        btn_themLoaiSP = findViewById(R.id.btn_ThemLoaiSP);

        btn_themLoaiSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("loai_sp");

                //get all the value
                String id = txt_id.getEditableText().toString();
                String tenSP = txt_tenSP.getEditableText().toString();
                String linkAnh = txt_linkAnh.getEditableText().toString();
                String soSPTL = txt_soSPTL.getEditableText().toString();

                LoaiSP loaiSP = new LoaiSP(id,tenSP,linkAnh,soSPTL);

                myRef.child(id).setValue(loaiSP);

            }
        });
    }
}