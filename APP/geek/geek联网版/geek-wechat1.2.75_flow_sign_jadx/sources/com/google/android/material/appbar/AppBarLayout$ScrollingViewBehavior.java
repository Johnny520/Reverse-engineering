package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.AbstractC0168dz;
import p000.AbstractC0274gu;
import p000.C0015ae;
import p000.oa0;
import p000.ya0;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends ya0 {

    /* JADX INFO: renamed from: b */
    public final int f916b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* JADX INFO: renamed from: s */
    public static void m664s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: d */
    public boolean mo666d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((C0015ae) view2.getLayoutParams()).f64a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.f916b;
            int iM1309c = bottom - (i == 0 ? 0 : AbstractC0274gu.m1309c((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = oa0.f3426a;
            view.offsetTopAndBottom(iM1309c);
        }
        return false;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: h */
    public final boolean mo656h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        m664s(coordinatorLayout.m204j(view));
        return false;
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: l */
    public final void mo667l(CoordinatorLayout coordinatorLayout, View view) {
        m664s(coordinatorLayout.m204j(view));
    }

    @Override // p000.ya0
    /* JADX INFO: renamed from: r */
    public final void mo668r(CoordinatorLayout coordinatorLayout, View view, int i) {
        m664s(coordinatorLayout.m204j(view));
        coordinatorLayout.m209q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0168dz.f1458u);
        this.f916b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: b */
    public final void mo665b(View view) {
    }
}
