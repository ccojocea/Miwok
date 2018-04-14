package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ccojo on 3/10/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /*
    public WordAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Word> numberWords) {
        super(context, resource, numberWords);
    }
     */
    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> numberWords) {
        super(context, 0, numberWords);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get the object located at this position in the list
        Word currentWord = getItem(position);

        // check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView miwokIV = listItemView.findViewById(R.id.imageView);
        if(currentWord.getImageResourceId() != 0){
            miwokIV.setImageResource(currentWord.getImageResourceId());
        } else {
            miwokIV.setVisibility(View.GONE);
        }

        // find the textview in the list_item.xml layout with the id text1
        TextView miwokTV = listItemView.findViewById(R.id.miwokTextView);
        //find the other textview
        TextView defaultTV = listItemView.findViewById(R.id.defaultTextView);

        miwokTV.setText(currentWord.getMiwokTranslation());
        defaultTV.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}
