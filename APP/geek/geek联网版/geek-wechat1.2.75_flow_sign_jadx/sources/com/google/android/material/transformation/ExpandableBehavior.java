package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.AbstractC0889xd;
import p000.aa0;
import p000.oa0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends AbstractC0889xd {
    public ExpandableBehavior() {
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: b */
    public abstract void mo665b(View view);

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: d */
    public final boolean mo666d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: g */
    public final boolean mo655g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = oa0.f3426a;
        if (!aa0.m40c(view)) {
            ArrayList arrayListM204j = coordinatorLayout.m204j(view);
            int size = arrayListM204j.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo665b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
