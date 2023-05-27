package com.example.imagebuttonwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton google,spotify,youtube,bing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.google.com");
            }
        });
        bing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.bing.com");
            }
        });
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.spotify.com");
            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://www.youtube.com");
            }
        });
    }
    public void init(){
        google=findViewById(R.id.google);
        youtube=findViewById(R.id.youtube);
        bing=findViewById(R.id.bing);
        spotify=findViewById(R.id.spotify);
    }
    public void openUrl(String url){
        Intent intent=new Intent(this,WebviewActivity.class);
        intent.putExtra("url",url);
        startActivity(intent);
    }
}