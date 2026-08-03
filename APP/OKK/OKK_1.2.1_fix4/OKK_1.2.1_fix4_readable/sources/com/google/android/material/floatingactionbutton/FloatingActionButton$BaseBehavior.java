package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p034S.AbstractC0324d;
import p058g0.AbstractC0942a;
import p078r.AbstractC1058a;
import p078r.C1061d;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC1058a {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: a */
    public final boolean mo1881a(View view) {
        AbstractC0324d.m724g(view);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: c */
    public final void mo1843c(C1061d c1061d) {
        if (c1061d.f4071h == 0) {
            c1061d.f4071h = 80;
        }
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: d */
    public final boolean mo1827d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0324d.m724g(view);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public final boolean mo1816g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        AbstractC0324d.m724g(view);
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0942a.f3335g);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
