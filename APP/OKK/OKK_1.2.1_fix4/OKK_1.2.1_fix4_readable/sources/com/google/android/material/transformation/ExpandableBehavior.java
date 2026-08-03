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
    public abstract void mo1826b(View view);

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: d */
    public final boolean mo1827d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0324d.m726i(view2);
        throw null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public final boolean mo1816g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        Field field = AbstractC0080Q.f219a;
        if (!view.isLaidOut()) {
            ArrayList arrayListM1170j = coordinatorLayout.m1170j(view);
            int size = arrayListM1170j.size();
            for (int i3 = 0; i3 < size; i3++) {
                mo1826b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
