package defpackage;

/* JADX INFO: renamed from: ᲀᛸᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1729 extends defpackage.C1195 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0305 f7649;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0055 f7650;

    public C1729(defpackage.C0055 r1) {
            r0 = this;
            r0.<init>()
            r0.f7650 = r1
            ᛲᛶᛴ r1 = r0.f7649
            if (r1 == 0) goto Lc
            r0.f7649 = r1
            return
        Lc:
            ᛲᛶᛴ r1 = new ᛲᛶᛴ
            r1.<init>(r0)
            r0.f7649 = r1
            return
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo976(android.view.View r3, defpackage.C2060 r4) {
            r2 = this;
            android.view.View$AccessibilityDelegate r0 = r2.f5396
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.f8857
            r0.onInitializeAccessibilityNodeInfo(r3, r1)
            ᛱᛳᛶᛱ r2 = r2.f7650
            boolean r3 = r2.m445()
            if (r3 != 0) goto L22
            ᛷᛵᛱᲀ r3 = r2.getLayoutManager()
            if (r3 == 0) goto L22
            ᛷᛵᛱᲀ r2 = r2.getLayoutManager()
            ᛱᛳᛶᛱ r3 = r2.f5691
            ᲀᛲᲁᛳ r0 = r3.f637
            ᛵᲈᲁᲀ r3 = r3.f623
            r2.mo123(r0, r3, r4)
        L22:
            return
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo977(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            super.mo977(r2, r3)
            boolean r0 = r2 instanceof defpackage.C0055
            if (r0 == 0) goto L1e
            ᛱᛳᛶᛱ r1 = r1.f7650
            boolean r1 = r1.m445()
            if (r1 != 0) goto L1e
            ᛱᛳᛶᛱ r2 = (defpackage.C0055) r2
            ᛷᛵᛱᲀ r1 = r2.getLayoutManager()
            if (r1 == 0) goto L1e
            ᛷᛵᛱᲀ r1 = r2.getLayoutManager()
            r1.mo185(r3)
        L1e:
            return
    }

    @Override // defpackage.C1195
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final boolean mo981(android.view.View r1, int r2, android.os.Bundle r3) {
            r0 = this;
            boolean r1 = super.mo981(r1, r2, r3)
            if (r1 == 0) goto L8
            r0 = 1
            return r0
        L8:
            ᛱᛳᛶᛱ r0 = r0.f7650
            boolean r1 = r0.m445()
            if (r1 != 0) goto L1f
            ᛷᛵᛱᲀ r1 = r0.getLayoutManager()
            if (r1 == 0) goto L1f
            ᛷᛵᛱᲀ r0 = r0.getLayoutManager()
            boolean r0 = r0.mo131(r2, r3)
            return r0
        L1f:
            r0 = 0
            return r0
    }
}
