package com.example.miwokapplication;

import android.widget.ImageView;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImage = N0_IMAGE;
    private static final int N0_IMAGE = -1;
    private int mAudioResourceID;

    public Word(String DefaultTranslation, String miwokTranslation, int image, int audioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImage = image;
        mAudioResourceID = audioResourceId;
    }

    public Word(String DefaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceId;
    }

    public int getmImage() {
        return mImage;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public int getAudioResourceID() {
        return mAudioResourceID;
    }

    public boolean hasImage(){
        return mImage != N0_IMAGE;
    }
}
