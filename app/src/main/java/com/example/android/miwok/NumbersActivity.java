/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        String[] wordsArray = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        ArrayList<String> words = new ArrayList<>();
        for(int i = 0; i < wordsArray.length; i++){
            words.add(wordsArray[i]);
        }
/*
        LinearLayout rootView = findViewById(R.id.rootView);
        //TextView wordView = new TextView(this);
        //wordView.setText(words.get(0));
        //rootView.addView(wordView);
        for(String s : words){
            TextView tv = new TextView(this);
            rootView.addView(tv);
            tv.setText(s);
        }
*/
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, R.layout.simple_list_item_1, words);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);

        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(itemsAdapter);
    }
}
