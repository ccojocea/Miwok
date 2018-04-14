package com.example.android.miwok;

/**
 * Created by ccojo on 3/10/2018.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;

    public Word(String dt, String mt, int imgId){
        mDefaultTranslation = dt;
        mMiwokTranslation = mt;
        mImageResourceId = imgId;
    }

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

    public int getImageResourceId(){
        return mImageResourceId;
    }
}
