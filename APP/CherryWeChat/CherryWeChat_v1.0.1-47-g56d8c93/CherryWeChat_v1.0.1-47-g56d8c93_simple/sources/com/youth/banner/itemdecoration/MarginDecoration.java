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

    public MarginDecoration(int r1) {
        this.mMarginPx = r1;
    }

    private LinearLayoutManager requireLinearLayoutManager(RecyclerView r2) {
        AbstractC1160i r22 = r2.getLayoutManager();
        if ((r22 instanceof LinearLayoutManager) == false) goto L7;
        return (LinearLayoutManager) r22;
    L7:
        throw new IllegalStateException("The layoutManager must be LinearLayoutManager");
    }

    @Override // p000.AbstractC2251mv
    public void getItemOffsets(Rect r1, View r2, RecyclerView r3, C0038Av r4) {
        if (requireLinearLayoutManager(r3).getOrientation() != 1) goto L6;
        int r22 = this.mMarginPx;
        r1.top = r22;
        r1.bottom = r22;
        return;
    L6:
        int r23 = this.mMarginPx;
        r1.left = r23;
        r1.right = r23;
    }
}
