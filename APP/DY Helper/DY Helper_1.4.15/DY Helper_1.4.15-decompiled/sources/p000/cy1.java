package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cy1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f2803;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f2804;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f2805;

    /* JADX INFO: renamed from: δ */
    public final long f2806;

    public cy1(java.lang.String r1, java.lang.String r2, java.lang.String r3, long r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f2803 = r1
            r0.f2804 = r2
            r0.f2805 = r3
            r0.f2806 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof p000.cy1
            if (r0 != 0) goto L8
            goto L33
        L8:
            cy1 r3 = (p000.cy1) r3
            java.lang.String r0 = r2.f2803
            java.lang.String r1 = r3.f2803
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L33
        L15:
            java.lang.String r0 = r2.f2804
            java.lang.String r1 = r3.f2804
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L33
        L20:
            java.lang.String r0 = r2.f2805
            java.lang.String r1 = r3.f2805
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L33
        L2b:
            long r0 = r2.f2806
            long r2 = r3.f2806
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L35
        L33:
            r2 = 0
            return r2
        L35:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f2803
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f2804
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f2805
            int r0 = p000.a12.m15(r0, r1, r2)
            long r1 = r3.f2806
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", today="
            java.lang.String r1 = ", message="
            java.lang.String r2 = "CachedApiMessage(source="
            java.lang.String r3 = r5.f2803
            java.lang.String r4 = r5.f2804
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f2805
            r0.append(r1)
            java.lang.String r1 = ", timeMs="
            r0.append(r1)
            long r1 = r5.f2806
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
