package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cg1 {

    /* JADX INFO: renamed from: α */
    public final boolean f2107;

    /* JADX INFO: renamed from: β */
    public final boolean f2108;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f2109;

    public cg1(java.lang.String r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f2107 = r2
            r0.f2108 = r3
            r0.f2109 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof p000.cg1
            if (r0 != 0) goto L8
            goto L22
        L8:
            cg1 r3 = (p000.cg1) r3
            boolean r0 = r2.f2107
            boolean r1 = r3.f2107
            if (r0 == r1) goto L11
            goto L22
        L11:
            boolean r0 = r2.f2108
            boolean r1 = r3.f2108
            if (r0 == r1) goto L18
            goto L22
        L18:
            java.lang.String r2 = r2.f2109
            java.lang.String r3 = r3.f2109
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f2107
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f2108
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r3 = r3.f2109
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HostReadiness(isReady="
            r0.<init>(r1)
            boolean r1 = r2.f2107
            r0.append(r1)
            java.lang.String r1 = ", isRetryable="
            r0.append(r1)
            boolean r1 = r2.f2108
            r0.append(r1)
            java.lang.String r1 = ", detail="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.f2109
            java.lang.String r2 = p000.lz1.m3691(r0, r2, r1)
            return r2
    }
}
