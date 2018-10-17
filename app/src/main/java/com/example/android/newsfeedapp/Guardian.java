package com.example.android.newsfeedapp;

/**
 * An {@link Guardian} object contains information related to a single earthquake.
 */
public class Guardian {

    /** Name of the article */
    private String mTitle;

    /** Date of the article */
    private long mDate;

    /** Section Name */
    private String mSection;

    /** Website URL of the article */
    private String mUrl;

    /**
     * Constructs a new {@link Guardian} object.
     *
     * @param title is the magnitude (size) of the earthquake
     * @param section is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Guardian(String title, String section, String url) {
        mTitle = title;
        //mDate = date;
        mSection = section;
        mUrl = url;
    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the location of the earthquake.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getDate() {
        return mDate;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
