package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.abc.core.runtime.AbstractC0805P;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p006D.AbstractC0080Q;
import p058g0.AbstractC0942a;
import p062i0.AbstractC0954a;
import p078r.AbstractC1058a;
import p078r.C1061d;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends AbstractC0954a {

    /* JADX INFO: renamed from: c */
    public final int f2258c;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* JADX INFO: renamed from: s */
    public static void m1825s(ArrayList r3) {
        int r02 = r3.size();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L5;
        View r2 = (View) r3.get(r1);
        r1 = r1 + 1;
        goto L3
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: b */
    public final void mo1826b(View r1) {
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: d */
    public boolean mo1827d(CoordinatorLayout r4, View r5, View r6) {
        AbstractC1058a r42 = ((C1061d) r6.getLayoutParams()).f4064a;
        if ((r42 instanceof AppBarLayout$BaseBehavior) == false) goto L9;
        int r62 = r6.getBottom() - r5.getTop();
        ((AppBarLayout$BaseBehavior) r42).getClass();
        int r43 = this.f2258c;
        if (r43 != 0) goto L7;
        int r44 = 0;
    L8:
        int r63 = r62 - r44;
        Field r45 = AbstractC0080Q.f219a;
        r5.offsetTopAndBottom(r63);
        goto L9
    L7:
        r44 = AbstractC0805P.m2043f((int) (0.0f * r43), 0, r43);
    L9:
        return false;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: h */
    public final boolean mo1817h(CoordinatorLayout r1, View r2, int r3, int r4, int r5) {
        int r32 = r2.getLayoutParams().height;
        if (r32 != (-1)) goto L5;
    L6:
        m1825s(r1.m1170j(r2));
        return false;
    L5:
        if (r32 == (-2)) goto L6;
        return false;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: l */
    public final void mo1828l(CoordinatorLayout r1, View r2) {
        m1825s(r1.m1170j(r2));
    }

    @Override // p062i0.AbstractC0954a
    /* JADX INFO: renamed from: r */
    public final void mo1829r(CoordinatorLayout r2, View r3, int r4) {
        m1825s(r2.m1170j(r3));
        r2.m1174p(r3, r4);
    }

    public AppBarLayout$ScrollingViewBehavior(Context r3, AttributeSet r4) {
        super(0);
        new Rect();
        new Rect();
        TypedArray r32 = r3.obtainStyledAttributes(r4, AbstractC0942a.f3343o);
        this.f2258c = r32.getDimensionPixelSize(0, 0);
        r32.recycle();
    }
}
