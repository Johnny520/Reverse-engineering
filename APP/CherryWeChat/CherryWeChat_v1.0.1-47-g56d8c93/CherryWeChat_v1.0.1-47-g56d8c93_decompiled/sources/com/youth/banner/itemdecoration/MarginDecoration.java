package com.youth.banner.itemdecoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1160i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000.AbstractC2251mv;
import p000.C0038Av;

/* JADX INFO: loaded from: classes.dex */
public class MarginDecoration extends AbstractC2251mv {
    private int mMarginPx;

    public MarginDecoration(int i) {
        this.mMarginPx = i;
    }

    private LinearLayoutManager requireLinearLayoutManager(RecyclerView recyclerView) {
        AbstractC1160i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        throw new IllegalStateException("The layoutManager must be LinearLayoutManager");
    }

    @Override // p000.AbstractC2251mv
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0038Av c0038Av) {
        if (requireLinearLayoutManager(recyclerView).getOrientation() == 1) {
            int i = this.mMarginPx;
            rect.top = i;
            rect.bottom = i;
        } else {
            int i2 = this.mMarginPx;
            rect.left = i2;
            rect.right = i2;
        }
    }
}
