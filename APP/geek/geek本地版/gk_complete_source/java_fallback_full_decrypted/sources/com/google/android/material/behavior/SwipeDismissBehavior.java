package com.google.android.material.behavior;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends android.view.View> extends defpackage.wd {
    public defpackage.ma0 a;
    public boolean b;
    public boolean c;
    public int d;
    public float e;
    public float f;
    public final defpackage.n50 g;

    public SwipeDismissBehavior() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.d = r0
            r0 = 0
            r1.e = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.f = r0
            n50 r0 = new n50
            r0.<init>(r1)
            r1.g = r0
            return
    }

    @Override // defpackage.wd
    public boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.MotionEvent r7) {
            r4 = this;
            boolean r0 = r4.b
            int r1 = r7.getActionMasked()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L13
            if (r1 == r2) goto L10
            r6 = 3
            if (r1 == r6) goto L10
            goto L23
        L10:
            r4.b = r3
            goto L23
        L13:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r0 = r5.o(r6, r0, r1)
            r4.b = r0
        L23:
            if (r0 == 0) goto L43
            ma0 r6 = r4.a
            if (r6 != 0) goto L36
            ma0 r6 = new ma0
            android.content.Context r0 = r5.getContext()
            n50 r1 = r4.g
            r6.<init>(r0, r5, r1)
            r4.a = r6
        L36:
            boolean r5 = r4.c
            if (r5 != 0) goto L43
            ma0 r5 = r4.a
            boolean r5 = r5.p(r7)
            if (r5 == 0) goto L43
            return r2
        L43:
            return r3
    }

    @Override // defpackage.wd
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, int r5) {
            r2 = this;
            java.util.WeakHashMap r3 = defpackage.ja0.a
            int r3 = defpackage.s90.c(r4)
            r5 = 0
            if (r3 != 0) goto L27
            r3 = 1
            defpackage.s90.s(r4, r3)
            r3 = 1048576(0x100000, float:1.469368E-39)
            defpackage.ja0.i(r4, r3)
            defpackage.ja0.g(r4, r5)
            boolean r3 = r2.r(r4)
            if (r3 == 0) goto L27
            h0 r3 = defpackage.h0.j
            l0 r0 = new l0
            r1 = 26
            r0.<init>(r1, r2)
            defpackage.ja0.j(r4, r3, r0)
        L27:
            return r5
    }

    @Override // defpackage.wd
    public final boolean q(android.view.View r2, android.view.MotionEvent r3) {
            r1 = this;
            ma0 r2 = r1.a
            if (r2 == 0) goto L16
            boolean r2 = r1.c
            if (r2 == 0) goto Lf
            int r2 = r3.getActionMasked()
            r0 = 3
            if (r2 == r0) goto L14
        Lf:
            ma0 r2 = r1.a
            r2.j(r3)
        L14:
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public boolean r(android.view.View r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
