package com.google.android.material.transformation;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class ExpandableBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.c<android.view.View> {
    public ExpandableBehavior() {
            r0 = this;
            r0.<init>()
            return
    }

    public ExpandableBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean b(android.view.View r1, android.view.View r2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
            r0 = this;
            a.g6 r3 = (a.InterfaceC0154g6) r3
            r3.a()
            r1 = 0
            throw r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, int r8) {
            r5 = this;
            java.util.WeakHashMap<android.view.View, a.Jg> r8 = a.C0414ug.f721a
            boolean r8 = r7.isLaidOut()
            r0 = 0
            if (r8 != 0) goto L2f
            java.util.ArrayList r6 = r6.e(r7)
            int r8 = r6.size()
            r1 = r0
        L12:
            r2 = 0
            if (r1 >= r8) goto L27
            java.lang.Object r3 = r6.get(r1)
            android.view.View r3 = (android.view.View) r3
            boolean r4 = r5.b(r7, r3)
            if (r4 == 0) goto L24
            a.g6 r3 = (a.InterfaceC0154g6) r3
            goto L28
        L24:
            int r1 = r1 + 1
            goto L12
        L27:
            r3 = r2
        L28:
            if (r3 != 0) goto L2b
            goto L2f
        L2b:
            r3.a()
            throw r2
        L2f:
            return r0
    }
}
