package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class me1 {

    /* JADX INFO: renamed from: α */
    public final int f7100;

    /* JADX INFO: renamed from: β */
    public final java.lang.Integer f7101;

    /* JADX INFO: renamed from: γ */
    public final int f7102;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f7103;

    /* JADX INFO: renamed from: ε */
    public final p000.ne1 f7104;

    public me1(int r1, java.lang.Integer r2, int r3, java.lang.String r4, p000.ne1 r5) {
            r0 = this;
            r0.<init>()
            r0.f7100 = r1
            r0.f7101 = r2
            r0.f7102 = r3
            r0.f7103 = r4
            r0.f7104 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.me1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me1 r5 = (p000.me1) r5
            int r1 = r4.f7100
            int r3 = r5.f7100
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Integer r1 = r4.f7101
            java.lang.Integer r3 = r5.f7101
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            int r1 = r4.f7102
            int r3 = r5.f7102
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.String r1 = r4.f7103
            java.lang.String r3 = r5.f7103
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            ne1 r4 = r4.f7104
            ne1 r5 = r5.f7104
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L3b
            return r2
        L3b:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f7100
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.Integer r3 = r4.f7101
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r3 = r4.f7102
            int r0 = p000.a12.m14(r3, r0, r1)
            java.lang.String r3 = r4.f7103
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            ne1 r4 = r4.f7104
            if (r4 != 0) goto L2d
            goto L31
        L2d:
            int r2 = r4.hashCode()
        L31:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ClaimResult(bridgeCode="
            r0.<init>(r1)
            int r1 = r5.f7100
            r0.append(r1)
            java.lang.String r1 = ", httpCode="
            r0.append(r1)
            java.lang.Integer r1 = r5.f7101
            r0.append(r1)
            java.lang.String r1 = ", statusCode="
            r0.append(r1)
            java.lang.String r1 = ", statusMessage="
            java.lang.String r2 = ", closeness="
            int r3 = r5.f7102
            java.lang.String r4 = r5.f7103
            p000.lz1.m3671(r0, r3, r1, r4, r2)
            ne1 r5 = r5.f7104
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
