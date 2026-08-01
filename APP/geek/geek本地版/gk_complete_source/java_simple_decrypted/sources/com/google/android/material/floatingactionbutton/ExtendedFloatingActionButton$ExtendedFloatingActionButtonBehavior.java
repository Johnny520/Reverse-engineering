package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.wd;
import defpackage.wy;
import defpackage.zd;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends wd {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // defpackage.wd
    public final /* synthetic */ boolean a(View r1) {
        throw new ClassCastException();
    }

    @Override // defpackage.wd
    public final void c(zd r2) {
        if (r2.h != 0) goto L6;
        r2.h = 80;
        return;
    }

    @Override // defpackage.wd
    public final boolean d(CoordinatorLayout r1, View r2, View r3) {
        throw new ClassCastException();
    }

    @Override // defpackage.wd
    public final boolean g(CoordinatorLayout r1, View r2, int r3) {
        throw new ClassCastException();
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context r2, AttributeSet r3) {
        TypedArray r22 = r2.obtainStyledAttributes(r3, wy.f);
        r22.getBoolean(0, false);
        r22.getBoolean(1, true);
        r22.recycle();
    }
}
