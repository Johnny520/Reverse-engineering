package defpackage;

/* JADX INFO: renamed from: ᛲᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0305 extends defpackage.C1195 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.util.WeakHashMap f1625;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1729 f1626;

    public C0305(defpackage.C1729 r2) {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f1625 = r0
            r1.f1626 = r2
            return
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void mo973(android.view.View r2, int r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f1625
            java.lang.Object r0 = r0.get(r2)
            ᛶᲈᲈᛸ r0 = (defpackage.C1195) r0
            if (r0 == 0) goto Le
            r0.mo973(r2, r3)
            return
        Le:
            super.mo973(r2, r3)
            return
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final void mo974(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f1625
            java.lang.Object r0 = r0.get(r2)
            ᛶᲈᲈᛸ r0 = (defpackage.C1195) r0
            if (r0 == 0) goto Le
            r0.mo974(r2, r3)
            return
        Le:
            super.mo974(r2, r3)
            return
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void mo975(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f1625
            java.lang.Object r0 = r0.get(r2)
            ᛶᲈᲈᛸ r0 = (defpackage.C1195) r0
            if (r0 == 0) goto Le
            r0.mo975(r2, r3)
            return
        Le:
            super.mo975(r2, r3)
            return
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void mo976(android.view.View r5, defpackage.C2060 r6) {
            r4 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.f8857
            ᲀᛸᲈᛶ r1 = r4.f1626
            ᛱᛳᛶᛱ r2 = r1.f7650
            ᛱᛳᛶᛱ r1 = r1.f7650
            boolean r2 = r2.m445()
            android.view.View$AccessibilityDelegate r3 = r4.f5396
            if (r2 != 0) goto L2f
            ᛷᛵᛱᲀ r2 = r1.getLayoutManager()
            if (r2 == 0) goto L2f
            ᛷᛵᛱᲀ r1 = r1.getLayoutManager()
            r1.m2381(r5, r6)
            java.util.WeakHashMap r4 = r4.f1625
            java.lang.Object r4 = r4.get(r5)
            ᛶᲈᲈᛸ r4 = (defpackage.C1195) r4
            if (r4 == 0) goto L2b
            r4.mo976(r5, r6)
            return
        L2b:
            r3.onInitializeAccessibilityNodeInfo(r5, r0)
            return
        L2f:
            r3.onInitializeAccessibilityNodeInfo(r5, r0)
            return
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void mo977(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f1625
            java.lang.Object r0 = r0.get(r2)
            ᛶᲈᲈᛸ r0 = (defpackage.C1195) r0
            if (r0 == 0) goto Le
            r0.mo977(r2, r3)
            return
        Le:
            super.mo977(r2, r3)
            return
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final boolean mo978(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f1625
            java.lang.Object r0 = r0.get(r2)
            ᛶᲈᲈᛸ r0 = (defpackage.C1195) r0
            if (r0 == 0) goto Lf
            boolean r1 = r0.mo978(r2, r3)
            return r1
        Lf:
            android.view.View$AccessibilityDelegate r1 = r1.f5396
            boolean r1 = r1.dispatchPopulateAccessibilityEvent(r2, r3)
            return r1
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1606 mo979(android.view.View r2) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f1625
            java.lang.Object r0 = r0.get(r2)
            ᛶᲈᲈᛸ r0 = (defpackage.C1195) r0
            if (r0 == 0) goto Lf
            ᛸᲈᛸᲈ r1 = r0.mo979(r2)
            return r1
        Lf:
            ᛸᲈᛸᲈ r1 = super.mo979(r2)
            return r1
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean mo980(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            r1 = this;
            java.util.WeakHashMap r0 = r1.f1625
            java.lang.Object r0 = r0.get(r2)
            ᛶᲈᲈᛸ r0 = (defpackage.C1195) r0
            if (r0 == 0) goto Lf
            boolean r1 = r0.mo980(r2, r3, r4)
            return r1
        Lf:
            android.view.View$AccessibilityDelegate r1 = r1.f5396
            boolean r1 = r1.onRequestSendAccessibilityEvent(r2, r3, r4)
            return r1
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final boolean mo981(android.view.View r3, int r4, android.os.Bundle r5) {
            r2 = this;
            ᲀᛸᲈᛶ r0 = r2.f1626
            ᛱᛳᛶᛱ r1 = r0.f7650
            ᛱᛳᛶᛱ r0 = r0.f7650
            boolean r1 = r1.m445()
            if (r1 != 0) goto L35
            ᛷᛵᛱᲀ r1 = r0.getLayoutManager()
            if (r1 == 0) goto L35
            java.util.WeakHashMap r1 = r2.f1625
            java.lang.Object r1 = r1.get(r3)
            ᛶᲈᲈᛸ r1 = (defpackage.C1195) r1
            if (r1 == 0) goto L23
            boolean r2 = r1.mo981(r3, r4, r5)
            if (r2 == 0) goto L2b
            goto L29
        L23:
            boolean r2 = super.mo981(r3, r4, r5)
            if (r2 == 0) goto L2b
        L29:
            r2 = 1
            return r2
        L2b:
            ᛷᛵᛱᲀ r2 = r0.getLayoutManager()
            ᛱᛳᛶᛱ r2 = r2.f5691
            ᲀᛲᲁᛳ r2 = r2.f637
            r2 = 0
            return r2
        L35:
            boolean r2 = super.mo981(r3, r4, r5)
            return r2
    }
}
