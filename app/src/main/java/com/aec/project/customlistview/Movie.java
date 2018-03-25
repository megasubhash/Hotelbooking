package com.aec.project.customlistview;

/**
 * Created by Rocky on 3/24/2018.
 */

public class Movie {

    // Store the id of the  movie poster
    private int hImageDrawable;
    // Store the name of the movie
    private String hname;
    // Store the release date of the movie
    private String haddress;

    private String price;
    // Constructor that is used to create an instance of the Movie object
    public Movie(int mImageDrawable, String mName, String haddress,String price) {
        this.hImageDrawable = mImageDrawable;
        this.hname = mName;
        this.price = price;
        this.haddress = haddress;
    }

    public int getmImageDrawable() {
        return hImageDrawable;
    }

    public void setmImageDrawable(int mImageDrawable) {
        this.hImageDrawable = mImageDrawable;
    }

    public String getmName() {
        return hname;
    }

    public void setmName(String mName) {
        this.hname = mName;
    }

    public String getmAddress() {
        return haddress;
    }

    public void setmAddress(String haddress) {
        this.haddress = haddress;
    }

    public String getmPrice() {
        return price;
    }

    public void setmPrice(String hprice) {
        this.price = hprice;
    }
}