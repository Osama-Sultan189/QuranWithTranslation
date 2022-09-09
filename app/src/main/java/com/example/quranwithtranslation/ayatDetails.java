package com.example.quranwithtranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ayatDetails extends AppCompatActivity {
    TextView ayahText;
    Button TU;
    Button MH;
    Button MK;
    Button FM;
    TextView trans;
    Ayah ayahWTrans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat_details);
        Intent intent = getIntent();
        ayahWTrans =  new Ayah(
                intent.getStringExtra("ayah"),
        intent.getStringExtra("ayahTransFM"),
        intent.getStringExtra("ayahTransMH"),
        intent.getStringExtra("ayahTransMK"),
        intent.getStringExtra("ayahTransTU")
        );
        ayahText =  findViewById(R.id.ayahArabic);
        TU= findViewById(R.id.MTU);
        MH= findViewById(R.id.MUH);
        MK= findViewById(R.id.DMK);
        FM= findViewById(R.id.FM);
        trans=findViewById(R.id.ayahTrans);
        ayahText.setText(ayahWTrans.AyahtextArabic);
        TU.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        trans.setText(ayahWTrans.transFatehMohammad+"");
                    }
                }
        );

        MH.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        trans.setText(ayahWTrans.transMehmoodUlHaq+"");
                    }
                }
        );

        MK.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        trans.setText(ayahWTrans.transDrMohsin+"");
                    }
                }
        );

        FM.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        trans.setText(ayahWTrans.transFatehMohammad+"");
                    }
                }
        );
    }
}