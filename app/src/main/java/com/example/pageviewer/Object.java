package com.example.pageviewer;

public enum Object {

    pink(R.string.pink, R.layout.view1),
    gray(R.string.gray, R.layout.view2),
    white(R.string.white, R.layout.view3);

    private int mTitleResId;
    private int mLayoutResId;

    Object(int mTitleResId, int mLayoutResId) {
        this.mTitleResId = mTitleResId;
        this.mLayoutResId = mLayoutResId;
    }

    public int getmTitleResId() {
        return mTitleResId;
    }

    public void setmTitleResId(int mTitleResId) {
        this.mTitleResId = mTitleResId;
    }

    public int getmLayoutResId() {
        return mLayoutResId;
    }

    public void setmLayoutResId(int mLayoutResId) {
        this.mLayoutResId = mLayoutResId;
    }
}
