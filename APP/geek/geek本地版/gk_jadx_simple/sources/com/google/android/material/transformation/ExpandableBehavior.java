package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ja0;
import defpackage.v90;
import defpackage.wd;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends wd {
    public ExpandableBehavior() {
    }

    @Override // defpackage.wd
    public abstract void b(View r1);

    @Override // defpackage.wd
    public final boolean d(CoordinatorLayout r1, View r2, View r3) {
        r3.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.wd
    public final boolean g(CoordinatorLayout r4, View r5, int r6) {
        WeakHashMap r62 = ja0.a;
        if (v90.c(r5) == true) goto L7;
        ArrayList r42 = r4.j(r5);
        int r63 = r42.size();
        int r1 = 0;
    L5:
        if (r1 >= r63) goto L7;
        View r2 = (View) r42.get(r1);
        b(r5);
        r1 = r1 + 1;
    L7:
        return false;
    }

    public ExpandableBehavior(Context r1, AttributeSet r2) {
    }
}
