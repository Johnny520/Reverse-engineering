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
    public static void m1825s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
        }
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: b */
    public final void mo1826b(View view) {
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: d */
    public boolean mo1827d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC1058a abstractC1058a = ((C1061d) view2.getLayoutParams()).f4064a;
        if (abstractC1058a instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) abstractC1058a).getClass();
            int i2 = this.f2258c;
            int iM2043f = bottom - (i2 == 0 ? 0 : AbstractC0805P.m2043f((int) (0.0f * i2), 0, i2));
            Field field = AbstractC0080Q.f219a;
            view.offsetTopAndBottom(iM2043f);
        }
        return false;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: h */
    public final boolean mo1817h(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        m1825s(coordinatorLayout.m1170j(view));
        return false;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: l */
    public final void mo1828l(CoordinatorLayout coordinatorLayout, View view) {
        m1825s(coordinatorLayout.m1170j(view));
    }

    @Override // p062i0.AbstractC0954a
    /* JADX INFO: renamed from: r */
    public final void mo1829r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        m1825s(coordinatorLayout.m1170j(view));
        coordinatorLayout.m1174p(view, i2);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0942a.f3343o);
        this.f2258c = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
