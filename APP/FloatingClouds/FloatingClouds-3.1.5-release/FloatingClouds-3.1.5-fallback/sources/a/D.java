package a;

/* JADX INFO: loaded from: classes.dex */
public final class D implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.E5 f51a;

    public D(a.E5 r1) {
            r0 = this;
            r0.<init>()
            r0.f51a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof a.D
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            a.D r2 = (a.D) r2
            a.E5 r0 = r1.f51a
            a.E5 r2 = r2.f51a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            a.E5 r0 = r1.f51a
            int r0 = r0.hashCode()
            return r0
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean r3) {
            r2 = this;
            a.E5 r0 = r2.f51a
            java.lang.Object r0 = r0.f69a
            a.F5 r0 = (a.F5) r0
            android.widget.AutoCompleteTextView r1 = r0.h
            if (r1 == 0) goto L1c
            boolean r1 = a.C0435w1.G(r1)
            if (r1 != 0) goto L1c
            if (r3 == 0) goto L14
            r3 = 2
            goto L15
        L14:
            r3 = 1
        L15:
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            r0.setImportantForAccessibility(r3)
        L1c:
            return
    }
}
