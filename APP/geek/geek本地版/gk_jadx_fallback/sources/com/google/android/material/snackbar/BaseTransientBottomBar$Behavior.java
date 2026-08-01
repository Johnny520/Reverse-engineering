package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends com.google.android.material.behavior.SwipeDismissBehavior<android.view.View> {
    public final defpackage.vh h;

    public BaseTransientBottomBar$Behavior() {
            r4 = this;
            r4.<init>()
            vh r0 = new vh
            r1 = 14
            r0.<init>(r1)
            r1 = 0
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = java.lang.Math.max(r1, r2)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r3)
            r4.e = r2
            r2 = 1058642330(0x3f19999a, float:0.6)
            float r1 = java.lang.Math.max(r1, r2)
            float r1 = java.lang.Math.min(r1, r3)
            r4.f = r1
            r1 = 0
            r4.d = r1
            r4.h = r0
            return
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.wd
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
            r2 = this;
            vh r0 = r2.h
            r0.getClass()
            int r0 = r5.getActionMasked()
            if (r0 == 0) goto L27
            r1 = 1
            if (r0 == r1) goto L12
            r1 = 3
            if (r0 == r1) goto L12
            goto L4c
        L12:
            i0 r0 = defpackage.i0.b
            if (r0 != 0) goto L1d
            i0 r0 = new i0
            r0.<init>()
            defpackage.i0.b = r0
        L1d:
            i0 r0 = defpackage.i0.b
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            goto L4c
        L24:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r3
        L27:
            float r0 = r5.getX()
            int r0 = (int) r0
            float r1 = r5.getY()
            int r1 = (int) r1
            boolean r0 = r3.o(r4, r0, r1)
            if (r0 == 0) goto L4c
            i0 r0 = defpackage.i0.b
            if (r0 != 0) goto L42
            i0 r0 = new i0
            r0.<init>()
            defpackage.i0.b = r0
        L42:
            i0 r0 = defpackage.i0.b
            java.lang.Object r0 = r0.a
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r3
        L4c:
            boolean r3 = super.f(r3, r4, r5)
            return r3
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(android.view.View r2) {
            r1 = this;
            vh r0 = r1.h
            r0.getClass()
            boolean r2 = r2 instanceof defpackage.h7
            return r2
    }
}
