package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ct;
import defpackage.ja0;
import defpackage.ta0;
import defpackage.wy;
import defpackage.zd;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends ta0 {
    public final int b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList r3) {
        int r0 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        View r2 = (View) r3.get(r1);
        r1 = r1 + 1;
        goto L3
    }

    @Override // defpackage.wd
    public boolean d(CoordinatorLayout r4, View r5, View r6) {
        if ((((zd) r6.getLayoutParams()).a instanceof AppBarLayout$BaseBehavior) == false) goto L9;
        int r42 = r6.getBottom() - r5.getTop();
        int r62 = this.b;
        if (r62 != 0) goto L7;
        int r63 = 0;
    L8:
        int r43 = r42 - r63;
        WeakHashMap r64 = ja0.a;
        r5.offsetTopAndBottom(r43);
        goto L9
    L7:
        r63 = ct.d((int) (0.0f * r62), 0, r62);
    L9:
        return false;
    }

    @Override // defpackage.wd
    public final boolean h(CoordinatorLayout r1, View r2, int r3, int r4, int r5) {
        int r32 = r2.getLayoutParams().height;
        if (r32 != (-1)) goto L5;
    L6:
        s(r1.j(r2));
        return false;
    L5:
        if (r32 == (-2)) goto L6;
        return false;
    }

    @Override // defpackage.wd
    public final void l(CoordinatorLayout r1, View r2) {
        s(r1.j(r2));
    }

    @Override // defpackage.ta0
    public final void r(CoordinatorLayout r2, View r3, int r4) {
        s(r2.j(r3));
        r2.q(r3, r4);
    }

    public AppBarLayout$ScrollingViewBehavior(Context r2, AttributeSet r3) {
        new Rect();
        new Rect();
        TypedArray r22 = r2.obtainStyledAttributes(r3, wy.u);
        this.b = r22.getDimensionPixelSize(0, 0);
        r22.recycle();
    }

    @Override // defpackage.wd
    public final void b(View r1) {
    }
}
