package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.AbstractC0168dz;
import p000.AbstractC0889xd;
import p000.C0015ae;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0889xd {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: a */
    public final boolean mo719a(View view) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: c */
    public final void mo682c(C0015ae c0015ae) {
        if (c0015ae.f71h == 0) {
            c0015ae.f71h = 80;
        }
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: d */
    public final boolean mo666d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: g */
    public final boolean mo655g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0168dz.f1444g);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
