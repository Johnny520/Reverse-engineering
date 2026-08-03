package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;

/* JADX INFO: loaded from: classes2.dex */
public class PopMenuListView extends ListView {
    private float maxHeight;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PopMenuListView(Context context) {
        super(context);
        this.maxHeight = -1.0f;
    }

    public float getMaxHeight() {
        return this.maxHeight;
    }

    public boolean isCanScroll() {
        return (getFirstVisiblePosition() == 0 && getCount() == getLastVisiblePosition() + 1) ? false : true;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        try {
            super.layoutChildren();
        } catch (IllegalStateException unused) {
            ((BaseAdapter) getAdapter()).notifyDataSetChanged();
            super.layoutChildren();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        float f = this.maxHeight;
        if (f <= size && f > -1.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec(Float.valueOf(f).intValue(), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public PopMenuListView setMaxHeight(float f) {
        this.maxHeight = f;
        return this;
    }

    public PopMenuListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.maxHeight = -1.0f;
    }

    public PopMenuListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maxHeight = -1.0f;
    }
}
