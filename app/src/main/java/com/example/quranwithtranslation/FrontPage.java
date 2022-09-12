package com.example.quranwithtranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrontPage extends AppCompatActivity {
    Button si;
    Button pi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        si=findViewById(R.id.si);
        pi=findViewById(R.id.pi);
        si.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent In = new Intent(FrontPage.this, MainActivity.class);
                        startActivity(In);
                    }
                }
        );

        pi.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent In = new Intent(FrontPage.this, ParaList.class);
                        startActivity(In);
                    }
                }
        );
    }
}