package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class om1 extends androidx.core.view.C0045 {

    /* JADX INFO: renamed from: θ */
    public final p000.pm1 f8157;

    /* JADX INFO: renamed from: ι */
    public final java.util.WeakHashMap f8158;

    public om1(p000.pm1 r2) {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f8158 = r0
            r1.f8157 = r2
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: α */
    public final boolean mo420(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f8158
            java.lang.Object r0 = r0.get(r2)
            androidx.core.view.α r0 = (androidx.core.view.C0045) r0
            if (r0 == 0) goto Lf
            boolean r1 = r0.mo420(r2, r3)
            return r1
        Lf:
            android.view.View$AccessibilityDelegate r1 = r1.f1026
            boolean r1 = r1.dispatchPopulateAccessibilityEvent(r2, r3)
            return r1
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: β */
    public final p000.C0568n mo421(android.view.View r2) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f8158
            java.lang.Object r0 = r0.get(r2)
            androidx.core.view.α r0 = (androidx.core.view.C0045) r0
            if (r0 == 0) goto Lf
            n r1 = r0.mo421(r2)
            return r1
        Lf:
            n r1 = super.mo421(r2)
            return r1
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: γ */
    public final void mo422(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f8158
            java.lang.Object r0 = r0.get(r2)
            androidx.core.view.α r0 = (androidx.core.view.C0045) r0
            if (r0 == 0) goto Le
            r0.mo422(r2, r3)
            return
        Le:
            super.mo422(r2, r3)
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: δ */
    public final void mo423(android.view.View r5, p000.C1128 r6) {
            r4 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.f13478
            pm1 r1 = r4.f8157
            boolean r2 = r1.m4551()
            androidx.recyclerview.widget.RecyclerView r1 = r1.f8594
            android.view.View$AccessibilityDelegate r3 = r4.f1026
            if (r2 != 0) goto L30
            zl1 r2 = r1.getLayoutManager()
            if (r2 == 0) goto L30
            zl1 r1 = r1.getLayoutManager()
            r1.getClass()
            androidx.recyclerview.widget.RecyclerView.m507(r5)
            java.util.WeakHashMap r4 = r4.f8158
            java.lang.Object r4 = r4.get(r5)
            androidx.core.view.α r4 = (androidx.core.view.C0045) r4
            if (r4 == 0) goto L2c
            r4.mo423(r5, r6)
            return
        L2c:
            r3.onInitializeAccessibilityNodeInfo(r5, r0)
            return
        L30:
            r3.onInitializeAccessibilityNodeInfo(r5, r0)
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: ε */
    public final void mo424(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f8158
            java.lang.Object r0 = r0.get(r2)
            androidx.core.view.α r0 = (androidx.core.view.C0045) r0
            if (r0 == 0) goto Le
            r0.mo424(r2, r3)
            return
        Le:
            super.mo424(r2, r3)
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: ζ */
    public final boolean mo425(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f8158
            java.lang.Object r0 = r0.get(r2)
            androidx.core.view.α r0 = (androidx.core.view.C0045) r0
            if (r0 == 0) goto Lf
            boolean r1 = r0.mo425(r2, r3, r4)
            return r1
        Lf:
            android.view.View$AccessibilityDelegate r1 = r1.f1026
            boolean r1 = r1.onRequestSendAccessibilityEvent(r2, r3, r4)
            return r1
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: η */
    public final boolean mo426(android.view.View r3, int r4, android.os.Bundle r5) {
            r2 = this;
            pm1 r0 = r2.f8157
            boolean r1 = r0.m4551()
            androidx.recyclerview.widget.RecyclerView r0 = r0.f8594
            if (r1 != 0) goto L33
            zl1 r1 = r0.getLayoutManager()
            if (r1 == 0) goto L33
            java.util.WeakHashMap r1 = r2.f8158
            java.lang.Object r1 = r1.get(r3)
            androidx.core.view.α r1 = (androidx.core.view.C0045) r1
            if (r1 == 0) goto L21
            boolean r2 = r1.mo426(r3, r4, r5)
            if (r2 == 0) goto L29
            goto L27
        L21:
            boolean r2 = super.mo426(r3, r4, r5)
            if (r2 == 0) goto L29
        L27:
            r2 = 1
            return r2
        L29:
            zl1 r2 = r0.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r2 = r2.f13153
            fm1 r2 = r2.f1151
            r2 = 0
            return r2
        L33:
            boolean r2 = super.mo426(r3, r4, r5)
            return r2
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: θ */
    public final void mo427(android.view.View r2, int r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f8158
            java.lang.Object r0 = r0.get(r2)
            androidx.core.view.α r0 = (androidx.core.view.C0045) r0
            if (r0 == 0) goto Le
            r0.mo427(r2, r3)
            return
        Le:
            super.mo427(r2, r3)
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: ι */
    public final void mo428(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f8158
            java.lang.Object r0 = r0.get(r2)
            androidx.core.view.α r0 = (androidx.core.view.C0045) r0
            if (r0 == 0) goto Le
            r0.mo428(r2, r3)
            return
        Le:
            super.mo428(r2, r3)
            return
    }
}
