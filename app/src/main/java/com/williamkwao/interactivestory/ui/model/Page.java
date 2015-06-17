package com.williamkwao.interactivestory.ui.model;

/**
 * Created by willamkwao on 4/10/15.
 */
public class Page {
    private int mImageId;
    private Choice mChoice1;
    private Choice mChoice2;
    private String mText;



    private boolean mIsFinal = false;

    public Page(int imageId, String text, Choice choice1, Choice choice2 ){
          this.mImageId = imageId;
          this.mText  = text;
          this.mChoice1 = choice1;
          this.mChoice2 =choice2;
    }
    public Page(int imageId, String text ){
        this.mImageId = imageId;
        this.mText  = text;
        mChoice1 =null;
        mChoice2 =null;
        mIsFinal = true;
    }


    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice mChoice1) {
        this.mChoice1 = mChoice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice mChoice2) {
        this.mChoice2 = mChoice2;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public boolean getIsFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean mIsFinal) {
        this.mIsFinal = mIsFinal;
    }
}
