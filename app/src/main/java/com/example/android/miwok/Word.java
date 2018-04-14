package com.example.android.miwok;

/**
 * Created by ccojo on 3/10/2018.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mSoundResourceId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String dt, String mt, int imgId, int soundId){
        mDefaultTranslation = dt;
        mMiwokTranslation = mt;
        mImageResourceId = imgId;
        mSoundResourceId = soundId;
    }

    public Word(String dt, String mt, int soundId){
        mDefaultTranslation = dt;
        mMiwokTranslation = mt;
        mSoundResourceId = soundId;
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

    public int getSoundResourceId() {
        return mSoundResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
