/**
 * This class contains methods for the intent/ activity triggered by clicking anywhere on the welcome screen
 * MAD-E4
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package com.example.mad_e3_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

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

        String[] item_title = new String[]{"Sir Banana Peelington III", "2025770207", "sir.dingdong@monkas.com", "Zoo: Pingosaurus Menagerie Zoo", "Loadout: Peeled Banana Saber", "Attack points: 630", "Fire spin points: 420", "HP points: 80"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, item_title);
        listView.setAdapter(adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MonkeIDPage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //EXTRA
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String clicked_item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),"Clicked "+clicked_item,Toast.LENGTH_LONG).show();
            }
        });


    }
}