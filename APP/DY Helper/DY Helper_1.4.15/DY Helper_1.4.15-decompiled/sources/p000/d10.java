package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class d10 {

    /* JADX INFO: renamed from: α */
    public final long f2838;

    /* JADX INFO: renamed from: β */
    public final long f2839;

    /* JADX INFO: renamed from: γ */
    public final int f2840;

    /* JADX INFO: renamed from: δ */
    public final int f2841;

    public d10(int r1, int r2, long r3, long r5) {
            r0 = this;
            r0.<init>()
            r0.f2838 = r3
            r0.f2839 = r5
            r0.f2840 = r1
            r0.f2841 = r2
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.d10
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            d10 r8 = (p000.d10) r8
            long r3 = r7.f2838
            long r5 = r8.f2838
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.f2839
            long r5 = r8.f2839
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1e
            return r2
        L1e:
            int r1 = r7.f2840
            int r3 = r8.f2840
            if (r1 == r3) goto L25
            return r2
        L25:
            int r7 = r7.f2841
            int r8 = r8.f2841
            if (r7 == r8) goto L2c
            return r2
        L2c:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f2838
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f2839
            int r0 = p000.lz1.m3677(r0, r1, r2)
            int r2 = r4.f2840
            int r0 = p000.a12.m14(r2, r0, r1)
            int r4 = r4.f2841
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HostDoubleTapEventKey(downTime="
            r0.<init>(r1)
            long r1 = r3.f2838
            r0.append(r1)
            java.lang.String r1 = ", eventTime="
            r0.append(r1)
            long r1 = r3.f2839
            r0.append(r1)
            java.lang.String r1 = ", rawXBits="
            r0.append(r1)
            int r1 = r3.f2840
            r0.append(r1)
            java.lang.String r1 = ", rawYBits="
            r0.append(r1)
            int r3 = r3.f2841
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
