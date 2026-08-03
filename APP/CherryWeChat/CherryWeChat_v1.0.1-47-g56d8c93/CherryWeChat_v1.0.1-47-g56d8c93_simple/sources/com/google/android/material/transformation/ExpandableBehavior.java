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
    public abstract void mo1454b(View r1);

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: d */
    public final boolean mo1456d(CoordinatorLayout r1, View r2, View r3) {
        r3.getClass();
        throw new ClassCastException();
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout r4, View r5, int r6) {
        if (r5.isLaidOut() == true) goto L7;
        ArrayList r42 = r4.m2136j(r5);
        int r62 = r42.size();
        int r1 = 0;
    L5:
        if (r1 >= r62) goto L7;
        View r2 = (View) r42.get(r1);
        mo1454b(r5);
        r1 = r1 + 1;
    L7:
        return false;
    }

    public ExpandableBehavior(Context r1, AttributeSet r2) {
    }
}
