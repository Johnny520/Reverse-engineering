package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.AbstractC0168dz;
import p000.AbstractC0889xd;
import p000.C0015ae;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* JADX INFO: loaded from: classes.dex */
public class C0115xe6e79f6<T> extends AbstractC0889xd {
    public C0115xe6e79f6() {
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean mo719a(View view) {
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

    public C0115xe6e79f6(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0168dz.f1443f);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
