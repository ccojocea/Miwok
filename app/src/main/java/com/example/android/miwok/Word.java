package com.example.android.miwok;

/**
 * Created by ccojo on 3/10/2018.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String dt, String mt){
        mDefaultTranslation = dt;
        mMiwokTranslation = mt;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public void setDefaultTranslation(String s){
        mDefaultTranslation = s;
    }

    public void setMiwokTranslation(String s){
        mMiwokTranslation = s;
    }
}
