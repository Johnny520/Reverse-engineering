package p000;

/* JADX INFO: renamed from: jv */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0446jv {

    /* JADX INFO: renamed from: α */
    public final long f5589;

    public /* synthetic */ C0446jv(long r1) {
            r0 = this;
            r0.<init>()
            r0.f5589 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.C0446jv
            if (r0 != 0) goto L5
            goto Lf
        L5:
            jv r3 = (p000.C0446jv) r3
            long r0 = r3.f5589
            long r2 = r2.f5589
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f5589
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r2 = r4.f5589
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L43
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "("
            r4.<init>(r0)
            r0 = 32
            long r0 = r2 >> r0
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = p000.C0408iv.m2807(r0)
            r4.append(r0)
            java.lang.String r0 = ", "
            r4.append(r0)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = p000.C0408iv.m2807(r0)
            r4.append(r0)
            r0 = 41
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L43:
            java.lang.String r4 = "DpOffset.Unspecified"
            return r4
    }
}
