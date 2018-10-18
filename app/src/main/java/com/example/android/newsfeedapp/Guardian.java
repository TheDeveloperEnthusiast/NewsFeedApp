package com.example.android.newsfeedapp;

/**
 * An {@link Guardian} object contains information related to a guardian article
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
     * @param title is the name of the article
     * @param section is the name of the section of the article(Sports)
     * @param url is the website URL to find more details about the article
     */
    public Guardian(String title, String section, String url) {
        mTitle = title;
        //mDate = date;
        mSection = section;
        mUrl = url;
    }

    /**
     * Returns the title of the article
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the section genre of the article
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Returns the time of the article
     */
    public long getDate() {
        return mDate;
    }

    /**
     * Returns the website URL to find more information about the article
     */
    public String getUrl() {
        return mUrl;
    }
}
