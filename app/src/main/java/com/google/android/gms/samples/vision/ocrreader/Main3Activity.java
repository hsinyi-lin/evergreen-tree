package com.google.android.gms.samples.vision.ocrreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void onAdd(View v){
        Intent it = new Intent(this,Main4Activity.class);
        startActivity(it);
    }
    public void onMinus(View v){
        Intent it = new Intent(this,Main7Activity.class);
        startActivity(it);
    }
    public void onMultiply(View v){
        Intent it = new Intent(this,Main12Activity.class);
        startActivity(it);
    }
    public void onDivision(View v){
        Intent it = new Intent(this,Main17Activity.class);
        startActivity(it);
    }
}
