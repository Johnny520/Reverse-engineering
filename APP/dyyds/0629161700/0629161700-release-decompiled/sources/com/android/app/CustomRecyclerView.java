package com.android.app;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class CustomRecyclerView extends defpackage.C0055 {

    /* JADX INFO: renamed from: ᛱᛲᛶᲈ, reason: contains not printable characters */
    public int f344;

    public CustomRecyclerView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            r2 = -1
            r1.f344 = r2
            return
    }

    public CustomRecyclerView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r0 = -1
            r2.f344 = r0
            if (r4 == 0) goto L18
            int[] r1 = defpackage.AbstractC2184.f9270
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
            r4 = 0
            int r4 = r3.getDimensionPixelSize(r4, r0)
            r2.f344 = r4
            r3.recycle()
        L18:
            return
    }

    @Override // defpackage.C0055, android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = r2.f344
            if (r0 <= 0) goto L1a
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r1 = android.view.View.MeasureSpec.getSize(r4)
            if (r0 == 0) goto L12
            int r0 = r2.f344
            if (r1 <= r0) goto L1a
        L12:
            int r4 = r2.f344
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
        L1a:
            super.onMeasure(r3, r4)
            return
    }

    public void setMaxHeight(int r1) {
            r0 = this;
            r0.f344 = r1
            r0.requestLayout()
            return
    }
}
