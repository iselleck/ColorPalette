package com.chameleoncompany.chameleon;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerList);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        recyclerView.setAdapter(new cycleViewAdapter(generatePalettes()));
    }

    private ArrayList<Palette> generatePalettes(){
        ArrayList<Palette> palettes = new ArrayList<>();
        palettes.add(new Palette("RED", "#D32F2F", Color.parseColor("#F44336"),Color.parseColor("#ffcdd2"), Color.parseColor("#ff5252"), Color.parseColor("#ffffff"), Color.parseColor("#b6b6b6") ));
        palettes.add(new Palette("PINK", "#FF4081", Color.parseColor("#ff4081"), Color.parseColor("#c2185b"), Color.parseColor("#e91e63"), Color.parseColor("#f8bbd0"), Color.parseColor("#ffffff")));
        palettes.add(new Palette("Purple", "#7B1FA2", Color.parseColor("#7b1fa2"), Color.parseColor("#303f9f"), Color.parseColor("#3f51b5"), Color.parseColor("#536dfe"), Color.parseColor("#c5cae9")));
        palettes.add(new Palette("BLUE", "#536DFE", Color.parseColor("#536dfe"), Color.parseColor("#1976d2"), Color.parseColor("#448aff"),  Color.parseColor("#2196f3"),  Color.parseColor("#bbdefb")));
        palettes.add(new Palette("GREEN", "#388E3C", Color.parseColor("#388e3c"), Color.parseColor("#4caf50"),  Color.parseColor("#689f38"),  Color.parseColor("#c8ec69"),  Color.parseColor("#8bc34a")));
        palettes.add(new Palette("ORANGE", "#FF5722", Color.parseColor("#ff5722"), Color.parseColor("#f57c00"), Color.parseColor("#ff9800"), Color.parseColor("#e64a19"), Color.parseColor("#ffccbc")));
        palettes.add(new Palette("AMBER", "#FFA000", Color.parseColor("#ffa000"), Color.parseColor("#ffc107"), Color.parseColor("#ffeb3b"), Color.parseColor("#ffecb3"), Color.parseColor("#fbc02d")));
        return palettes;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
