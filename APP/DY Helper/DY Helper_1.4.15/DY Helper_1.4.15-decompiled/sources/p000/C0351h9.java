package p000;

/* JADX INFO: renamed from: h9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0351h9 {

    /* JADX INFO: renamed from: α */
    public final boolean f4628;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f4629;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f4630;

    public C0351h9(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f4628 = r3
            r0.f4629 = r1
            r0.f4630 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.C0351h9
            if (r0 != 0) goto L8
            goto L26
        L8:
            h9 r3 = (p000.C0351h9) r3
            boolean r0 = r2.f4628
            boolean r1 = r3.f4628
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.lang.String r0 = r2.f4629
            java.lang.String r1 = r3.f4629
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.lang.String r2 = r2.f4630
            java.lang.String r3 = r3.f4630
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f4628
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4629
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r3 = r3.f4630
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ApplyCodeResult(success="
            r0.<init>(r1)
            boolean r1 = r2.f4628
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            java.lang.String r1 = r2.f4629
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.f4630
            java.lang.String r2 = p000.lz1.m3691(r0, r2, r1)
            return r2
    }
}
