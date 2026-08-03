package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p006D.AbstractC0080Q;
import p034S.AbstractC0324d;
import p078r.AbstractC1058a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends AbstractC1058a {
    public ExpandableBehavior() {
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: b */
    public abstract void mo1826b(View r1);

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: d */
    public final boolean mo1827d(CoordinatorLayout r1, View r2, View r3) {
        AbstractC0324d.m726i(r3);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public final boolean mo1816g(CoordinatorLayout r4, View r5, int r6) {
        Field r62 = AbstractC0080Q.f219a;
        if (r5.isLaidOut() == true) goto L7;
        ArrayList r42 = r4.m1170j(r5);
        int r63 = r42.size();
        int r1 = 0;
    L5:
        if (r1 >= r63) goto L7;
        View r2 = (View) r42.get(r1);
        mo1826b(r5);
        r1 = r1 + 1;
    L7:
        return false;
    }

    public ExpandableBehavior(Context r1, AttributeSet r2) {
    }
}
