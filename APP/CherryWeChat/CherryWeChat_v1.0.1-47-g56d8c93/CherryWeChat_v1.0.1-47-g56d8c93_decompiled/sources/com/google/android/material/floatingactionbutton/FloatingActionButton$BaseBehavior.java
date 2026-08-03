package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.AbstractC0706Qb;
import p000.AbstractC0939Vu;
import p000.C0834Tb;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends AbstractC0706Qb {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: a */
    public final boolean mo1453a(View view) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: c */
    public final void mo1455c(C0834Tb c0834Tb) {
        if (c0834Tb.f2652h == 0) {
            c0834Tb.f2652h = 80;
        }
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: d */
    public final boolean mo1456d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0939Vu.f2938g);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
