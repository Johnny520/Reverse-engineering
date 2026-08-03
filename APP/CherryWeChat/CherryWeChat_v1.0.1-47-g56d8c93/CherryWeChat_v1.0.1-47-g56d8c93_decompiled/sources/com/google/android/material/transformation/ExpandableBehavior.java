package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import p000.AbstractC0706Qb;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends AbstractC0706Qb {
    public ExpandableBehavior() {
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: b */
    public abstract void mo1454b(View view);

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: d */
    public final boolean mo1456d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!view.isLaidOut()) {
            ArrayList arrayListM2136j = coordinatorLayout.m2136j(view);
            int size = arrayListM2136j.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo1454b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
