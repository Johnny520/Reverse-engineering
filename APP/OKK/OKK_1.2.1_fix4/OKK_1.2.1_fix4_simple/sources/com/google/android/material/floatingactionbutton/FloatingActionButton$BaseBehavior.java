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
    public final boolean mo1881a(View r1) {
        AbstractC0324d.m724g(r1);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: c */
    public final void mo1843c(C1061d r2) {
        if (r2.f4071h != 0) goto L6;
        r2.f4071h = 80;
        return;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: d */
    public final boolean mo1827d(CoordinatorLayout r1, View r2, View r3) {
        AbstractC0324d.m724g(r2);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public final boolean mo1816g(CoordinatorLayout r1, View r2, int r3) {
        AbstractC0324d.m724g(r2);
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context r2, AttributeSet r3) {
        TypedArray r22 = r2.obtainStyledAttributes(r3, AbstractC0942a.f3335g);
        r22.getBoolean(0, true);
        r22.recycle();
    }
}
