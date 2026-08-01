package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class PopMenuListView extends ListView {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f11658;

    public PopMenuListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11658 = -1.0f;
    }

    public float getMaxHeight() {
        return this.f11658;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public final void layoutChildren() {
        try {
            super.layoutChildren();
        } catch (IllegalStateException unused) {
            ((BaseAdapter) getAdapter()).notifyDataSetChanged();
            super.layoutChildren();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        float size = View.MeasureSpec.getSize(i2);
        float f = this.f11658;
        if (f <= size && f > -1.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec(Float.valueOf(f).intValue(), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
