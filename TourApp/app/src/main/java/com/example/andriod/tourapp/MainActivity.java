package com.example.andriod.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final ArrayList<Hotel> words = new ArrayList<Hotel>();
        // words.add("one");//
        Hotel w = new Hotel("Hotels", R.drawable.hotela);
        words.add(w);
        words.add(new Hotel("Beaches", R.drawable.beach));
        // words.add("three");//
        words.add(new Hotel("Restaurants", R.drawable.rest1));
        words.add(new Hotel("Shopping mall", R.drawable.mall));
        words.add(new Hotel("Attraction", R.drawable.poolb));
        words.add(new Hotel("Spa/Massage", R.drawable.room1));

        HotelAdapter adapter = new HotelAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.

        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // realese media player resources//

                switch (position) {
                    case 0:
                        myIntent = new Intent(MainActivity.this, Hotels.class);
                        startActivity(myIntent);
                        break;
                    case 1:
                        myIntent = new Intent(MainActivity.this, Hotels.class);
                        startActivity(myIntent);
                        break;
                }

            }
        });
    }
}

