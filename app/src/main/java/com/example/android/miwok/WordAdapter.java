package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ccojo on 3/10/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int colorId;
    //private MediaPlayer mediaPlayer;

    /*
    public WordAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Word> numberWords) {
        super(context, resource, numberWords);
    }
     */
    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> numberWords, int colorId) {
        super(context, 0, numberWords);
        this.colorId = colorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get the object located at this position in the list
        final Word currentWord = getItem(position);

        // check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        View textCon = listItemView.findViewById(R.id.text_container);
        textCon.setBackgroundResource(colorId);
        /*
        int color = ContextCompat.getColor(getContext(), colorId);
        textCon.setBackgroundColor(color);
         */

        /*
        ImageButton play = listItemView.findViewById(R.id.play_button);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer != null && mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                }
                if(mediaPlayer != null){
                    mediaPlayer.release();
                    Log.d("RELEASE ME!!!", "RELEAAAAAAAASE MEEEEEEE!!!!");
                }
                mediaPlayer = MediaPlayer.create(getContext(), currentWord.getSoundResourceId());
                mediaPlayer.start();
            }
        });
        */

        ImageView miwokIV = listItemView.findViewById(R.id.imageView);
        if(currentWord.hasImage()){
            miwokIV.setVisibility(View.VISIBLE);
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
