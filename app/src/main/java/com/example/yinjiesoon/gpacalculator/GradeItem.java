package com.example.yinjiesoon.gpacalculator;

/**
 * Created by yinjie.soon on 2/24/2015.
 */
public class GradeItem {

    private String mName;
    private float mScore;
    private float mTotalScore;
    private int mWeightage;

    public GradeItem(String mName, float mScore, float mTotalScore, int mWeightage) {
        this.mName = mName;
        this.mScore = mScore;
        this.mTotalScore = mTotalScore;
        this.mWeightage = mWeightage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public float getmScore() {
        return mScore;
    }

    public void setmScore(float mScore) {
        this.mScore = mScore;
    }

    public float getmTotalScore() {
        return mTotalScore;
    }

    public void setmTotalScore(float mTotalScore) {
        this.mTotalScore = mTotalScore;
    }

    public int getmWeightage() {
        return mWeightage;
    }

    public void setmWeightage(int mWeightage) {
        this.mWeightage = mWeightage;
    }
}
