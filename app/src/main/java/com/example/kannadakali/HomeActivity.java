package com.example.kannadakali;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button nounBtn=(Button) findViewById(R.id.button1);
        Typeface faceAkshar = Typeface.createFromAsset(getAssets(),"akshar.ttf");
        nounBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent noun = new Intent(HomeActivity.this, noun_words.class);
                startActivity(noun);
            }
        });
        Button verbBtn=(Button)findViewById(R.id.button2);
        verbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent verb = new Intent(HomeActivity.this, verb_words.class);
                startActivity(verb);
            }
        });
        Button adjBtn=(Button)findViewById(R.id.button3);
        adjBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adj = new Intent(HomeActivity.this, adj_words.class);
                startActivity(adj);
            }
        });
    }
}
