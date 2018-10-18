package com.example.android.newsfeedapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Loads a list of articles by using an AsyncTask to perform the
 * network request to the given URL.
 */
public class GuardianLoader extends AsyncTaskLoader<List<Guardian>> {

    /** Tag for log messages */
    private static final String LOG_TAG = GuardianLoader.class.getName();

    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link GuardianLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public GuardianLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Guardian> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of articles.
        List<Guardian> guardians = QueryUtils.fetchArticleData(mUrl);
        return guardians;
    }
}
