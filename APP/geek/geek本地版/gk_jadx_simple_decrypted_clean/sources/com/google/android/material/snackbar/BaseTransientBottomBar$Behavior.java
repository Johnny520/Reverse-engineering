package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.h7;
import defpackage.i0;
import defpackage.vh;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final vh h;

    public BaseTransientBottomBar$Behavior() {
        vh r0 = new vh(14);
        this.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.h = r0;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.wd
    public final boolean f(CoordinatorLayout r3, View r4, MotionEvent r5) {
        this.h.getClass();
        int r0 = r5.getActionMasked();
        if (r0 == 0) goto L20;
        if (r0 == 1) goto L10;
        if (r0 == 3) goto L10;
    L32:
        return super.f(r3, r4, r5);
    L10:
        if (i0.b != null) goto L12;
        i0.b = new i0();
    L12:
        Object r02 = i0.b.a;
        monitor-enter(r02);
        monitor-exit(r02);     // Catch: Throwable -> L16
    L16:
        th = move-exception;
        throw th;
    L20:
        if (r3.o(r4, (int) r5.getX(), (int) r5.getY()) == false) goto L32;
        if (i0.b != null) goto L24;
        i0.b = new i0();
    L24:
        Object r03 = i0.b.a;
        monitor-enter(r03);
        monitor-exit(r03);     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        throw th;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View r2) {
        this.h.getClass();
        return r2 instanceof h7;
    }
}
