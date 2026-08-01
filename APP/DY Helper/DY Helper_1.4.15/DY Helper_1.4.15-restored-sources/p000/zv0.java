package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zv0 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: ε */
    public /* synthetic */ boolean f13315;

    /* JADX INFO: renamed from: ζ */
    public /* synthetic */ long[] f13316;

    /* JADX INFO: renamed from: η */
    public /* synthetic */ java.lang.Object[] f13317;

    /* JADX INFO: renamed from: θ */
    public /* synthetic */ int f13318;

    public zv0(int r3) {
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto Le
            long[] r3 = p000.AbstractC1021yh.f12617
            r2.f13316 = r3
            java.lang.Object[] r3 = p000.AbstractC1021yh.f12618
            r2.f13317 = r3
            return
        Le:
            int r3 = r3 * 8
            r0 = 4
        L11:
            r1 = 32
            if (r0 >= r1) goto L20
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r3 > r1) goto L1d
            r3 = r1
            goto L20
        L1d:
            int r0 = r0 + 1
            goto L11
        L20:
            int r3 = r3 / 8
            long[] r0 = new long[r3]
            r2.f13316 = r0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.f13317 = r3
            return
    }

    public /* synthetic */ zv0(java.lang.Object r1) {
            r0 = this;
            r1 = 10
            r0.<init>(r1)
            return
    }

    public final java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            r0.getClass()
            zv0 r0 = (p000.zv0) r0
            long[] r1 = r2.f13316
            java.lang.Object r1 = r1.clone()
            long[] r1 = (long[]) r1
            r0.f13316 = r1
            java.lang.Object[] r2 = r2.f13317
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0.f13317 = r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.m7238()
            if (r0 > 0) goto L9
            java.lang.String r5 = "{}"
            return r5
        L9:
            int r0 = r5.f13318
            int r0 = r0 * 28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r5.f13318
            r2 = 0
        L1a:
            if (r2 >= r0) goto L41
            if (r2 <= 0) goto L23
            java.lang.String r3 = ", "
            r1.append(r3)
        L23:
            long r3 = r5.m7235(r2)
            r1.append(r3)
            r3 = 61
            r1.append(r3)
            java.lang.Object r3 = r5.m7239(r2)
            if (r3 == r1) goto L39
            r1.append(r3)
            goto L3e
        L39:
            java.lang.String r3 = "(this Map)"
            r1.append(r3)
        L3e:
            int r2 = r2 + 1
            goto L1a
        L41:
            r5 = 125(0x7d, float:1.75E-43)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final void m7233() {
            r5 = this;
            int r0 = r5.f13318
            java.lang.Object[] r1 = r5.f13317
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r0) goto Le
            r4 = 0
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            r5.f13318 = r2
            r5.f13315 = r2
            return
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.Object m7234(long r3) {
            r2 = this;
            long[] r0 = r2.f13316
            int r1 = r2.f13318
            int r3 = p000.AbstractC1021yh.m6881(r0, r1, r3)
            if (r3 < 0) goto L14
            java.lang.Object[] r2 = r2.f13317
            r2 = r2[r3]
            java.lang.Object r3 = p000.h62.f4591
            if (r2 != r3) goto L13
            goto L14
        L13:
            return r2
        L14:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public final long m7235(int r10) {
            r9 = this;
            if (r10 < 0) goto L32
            int r0 = r9.f13318
            if (r10 >= r0) goto L32
            boolean r1 = r9.f13315
            if (r1 == 0) goto L2d
            long[] r1 = r9.f13316
            java.lang.Object[] r2 = r9.f13317
            r3 = 0
            r4 = r3
            r5 = r4
        L11:
            if (r4 >= r0) goto L29
            r6 = r2[r4]
            java.lang.Object r7 = p000.h62.f4591
            if (r6 == r7) goto L26
            if (r4 == r5) goto L24
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L24:
            int r5 = r5 + 1
        L26:
            int r4 = r4 + 1
            goto L11
        L29:
            r9.f13315 = r3
            r9.f13318 = r5
        L2d:
            long[] r9 = r9.f13316
            r9 = r9[r10]
            return r9
        L32:
            java.lang.String r9 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r9 = p000.a12.m17(r9, r10)
            p000.C1080.m7275(r9)
            r9 = 0
            return r9
    }

    /* JADX INFO: renamed from: δ */
    public final void m7236(long r11, java.lang.Object r13) {
            r10 = this;
            java.lang.Object r0 = p000.h62.f4591
            long[] r1 = r10.f13316
            int r2 = r10.f13318
            int r1 = p000.AbstractC1021yh.m6881(r1, r2, r11)
            if (r1 < 0) goto L11
            java.lang.Object[] r10 = r10.f13317
            r10[r1] = r13
            return
        L11:
            int r1 = ~r1
            int r2 = r10.f13318
            if (r1 >= r2) goto L23
            java.lang.Object[] r3 = r10.f13317
            r4 = r3[r1]
            if (r4 != r0) goto L23
            long[] r10 = r10.f13316
            r10[r1] = r11
            r3[r1] = r13
            return
        L23:
            boolean r3 = r10.f13315
            if (r3 == 0) goto L52
            long[] r3 = r10.f13316
            int r4 = r3.length
            if (r2 < r4) goto L52
            java.lang.Object[] r1 = r10.f13317
            r4 = 0
            r5 = r4
            r6 = r5
        L31:
            if (r5 >= r2) goto L47
            r7 = r1[r5]
            if (r7 == r0) goto L44
            if (r5 == r6) goto L42
            r8 = r3[r5]
            r3[r6] = r8
            r1[r6] = r7
            r7 = 0
            r1[r5] = r7
        L42:
            int r6 = r6 + 1
        L44:
            int r5 = r5 + 1
            goto L31
        L47:
            r10.f13315 = r4
            r10.f13318 = r6
            long[] r0 = r10.f13316
            int r0 = p000.AbstractC1021yh.m6881(r0, r6, r11)
            int r1 = ~r0
        L52:
            int r0 = r10.f13318
            long[] r2 = r10.f13316
            int r2 = r2.length
            r3 = 1
            if (r0 < r2) goto L7f
            int r0 = r0 + r3
            int r0 = r0 * 8
            r2 = 4
        L5e:
            r4 = 32
            if (r2 >= r4) goto L6d
            int r4 = r3 << r2
            int r4 = r4 + (-12)
            if (r0 > r4) goto L6a
            r0 = r4
            goto L6d
        L6a:
            int r2 = r2 + 1
            goto L5e
        L6d:
            int r0 = r0 / 8
            long[] r2 = r10.f13316
            long[] r2 = java.util.Arrays.copyOf(r2, r0)
            r10.f13316 = r2
            java.lang.Object[] r2 = r10.f13317
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            r10.f13317 = r0
        L7f:
            int r0 = r10.f13318
            int r2 = r0 - r1
            if (r2 == 0) goto L93
            long[] r2 = r10.f13316
            int r4 = r1 + 1
            p000.AbstractC0312g7.m2237(r2, r2, r4, r1, r0)
            java.lang.Object[] r0 = r10.f13317
            int r2 = r10.f13318
            p000.AbstractC0312g7.m2238(r0, r0, r4, r1, r2)
        L93:
            long[] r0 = r10.f13316
            r0[r1] = r11
            java.lang.Object[] r11 = r10.f13317
            r11[r1] = r13
            int r11 = r10.f13318
            int r11 = r11 + r3
            r10.f13318 = r11
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m7237(long r3) {
            r2 = this;
            long[] r0 = r2.f13316
            int r1 = r2.f13318
            int r3 = p000.AbstractC1021yh.m6881(r0, r1, r3)
            if (r3 < 0) goto L17
            java.lang.Object[] r4 = r2.f13317
            r0 = r4[r3]
            java.lang.Object r1 = p000.h62.f4591
            if (r0 == r1) goto L17
            r4[r3] = r1
            r3 = 1
            r2.f13315 = r3
        L17:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final int m7238() {
            r9 = this;
            boolean r0 = r9.f13315
            if (r0 == 0) goto L29
            int r0 = r9.f13318
            long[] r1 = r9.f13316
            java.lang.Object[] r2 = r9.f13317
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r0) goto L25
            r6 = r2[r4]
            java.lang.Object r7 = p000.h62.f4591
            if (r6 == r7) goto L22
            if (r4 == r5) goto L20
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L20:
            int r5 = r5 + 1
        L22:
            int r4 = r4 + 1
            goto Ld
        L25:
            r9.f13315 = r3
            r9.f13318 = r5
        L29:
            int r9 = r9.f13318
            return r9
    }

    /* JADX INFO: renamed from: η */
    public final java.lang.Object m7239(int r10) {
            r9 = this;
            if (r10 < 0) goto L32
            int r0 = r9.f13318
            if (r10 >= r0) goto L32
            boolean r1 = r9.f13315
            if (r1 == 0) goto L2d
            long[] r1 = r9.f13316
            java.lang.Object[] r2 = r9.f13317
            r3 = 0
            r4 = r3
            r5 = r4
        L11:
            if (r4 >= r0) goto L29
            r6 = r2[r4]
            java.lang.Object r7 = p000.h62.f4591
            if (r6 == r7) goto L26
            if (r4 == r5) goto L24
            r7 = r1[r4]
            r1[r5] = r7
            r2[r5] = r6
            r6 = 0
            r2[r4] = r6
        L24:
            int r5 = r5 + 1
        L26:
            int r4 = r4 + 1
            goto L11
        L29:
            r9.f13315 = r3
            r9.f13318 = r5
        L2d:
            java.lang.Object[] r9 = r9.f13317
            r9 = r9[r10]
            return r9
        L32:
            java.lang.String r9 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r9 = p000.a12.m17(r9, r10)
            p000.C1080.m7275(r9)
            r9 = 0
            return r9
    }
}
