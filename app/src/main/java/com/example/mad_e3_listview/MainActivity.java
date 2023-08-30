package com.example.mad_e3_listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout mainLayout;
    private TextView title;
    private TextView description;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.monke3_name);
        description = findViewById(R.id.monke3_desc);
        img = findViewById(R.id.monke3_img);
        title.setText("Celebes Crested Macaque Monkey");
        img.setImageResource(R.drawable.monke3);
        description.setText(R.string.monke3_desc);

        mainLayout = findViewById(R.id.mainlayout);

        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monkePage = new Intent(MainActivity.this,MonkeIDPage.class);
                startActivity(monkePage);
            }
        });


    }
}