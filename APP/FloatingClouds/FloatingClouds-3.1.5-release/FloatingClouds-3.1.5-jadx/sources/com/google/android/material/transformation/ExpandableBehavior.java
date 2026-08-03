package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.C0181Jg;
import p000a.C0866ug;
import p000a.InterfaceC0590g6;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC1059c<View> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExpandableBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: b */
    public abstract boolean mo2455b(View view, View view2);

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: d */
    public final boolean mo2457d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ((InterfaceC0590g6) view2).mo1425a();
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC1059c
    /* JADX INFO: renamed from: h */
    public final boolean mo371h(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC0590g6 interfaceC0590g6;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        if (!view.isLaidOut()) {
            ArrayList arrayListM2443e = coordinatorLayout.m2443e(view);
            int size = arrayListM2443e.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    interfaceC0590g6 = null;
                    break;
                }
                View view2 = (View) arrayListM2443e.get(i2);
                if (mo2455b(view, view2)) {
                    interfaceC0590g6 = (InterfaceC0590g6) view2;
                    break;
                }
                i2++;
            }
            if (interfaceC0590g6 != null) {
                interfaceC0590g6.mo1425a();
                throw null;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
