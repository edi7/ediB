package com.example.andriod.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static android.os.Build.VERSION_CODES.M;

public class Hotels extends AppCompatActivity {
    private Intent myIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);


        final ArrayList<Hotel> look = new ArrayList<Hotel>();
        // words.add("one");//
        Hotel w = new Hotel("Labadi Beach Hotels","#1 Best vaule of 90 hotels in Accra 4 deals from NGN 82,746", R.drawable.regent2);
        look.add(w);
        look.add(new Hotel("The African Rgent Hotel","#2 Best vaule of 90 hotels in Accra 4 deals from NGN 72,046", R.drawable.hotelb));
        // words.add("three");//
        look.add(new Hotel("Movenpick Ambassador Hotel Accra","#3 Best vaule of 90 hotels in Accra 4 deals from NGN 122,750", R.drawable.amba1));
        look.add(new Hotel("Tang Palace Hotel","#4 Best vaule of 90 hotels in Accra 4 deals from NGN 70,000", R.drawable.room1));
        look.add(new Hotel("Hotel Georgia","#4 Best vaule of 90 hotels in Accra 4 deals from NGN 30,035", R.drawable.regent3));
        look.add(new Hotel("Oak Plaza Hotel East Airport","#5 Best vaule of 90 hotels in Accra 4 deals from NGN 53,633", R.drawable.hill2));
        look.add(new Hotel("Movenpick Ambassador Hotel Accra","#3 Best vaule of 90 hotels in Accra 4 deals from NGN 122,750", R.drawable.amba1));
        look.add(new Hotel("Tang Palace Hotel","#4 Best vaule of 90 hotels in Accra 4 deals from NGN 70,000", R.drawable.room1));
        look.add(new Hotel("Hotel Georgia","#4 Best vaule of 90 hotels in Accra 4 deals from NGN 30,035", R.drawable.regent3));
        look.add(new Hotel("Oak Plaza Hotel East Airport","#5 Best vaule of 90 hotels in Accra 4 deals from NGN 53,633", R.drawable.hill2));

        HotelsAdapter adapter = new HotelsAdapter(this, look);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.

        ListView listView = (ListView) findViewById(R.id.listt);
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
                        myIntent = new Intent(Hotels.this, Labadi.class);
                        startActivity(myIntent);
                        break;
                    case 1:
                        myIntent = new Intent(Hotels.this, Labadi.class);
                        startActivity(myIntent);
                        break;
                }

            }
        });
    }
}
