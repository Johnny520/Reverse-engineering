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
    public final /* synthetic */ boolean mo1453a(View view) {
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

    public C1278xe6e79f6(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0939Vu.f2937f);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
