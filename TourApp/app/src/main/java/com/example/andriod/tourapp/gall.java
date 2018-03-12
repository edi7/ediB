package com.example.andriod.tourapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class gall extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_gall, container, false);

        final ArrayList<Hotel> galls = new ArrayList<Hotel>();
        // words.add("one");//
        Hotel w = new Hotel( R.drawable.room1);
        galls.add(w);
        galls.add(new Hotel( R.drawable.rest2));
        // words.add("three");//
        galls.add(new Hotel(R.drawable.poolb));
        galls.add(new Hotel(R.drawable.hotelroom));
        galls.add(new Hotel( R.drawable.bea));
        galls.add(new Hotel( R.drawable.poola));
        galls.add(new Hotel(R.drawable.regent));
        galls.add(new Hotel(R.drawable.accra3));
        galls.add(new Hotel( R.drawable.rest));
        galls.add(new Hotel( R.drawable.regent3));
        galls.add(new Hotel( R.drawable.beach));
        galls.add(new Hotel( R.drawable.poola));
        galls.add(new Hotel(R.drawable.regent));
        galls.add(new Hotel(R.drawable.hotelb));
        galls.add(new Hotel( R.drawable.rest));
        galls.add(new Hotel( R.drawable.regent3));

        gallAdapter adapter = new gallAdapter(getActivity(), galls);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.

        GridView listView = (GridView) rootView.findViewById(R.id.grid);
        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);


        return rootView;
    }


}
