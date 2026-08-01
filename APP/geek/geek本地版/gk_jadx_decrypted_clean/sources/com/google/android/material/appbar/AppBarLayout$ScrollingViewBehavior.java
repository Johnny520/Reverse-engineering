package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.AbstractC0126ct;
import p000.AbstractC0873wy;
import p000.C0963zd;
import p000.ja0;
import p000.ta0;

/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends ta0 {

    /* JADX INFO: renamed from: b */
    public final int f991b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    /* JADX INFO: renamed from: s */
    public static void m706s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: d */
    public boolean mo708d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((C0963zd) view2.getLayoutParams()).f5539a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.f991b;
            int iM810d = bottom - (i == 0 ? 0 : AbstractC0126ct.m810d((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = ja0.f2600a;
            view.offsetTopAndBottom(iM810d);
        }
        return false;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: h */
    public final boolean mo698h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        m706s(coordinatorLayout.m219j(view));
        return false;
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: l */
    public final void mo709l(CoordinatorLayout coordinatorLayout, View view) {
        m706s(coordinatorLayout.m219j(view));
    }

    @Override // p000.ta0
    /* JADX INFO: renamed from: r */
    public final void mo710r(CoordinatorLayout coordinatorLayout, View view, int i) {
        m706s(coordinatorLayout.m219j(view));
        coordinatorLayout.m224q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0873wy.f5062u);
        this.f991b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: b */
    public final void mo707b(View view) {
    }
}
