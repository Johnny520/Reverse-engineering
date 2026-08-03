package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.AbstractC0706Qb;
import p000.AbstractC0939Vu;
import p000.C0834Tb;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* JADX INFO: loaded from: classes.dex */
public class C1278xe6e79f6<T> extends AbstractC0706Qb {
    public C1278xe6e79f6() {
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean mo1453a(View r1) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: c */
    public final void mo1455c(C0834Tb r2) {
        if (r2.f2652h != 0) goto L6;
        r2.f2652h = 80;
        return;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: d */
    public final boolean mo1456d(CoordinatorLayout r1, View r2, View r3) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout r1, View r2, int r3) {
        throw new ClassCastException();
    }

    public C1278xe6e79f6(Context r2, AttributeSet r3) {
        TypedArray r22 = r2.obtainStyledAttributes(r3, AbstractC0939Vu.f2937f);
        r22.getBoolean(0, false);
        r22.getBoolean(1, true);
        r22.recycle();
    }
}
