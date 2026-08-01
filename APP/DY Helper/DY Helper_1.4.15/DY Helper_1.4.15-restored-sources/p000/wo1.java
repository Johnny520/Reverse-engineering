package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wo1 {

    /* JADX INFO: renamed from: α */
    public final float f11788;

    /* JADX INFO: renamed from: β */
    public final float f11789;

    /* JADX INFO: renamed from: γ */
    public final float f11790;

    /* JADX INFO: renamed from: δ */
    public final float f11791;

    /* JADX INFO: renamed from: ε */
    public final long f11792;

    /* JADX INFO: renamed from: ζ */
    public final long f11793;

    /* JADX INFO: renamed from: η */
    public final long f11794;

    /* JADX INFO: renamed from: θ */
    public final long f11795;

    static {
            r3 = 0
            r4 = 0
            r0 = 0
            r1 = 0
            r2 = 0
            p000.u81.m5802(r0, r1, r2, r3, r4)
            return
    }

    public wo1(float r1, float r2, float r3, float r4, long r5, long r7, long r9, long r11) {
            r0 = this;
            r0.<init>()
            r0.f11788 = r1
            r0.f11789 = r2
            r0.f11790 = r3
            r0.f11791 = r4
            r0.f11792 = r5
            r0.f11793 = r7
            r0.f11794 = r9
            r0.f11795 = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L63
        L3:
            boolean r0 = r5 instanceof p000.wo1
            if (r0 != 0) goto L8
            goto L61
        L8:
            wo1 r5 = (p000.wo1) r5
            float r0 = r4.f11788
            float r1 = r5.f11788
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L15
            goto L61
        L15:
            float r0 = r4.f11789
            float r1 = r5.f11789
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L20
            goto L61
        L20:
            float r0 = r4.f11790
            float r1 = r5.f11790
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L2b
            goto L61
        L2b:
            float r0 = r4.f11791
            float r1 = r5.f11791
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L36
            goto L61
        L36:
            long r0 = r4.f11792
            long r2 = r5.f11792
            boolean r0 = p000.h62.m2367(r0, r2)
            if (r0 != 0) goto L41
            goto L61
        L41:
            long r0 = r4.f11793
            long r2 = r5.f11793
            boolean r0 = p000.h62.m2367(r0, r2)
            if (r0 != 0) goto L4c
            goto L61
        L4c:
            long r0 = r4.f11794
            long r2 = r5.f11794
            boolean r0 = p000.h62.m2367(r0, r2)
            if (r0 != 0) goto L57
            goto L61
        L57:
            long r0 = r4.f11795
            long r4 = r5.f11795
            boolean r4 = p000.h62.m2367(r0, r4)
            if (r4 != 0) goto L63
        L61:
            r4 = 0
            return r4
        L63:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            float r0 = r4.f11788
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r4.f11789
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r4.f11790
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r4.f11791
            int r0 = p000.lz1.m3676(r2, r0, r1)
            long r2 = r4.f11792
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r4.f11793
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r4.f11794
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r1 = r4.f11795
            int r4 = java.lang.Long.hashCode(r1)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r12.f11788
            java.lang.String r1 = p000.kn0.m3356(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r2 = r12.f11789
            java.lang.String r2 = p000.kn0.m3356(r2)
            r0.append(r2)
            r0.append(r1)
            float r2 = r12.f11790
            java.lang.String r2 = p000.kn0.m3356(r2)
            r0.append(r2)
            r0.append(r1)
            float r1 = r12.f11791
            java.lang.String r1 = p000.kn0.m3356(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            long r1 = r12.f11792
            long r3 = r12.f11793
            boolean r5 = p000.h62.m2367(r1, r3)
            r6 = 41
            java.lang.String r7 = "RoundRect(rect="
            long r8 = r12.f11794
            long r10 = r12.f11795
            if (r5 == 0) goto Lbe
            boolean r12 = p000.h62.m2367(r3, r8)
            if (r12 == 0) goto Lbe
            boolean r12 = p000.h62.m2367(r8, r10)
            if (r12 == 0) goto Lbe
            r12 = 32
            long r3 = r1 >> r12
            int r12 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r12)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r4
            int r1 = (int) r1
            float r2 = java.lang.Float.intBitsToFloat(r1)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r0)
            java.lang.String r0 = ", radius="
            r1.append(r0)
            float r12 = java.lang.Float.intBitsToFloat(r12)
            java.lang.String r12 = p000.kn0.m3356(r12)
            r1.append(r12)
            r1.append(r6)
            java.lang.String r12 = r1.toString()
            return r12
        L8e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r7)
            r2.append(r0)
            java.lang.String r0 = ", x="
            r2.append(r0)
            float r12 = java.lang.Float.intBitsToFloat(r12)
            java.lang.String r12 = p000.kn0.m3356(r12)
            r2.append(r12)
            java.lang.String r12 = ", y="
            r2.append(r12)
            float r12 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r12 = p000.kn0.m3356(r12)
            r2.append(r12)
            r2.append(r6)
            java.lang.String r12 = r2.toString()
            return r12
        Lbe:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r7)
            r12.append(r0)
            java.lang.String r0 = ", topLeft="
            r12.append(r0)
            java.lang.String r0 = p000.h62.m2420(r1)
            r12.append(r0)
            java.lang.String r0 = ", topRight="
            r12.append(r0)
            java.lang.String r0 = p000.h62.m2420(r3)
            r12.append(r0)
            java.lang.String r0 = ", bottomRight="
            r12.append(r0)
            java.lang.String r0 = p000.h62.m2420(r8)
            r12.append(r0)
            java.lang.String r0 = ", bottomLeft="
            r12.append(r0)
            java.lang.String r0 = p000.h62.m2420(r10)
            r12.append(r0)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            return r12
    }

    /* JADX INFO: renamed from: α */
    public final float m6399() {
            r1 = this;
            float r0 = r1.f11791
            float r1 = r1.f11789
            float r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: β */
    public final float m6400() {
            r1 = this;
            float r0 = r1.f11790
            float r1 = r1.f11788
            float r0 = r0 - r1
            return r0
    }
}
