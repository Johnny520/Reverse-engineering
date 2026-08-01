package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yd implements android.view.ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout a;

    public yd(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(android.view.View r2, android.view.View r3) {
            r1 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.a
            android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.q
            if (r0 == 0) goto L9
            r0.onChildViewAdded(r2, r3)
        L9:
            return
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(android.view.View r3, android.view.View r4) {
            r2 = this;
            r0 = 2
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r2.a
            r1.p(r0)
            android.view.ViewGroup$OnHierarchyChangeListener r0 = r1.q
            if (r0 == 0) goto Ld
            r0.onChildViewRemoved(r3, r4)
        Ld:
            return
    }
}
