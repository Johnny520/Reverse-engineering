package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.AbstractC0852wd;
import p000.AbstractC0873wy;
import p000.C0963zd;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* JADX INFO: loaded from: classes.dex */
public class C0115xe6e79f6<T> extends AbstractC0852wd {
    public C0115xe6e79f6() {
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean mo761a(View view) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: c */
    public final void mo724c(C0963zd c0963zd) {
        if (c0963zd.f5546h == 0) {
            c0963zd.f5546h = 80;
        }
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: d */
    public final boolean mo708d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: g */
    public final boolean mo697g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public C0115xe6e79f6(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0873wy.f5047f);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
