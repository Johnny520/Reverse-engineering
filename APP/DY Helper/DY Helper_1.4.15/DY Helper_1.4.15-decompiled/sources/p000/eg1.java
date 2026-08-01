package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class eg1 {

    /* JADX INFO: renamed from: α */
    public final boolean f3545;

    /* JADX INFO: renamed from: β */
    public final int f3546;

    /* JADX INFO: renamed from: γ */
    public final int f3547;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f3548;

    /* JADX INFO: renamed from: ε */
    public final p000.bg1 f3549;

    public eg1(boolean r1, int r2, int r3, java.lang.String r4, p000.bg1 r5) {
            r0 = this;
            r0.<init>()
            r0.f3545 = r1
            r0.f3546 = r2
            r0.f3547 = r3
            r0.f3548 = r4
            r0.f3549 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L32
        L3:
            boolean r0 = r3 instanceof p000.eg1
            if (r0 != 0) goto L8
            goto L30
        L8:
            eg1 r3 = (p000.eg1) r3
            boolean r0 = r2.f3545
            boolean r1 = r3.f3545
            if (r0 == r1) goto L11
            goto L30
        L11:
            int r0 = r2.f3546
            int r1 = r3.f3546
            if (r0 == r1) goto L18
            goto L30
        L18:
            int r0 = r2.f3547
            int r1 = r3.f3547
            if (r0 == r1) goto L1f
            goto L30
        L1f:
            java.lang.String r0 = r2.f3548
            java.lang.String r1 = r3.f3548
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2a
            goto L30
        L2a:
            bg1 r2 = r2.f3549
            bg1 r3 = r3.f3549
            if (r2 == r3) goto L32
        L30:
            r2 = 0
            return r2
        L32:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f3545
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f3546
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f3547
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r3.f3548
            int r0 = p000.a12.m15(r0, r1, r2)
            bg1 r3 = r3.f3549
            if (r3 != 0) goto L21
            r3 = 0
            goto L25
        L21:
            int r3 = r3.hashCode()
        L25:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ImageSendResult(isSuccessful="
            r0.<init>(r1)
            boolean r1 = r5.f3545
            r0.append(r1)
            java.lang.String r1 = ", bridgeCode="
            r0.append(r1)
            int r1 = r5.f3546
            r0.append(r1)
            java.lang.String r1 = ", imageCode="
            r0.append(r1)
            java.lang.String r1 = ", message="
            java.lang.String r2 = ", failureKind="
            int r3 = r5.f3547
            java.lang.String r4 = r5.f3548
            p000.lz1.m3671(r0, r3, r1, r4, r2)
            bg1 r5 = r5.f3549
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
