package com.google.android.gms.samples.vision.ocrreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main17Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
    }
    public void onStart(View v){
        Intent it = new Intent(this,Main18Activity.class);
        startActivity(it);
    }
    public void onBack(View v){
        finish();
    }
}
