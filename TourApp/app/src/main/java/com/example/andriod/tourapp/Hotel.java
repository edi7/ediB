package com.example.andriod.tourapp;

/**
 * Created by fish on 3/8/2018.
 */

public class Hotel {
    private String mSubject;

    private String mType;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    public Hotel(int imageResourceId){
        mImageResourceId = imageResourceId;

    }

    public Hotel(String subject, int imageResourceId){
        mSubject = subject;
        mImageResourceId = imageResourceId;

    }

    public Hotel(String subject, String type, int imageResourceId){
        mSubject = subject;
        mImageResourceId = imageResourceId;
        mType = type;

    }

    public Hotel(String subject){
        mSubject = subject;


    }

    public String getmSubject() {
        return mSubject;
    }

    public int getImageResourceId() {return mImageResourceId;}

    public String getmType(){return mType;}

    public  boolean hasImage(){return mImageResourceId != NO_IMAGE_PROVIDED;}

}
