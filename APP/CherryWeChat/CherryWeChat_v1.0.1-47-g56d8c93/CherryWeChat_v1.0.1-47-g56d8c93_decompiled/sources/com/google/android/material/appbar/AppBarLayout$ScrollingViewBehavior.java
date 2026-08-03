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
    public static void m2420s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: b */
    public final void mo1454b(View view) {
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: d */
    public boolean mo1456d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((C0834Tb) view2.getLayoutParams()).f2645a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.f4373b;
            int iM1137e = bottom - (i == 0 ? 0 : AbstractC0585Nj.m1137e((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            view.offsetTopAndBottom(iM1137e);
        }
        return false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: h */
    public final boolean mo1460h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        m2420s(coordinatorLayout.m2136j(view));
        return false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: l */
    public final void mo1464l(CoordinatorLayout coordinatorLayout, View view) {
        m2420s(coordinatorLayout.m2136j(view));
    }

    @Override // p000.AbstractC2795zE
    /* JADX INFO: renamed from: r */
    public final void mo2421r(CoordinatorLayout coordinatorLayout, View view, int i) {
        m2420s(coordinatorLayout.m2136j(view));
        coordinatorLayout.m2140p(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0939Vu.f2955x);
        this.f4373b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
