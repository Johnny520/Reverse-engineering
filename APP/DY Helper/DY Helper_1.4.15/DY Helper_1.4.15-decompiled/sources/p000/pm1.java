package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pm1 extends androidx.core.view.C0045 {

    /* JADX INFO: renamed from: θ */
    public final androidx.recyclerview.widget.RecyclerView f8594;

    /* JADX INFO: renamed from: ι */
    public final p000.om1 f8595;

    public pm1(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.<init>()
            r0.f8594 = r1
            om1 r1 = r0.f8595
            if (r1 == 0) goto Lc
            r0.f8595 = r1
            return
        Lc:
            om1 r1 = new om1
            r1.<init>(r0)
            r0.f8595 = r1
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: γ */
    public final void mo422(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            super.mo422(r2, r3)
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L1c
            boolean r1 = r1.m4551()
            if (r1 != 0) goto L1c
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            zl1 r1 = r2.getLayoutManager()
            if (r1 == 0) goto L1c
            zl1 r1 = r2.getLayoutManager()
            r1.mo486(r3)
        L1c:
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: δ */
    public final void mo423(android.view.View r3, p000.C1128 r4) {
            r2 = this;
            android.view.View$AccessibilityDelegate r0 = r2.f1026
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.f13478
            r0.onInitializeAccessibilityNodeInfo(r3, r1)
            boolean r3 = r2.m4551()
            if (r3 != 0) goto L22
            androidx.recyclerview.widget.RecyclerView r2 = r2.f8594
            zl1 r3 = r2.getLayoutManager()
            if (r3 == 0) goto L22
            zl1 r2 = r2.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r3 = r2.f13153
            fm1 r0 = r3.f1151
            km1 r3 = r3.f1174
            r2.mo466(r0, r3, r4)
        L22:
            return
    }

    @Override // androidx.core.view.C0045
    /* JADX INFO: renamed from: η */
    public final boolean mo426(android.view.View r1, int r2, android.os.Bundle r3) {
            r0 = this;
            boolean r1 = super.mo426(r1, r2, r3)
            if (r1 == 0) goto L8
            r0 = 1
            return r0
        L8:
            boolean r1 = r0.m4551()
            if (r1 != 0) goto L1f
            androidx.recyclerview.widget.RecyclerView r0 = r0.f8594
            zl1 r1 = r0.getLayoutManager()
            if (r1 == 0) goto L1f
            zl1 r0 = r0.getLayoutManager()
            boolean r0 = r0.mo467(r2, r3)
            return r0
        L1f:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public final boolean m4551() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r1 = r1.f8594
            boolean r0 = r1.f1166
            if (r0 == 0) goto L19
            boolean r0 = r1.f1128
            if (r0 != 0) goto L19
            m6 r1 = r1.f1153
            java.lang.Object r1 = r1.f6968
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            if (r1 <= 0) goto L17
            goto L19
        L17:
            r1 = 0
            return r1
        L19:
            r1 = 1
            return r1
    }
}
