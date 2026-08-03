package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000.AbstractC0049B5;
import p000.C0774S0;
import p000.C1456gf;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: h */
    public final C1456gf f4584h;

    public BaseTransientBottomBar$Behavior() {
        C1456gf r0 = new C1456gf(23);
        this.f4406e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f4407f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f4405d = 0;
        this.f4584h = r0;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p000.AbstractC0706Qb
    /* JADX INFO: renamed from: f */
    public final boolean mo1458f(CoordinatorLayout r3, View r4, MotionEvent r5) {
        this.f4584h.getClass();
        int r0 = r5.getActionMasked();
        if (r0 == 0) goto L20;
        if (r0 == 1) goto L10;
        if (r0 == 3) goto L10;
    L32:
        return super.mo1458f(r3, r4, r5);
    L10:
        if (C0774S0.f2447b != null) goto L12;
        C0774S0.f2447b = new C0774S0();
    L12:
        Object r02 = C0774S0.f2447b.f2448a;
        monitor-enter(r02);
        monitor-exit(r02);     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    L20:
        if (r3.m2138n(r4, (int) r5.getX(), (int) r5.getY()) == false) goto L32;
        if (C0774S0.f2447b != null) goto L24;
        C0774S0.f2447b = new C0774S0();
    L24:
        Object r03 = C0774S0.f2447b.f2448a;
        monitor-enter(r03);
        monitor-exit(r03);     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        throw th;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: r */
    public final boolean mo2426r(View r2) {
        this.f4584h.getClass();
        return r2 instanceof AbstractC0049B5;
    }
}
