package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.AbstractC0852wd;
import p000.ja0;
import p000.v90;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends AbstractC0852wd {
    public ExpandableBehavior() {
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: b */
    public abstract void mo707b(View view);

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: d */
    public final boolean mo708d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: g */
    public final boolean mo697g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = ja0.f2600a;
        if (!v90.m2496c(view)) {
            ArrayList arrayListM219j = coordinatorLayout.m219j(view);
            int size = arrayListM219j.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo707b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
