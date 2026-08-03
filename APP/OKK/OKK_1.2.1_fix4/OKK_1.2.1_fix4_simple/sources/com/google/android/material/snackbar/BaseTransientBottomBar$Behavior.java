package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p008E.C0158l;
import p072n0.C1008c;
import p092z0.AbstractC1145c;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: i */
    public final C1008c f2431i;

    public BaseTransientBottomBar$Behavior() {
        C1008c r02 = new C1008c();
        this.f2278f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f2279g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f2276d = 0;
        this.f2431i = r02;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p078r.AbstractC1058a
    /* JADX INFO: renamed from: f */
    public final boolean mo1815f(CoordinatorLayout r3, View r4, MotionEvent r5) {
        this.f2431i.getClass();
        int r02 = r5.getActionMasked();
        if (r02 == 0) goto L20;
        if (r02 == 1) goto L10;
        if (r02 == 3) goto L10;
    L32:
        return super.mo1815f(r3, r4, r5);
    L10:
        if (C0158l.f361b != null) goto L12;
        C0158l.f361b = new C0158l(1);
    L12:
        Object r03 = C0158l.f361b.f362a;
        monitor-enter(r03);
        monitor-exit(r03);     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    L20:
        if (r3.m1172n(r4, (int) r5.getX(), (int) r5.getY()) == false) goto L32;
        if (C0158l.f361b != null) goto L24;
        C0158l.f361b = new C0158l(1);
    L24:
        Object r04 = C0158l.f361b.f362a;
        monitor-enter(r04);
        monitor-exit(r04);     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        throw th;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: r */
    public final boolean mo1831r(View r2) {
        this.f2431i.getClass();
        return r2 instanceof AbstractC1145c;
    }
}
