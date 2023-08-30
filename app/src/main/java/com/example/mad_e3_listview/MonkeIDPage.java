package com.example.mad_e3_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MonkeIDPage extends AppCompatActivity {

    private TextView title;
    private ListView listView;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monke_idpage);

        title = findViewById(R.id.monke3_name);
        listView = findViewById(R.id.list_view);
        back = findViewById(R.id.backBtn);

        title.setText("Monke Explorer");

        String[] item_title = new String[]{"Sir Banana Peelington III", "7020720257", "sir.dingdong@monkas.com", "Zoo: Pingosaurus Menagerie Zoo", "Loadout: Peeled Banana Saber", "Attack points: 630", "Fire spin points: 420", "HP points: 80"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, item_title);
        listView.setAdapter(adapter);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MonkeIDPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}