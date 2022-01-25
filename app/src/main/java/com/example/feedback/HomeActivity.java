package com.example.feedback;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    public static String var = null;
    public static int s1,s2,s3,s4,s5,s6,s7,s8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);
        CardView ml = findViewById(R.id.cardView);
        CardView clc = findViewById(R.id.cardView5);
        CardView cn = findViewById(R.id.cardView2);
        CardView seo = findViewById(R.id.cardView6);
        CardView emr = findViewById(R.id.cardView3);
        CardView ai = findViewById(R.id.cardView7);
        CardView app = findViewById(R.id.cardView4);
        CardView mad = findViewById(R.id.cardView8);
        Button button =(Button)findViewById(R.id.button2);

        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = "MLG";
                s1 = 1;
                Intent intent = new Intent(getApplicationContext(),feedback.class);
                startActivity(intent);
            }
        });

        clc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = "CLC";
                s2 = 1;
                Intent intent = new Intent(getApplicationContext(),feedback.class);
                startActivity(intent);
            }
        });

        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = "CN";
                s3 =1;
                Intent intent = new Intent(getApplicationContext(),feedback.class);
                startActivity(intent);
            }
        });

        seo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = "SEO";
                s4 = 1;
                Intent intent = new Intent(getApplicationContext(),feedback.class);
                startActivity(intent);
            }
        });

        emr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = "EMR";s5 = 1;
                Intent intent = new Intent(getApplicationContext(),feedback.class);
                startActivity(intent);
            }
        });

        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = "AI";
                s6 = 1;
                Intent intent = new Intent(getApplicationContext(),feedback.class);
                startActivity(intent);
            }
        });

        app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = "APP";
                s7 = 1;
                Intent intent = new Intent(getApplicationContext(),feedback.class);
                startActivity(intent);
            }
        });

        mad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = "MAD";
                s8=1;
                Intent intent = new Intent(getApplicationContext(),feedback.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 =0;s2=0;s3=0;s4=0;s5=0;s6=0;s7=0;s8=0;
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}