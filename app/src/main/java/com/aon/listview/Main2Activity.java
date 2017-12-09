package com.aon.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private ImageView image;
    private TextView name, des;
    private Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        image = findViewById(R.id.image2);
        name = findViewById(R.id.Name1);
        des = findViewById(R.id.description2);
        int image2 = getIntent().getIntExtra("Image", 0);
        String name2 = getIntent().getStringExtra("Name");
        String des2 = getIntent().getStringExtra("Description");

        image.setImageResource(image2);
        name.setText(name2);
        des.setText(des2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
