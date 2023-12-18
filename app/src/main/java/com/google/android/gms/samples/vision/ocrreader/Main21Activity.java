package com.google.android.gms.samples.vision.ocrreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main21Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
        Intent it = getIntent();
        String result = it.getStringExtra("count");
        String resultgood = it.getStringExtra("good");
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("已答題數："+result+"題\n"+"答對："+resultgood+"題");
    }
    public void onStart(View v){
        Intent it = new Intent(this,MainActivity.class);
        startActivity(it);
    }
}
