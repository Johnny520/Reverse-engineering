package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c00 extends defpackage.x {
    public final defpackage.d00 d;
    public final java.util.WeakHashMap e;

    public c00(defpackage.d00 r2) {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.e = r0
            r1.d = r2
            return
    }

    @Override // defpackage.x
    public final boolean a(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.e
            java.lang.Object r0 = r0.get(r2)
            x r0 = (defpackage.x) r0
            if (r0 == 0) goto Lf
            boolean r2 = r0.a(r2, r3)
            return r2
        Lf:
            android.view.View$AccessibilityDelegate r0 = r1.a
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2, r3)
            return r2
    }

    @Override // defpackage.x
    public final defpackage.l0 b(android.view.View r2) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.e
            java.lang.Object r0 = r0.get(r2)
            x r0 = (defpackage.x) r0
            if (r0 == 0) goto Lf
            l0 r2 = r0.b(r2)
            return r2
        Lf:
            l0 r2 = super.b(r2)
            return r2
    }

    @Override // defpackage.x
    public final void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.e
            java.lang.Object r0 = r0.get(r2)
            x r0 = (defpackage.x) r0
            if (r0 == 0) goto Le
            r0.c(r2, r3)
            return
        Le:
            super.c(r2, r3)
            return
    }

    @Override // defpackage.x
    public final void d(android.view.View r5, defpackage.j0 r6) {
            r4 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.a
            d00 r1 = r4.d
            androidx.recyclerview.widget.RecyclerView r2 = r1.d
            androidx.recyclerview.widget.RecyclerView r1 = r1.d
            boolean r2 = r2.K()
            android.view.View$AccessibilityDelegate r3 = r4.a
            if (r2 != 0) goto L2f
            nz r2 = r1.getLayoutManager()
            if (r2 == 0) goto L2f
            nz r1 = r1.getLayoutManager()
            r1.T(r5, r6)
            java.util.WeakHashMap r1 = r4.e
            java.lang.Object r1 = r1.get(r5)
            x r1 = (defpackage.x) r1
            if (r1 == 0) goto L2b
            r1.d(r5, r6)
            return
        L2b:
            r3.onInitializeAccessibilityNodeInfo(r5, r0)
            return
        L2f:
            r3.onInitializeAccessibilityNodeInfo(r5, r0)
            return
    }

    @Override // defpackage.x
    public final void e(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.e
            java.lang.Object r0 = r0.get(r2)
            x r0 = (defpackage.x) r0
            if (r0 == 0) goto Le
            r0.e(r2, r3)
            return
        Le:
            super.e(r2, r3)
            return
    }

    @Override // defpackage.x
    public final boolean f(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.e
            java.lang.Object r0 = r0.get(r2)
            x r0 = (defpackage.x) r0
            if (r0 == 0) goto Lf
            boolean r2 = r0.f(r2, r3, r4)
            return r2
        Lf:
            android.view.View$AccessibilityDelegate r0 = r1.a
            boolean r2 = r0.onRequestSendAccessibilityEvent(r2, r3, r4)
            return r2
    }

    @Override // defpackage.x
    public final boolean g(android.view.View r3, int r4, android.os.Bundle r5) {
            r2 = this;
            d00 r0 = r2.d
            androidx.recyclerview.widget.RecyclerView r1 = r0.d
            androidx.recyclerview.widget.RecyclerView r0 = r0.d
            boolean r1 = r1.K()
            if (r1 != 0) goto L35
            nz r1 = r0.getLayoutManager()
            if (r1 == 0) goto L35
            java.util.WeakHashMap r1 = r2.e
            java.lang.Object r1 = r1.get(r3)
            x r1 = (defpackage.x) r1
            if (r1 == 0) goto L23
            boolean r3 = r1.g(r3, r4, r5)
            if (r3 == 0) goto L2b
            goto L29
        L23:
            boolean r3 = super.g(r3, r4, r5)
            if (r3 == 0) goto L2b
        L29:
            r3 = 1
            return r3
        L2b:
            nz r3 = r0.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r3 = r3.b
            tz r3 = r3.b
            r3 = 0
            return r3
        L35:
            boolean r3 = super.g(r3, r4, r5)
            return r3
    }

    @Override // defpackage.x
    public final void h(android.view.View r2, int r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.e
            java.lang.Object r0 = r0.get(r2)
            x r0 = (defpackage.x) r0
            if (r0 == 0) goto Le
            r0.h(r2, r3)
            return
        Le:
            super.h(r2, r3)
            return
    }

    @Override // defpackage.x
    public final void i(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.e
            java.lang.Object r0 = r0.get(r2)
            x r0 = (defpackage.x) r0
            if (r0 == 0) goto Le
            r0.i(r2, r3)
            return
        Le:
            super.i(r2, r3)
            return
    }
}
