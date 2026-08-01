package com.google.android.material.bottomsheet;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends android.view.View> extends defpackage.AbstractC0498 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int f357;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final boolean f358;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f359;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f360;

    public BottomSheetBehavior() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f358 = r0
            r0 = 4
            r1.f357 = r0
            return
    }

    public BottomSheetBehavior(android.content.Context r7, android.util.AttributeSet r8) {
            r6 = this;
            r6.<init>()
            r0 = 1
            r6.f358 = r0
            r1 = 4
            r6.f357 = r1
            int[] r2 = defpackage.AbstractC0347.f1781
            android.content.res.TypedArray r8 = r7.obtainStyledAttributes(r8, r2)
            r2 = 2
            android.util.TypedValue r3 = r8.peekValue(r2)
            r4 = -1
            if (r3 == 0) goto L1f
            int r3 = r3.data
            if (r3 != r4) goto L1f
            r6.m237(r3)
            goto L26
        L1f:
            int r2 = r8.getDimensionPixelSize(r2, r4)
            r6.m237(r2)
        L26:
            r2 = 0
            r8.getBoolean(r0, r2)
            boolean r0 = r8.getBoolean(r2, r0)
            boolean r3 = r6.f358
            r4 = 3
            if (r3 != r0) goto L34
            goto L45
        L34:
            r6.f358 = r0
            r3 = 6
            if (r0 == 0) goto L40
            int r0 = r6.f357
            if (r0 != r3) goto L40
            r5 = r0
            r0 = r4
            goto L43
        L40:
            int r0 = r6.f357
            r5 = r0
        L43:
            if (r5 != r0) goto L53
        L45:
            r8.getBoolean(r4, r2)
            r8.recycle()
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r7)
            r6.getScaledMaximumFlingVelocity()
            return
        L53:
            r6.f357 = r0
            if (r0 == r3) goto L5a
            if (r0 == r4) goto L5a
            r6 = 5
        L5a:
            r6 = 0
            throw r6
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final void m237(int r3) {
            r2 = this;
            boolean r0 = r2.f360
            r1 = -1
            if (r3 != r1) goto Lb
            if (r0 != 0) goto L12
            r3 = 1
            r2.f360 = r3
            return
        Lb:
            if (r0 != 0) goto L13
            int r0 = r2.f359
            if (r0 == r3) goto L12
            goto L13
        L12:
            return
        L13:
            r0 = 0
            r2.f360 = r0
            int r3 = java.lang.Math.max(r0, r3)
            r2.f359 = r3
            return
    }
}
