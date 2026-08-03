package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.AbstractC0585Nj;
import p000.AbstractC0939Vu;
import p000.AbstractC2185lE;
import p000.AbstractC2795zE;
import p000.C0834Tb;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC2795zE {

    /* JADX INFO: renamed from: b */
    public final int f4373b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* JADX INFO: renamed from: s */
    public static void m2420s(ArrayList r3) {
        int r0 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        View r2 = (View) r3.get(r1);
        r1 = r1 + 1;
        goto L3
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: b */
    public final void mo1454b(View r1) {
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: d */
    public boolean mo1456d(CoordinatorLayout r4, View r5, View r6) {
        if ((((C0834Tb) r6.getLayoutParams()).f2645a instanceof AppBarLayout$BaseBehavior) == false) goto L9;
        int r42 = r6.getBottom() - r5.getTop();
        int r62 = this.f4373b;
        if (r62 != 0) goto L7;
        int r63 = 0;
    L8:
        int r43 = r42 - r63;
        WeakHashMap r64 = AbstractC2185lE.f7617a;
        r5.offsetTopAndBottom(r43);
        goto L9
    L7:
        r63 = AbstractC0585Nj.m1137e((int) (0.0f * r62), 0, r62);
    L9:
        return false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: h */
    public final boolean mo1460h(CoordinatorLayout r1, View r2, int r3, int r4, int r5) {
        int r32 = r2.getLayoutParams().height;
        if (r32 != (-1)) goto L5;
    L6:
        m2420s(r1.m2136j(r2));
        return false;
    L5:
        if (r32 == (-2)) goto L6;
        return false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: l */
    public final void mo1464l(CoordinatorLayout r1, View r2) {
        m2420s(r1.m2136j(r2));
    }

    @Override // p000.AbstractC2795zE
    /* JADX INFO: renamed from: r */
    public final void mo2421r(CoordinatorLayout r2, View r3, int r4) {
        m2420s(r2.m2136j(r3));
        r2.m2140p(r3, r4);
    }

    public AppBarLayout$ScrollingViewBehavior(Context r2, AttributeSet r3) {
        new Rect();
        new Rect();
        TypedArray r22 = r2.obtainStyledAttributes(r3, AbstractC0939Vu.f2955x);
        this.f4373b = r22.getDimensionPixelSize(0, 0);
        r22.recycle();
    }
}
