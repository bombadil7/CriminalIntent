package com.google.bombadil.criminalintent;

import java.util.UUID;

/**
 * Created by Bombadil on 11/26/2015.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String Title) {
        mTitle = Title;
    }
}
