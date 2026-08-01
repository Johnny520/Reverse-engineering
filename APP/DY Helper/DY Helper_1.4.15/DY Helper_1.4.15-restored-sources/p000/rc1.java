package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rc1 {

    /* JADX INFO: renamed from: α */
    public final int f9332;

    /* JADX INFO: renamed from: β */
    public final int f9333;

    public rc1(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f9332 = r1
            r0.f9333 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.rc1 m5078(p000.rc1 r1, int r2, int r3, int r4) {
            r0 = r4 & 1
            if (r0 == 0) goto L6
            int r2 = r1.f9332
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            int r3 = r1.f9333
        Lc:
            rc1 r1 = new rc1
            r1.<init>(r2, r3)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.rc1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            rc1 r5 = (p000.rc1) r5
            int r1 = r4.f9332
            int r3 = r5.f9332
            if (r1 == r3) goto L13
            return r2
        L13:
            int r4 = r4.f9333
            int r5 = r5.f9333
            if (r4 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f9332
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            int r1 = r1.f9333
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = ", plantCount="
            java.lang.String r1 = ")"
            java.lang.String r2 = "PetElfCampQuota(harvestCount="
            int r3 = r4.f9332
            int r4 = r4.f9333
            java.lang.String r4 = p000.AbstractC0602nx.m4128(r2, r3, r0, r4, r1)
            return r4
    }

    /* JADX INFO: renamed from: β */
    public final int m5079() {
            r0 = this;
            int r0 = r0.f9332
            return r0
    }
}
