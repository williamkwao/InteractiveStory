package com.williamkwao.interactivestory.ui.model;

/**
 * Created by willamkwao on 4/10/15.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int mNextPage) {
        this.mNextPage = mNextPage;
    }
}
