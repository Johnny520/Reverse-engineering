package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class ExpandableBehavior extends defpackage.wd {
    public ExpandableBehavior() {
            r0 = this;
            r0.<init>()
            return
    }

    public ExpandableBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.wd
    public abstract void b(android.view.View r1);

    @Override // defpackage.wd
    public final boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
            r0 = this;
            r3.getClass()
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
    }

    @Override // defpackage.wd
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, int r6) {
            r3 = this;
            java.util.WeakHashMap r6 = defpackage.ja0.a
            boolean r6 = defpackage.v90.c(r5)
            r0 = 0
            if (r6 != 0) goto L20
            java.util.ArrayList r4 = r4.j(r5)
            int r6 = r4.size()
            r1 = r0
        L12:
            if (r1 >= r6) goto L20
            java.lang.Object r2 = r4.get(r1)
            android.view.View r2 = (android.view.View) r2
            r3.b(r5)
            int r1 = r1 + 1
            goto L12
        L20:
            return r0
    }
}
