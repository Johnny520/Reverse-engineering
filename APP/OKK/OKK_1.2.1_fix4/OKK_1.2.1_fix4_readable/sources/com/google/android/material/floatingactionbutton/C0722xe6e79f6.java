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

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* JADX INFO: loaded from: classes.dex */
public class C0722xe6e79f6<T> extends AbstractC1058a {
    public C0722xe6e79f6() {
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo1881a(View view) {
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

    public C0722xe6e79f6(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0942a.f3334f);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
