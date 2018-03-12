package com.example.andriod.tourapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by fish on 3/8/2018.
 */

public class HotelsAdapter extends ArrayAdapter<Hotel> {

    private static final String LOG_TAG = HotelsAdapter.class.getSimpleName();

    public HotelsAdapter(Activity context, ArrayList<Hotel> look) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list. uj
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, look);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_itemh, parent, false);
        }

        Hotel currentsubject = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView subjectTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current word object and
        // set this text on the name TextView
        subjectTextView.setText(currentsubject.getmSubject());

        TextView typeTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version name from the current word object and
        // set this text on the name TextView
        typeTextView.setText(currentsubject.getmType());



        ImageView miwok = (ImageView) listItemView.findViewById(R.id.miwok_image);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        if (currentsubject.hasImage()) {
            // set image to the current available space//
            miwok.setImageResource(currentsubject.getImageResourceId());
            miwok.setVisibility(View.VISIBLE);
        }



        return listItemView;
    }
}
