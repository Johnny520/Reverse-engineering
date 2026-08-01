package defpackage;

/* JADX INFO: renamed from: ᛳᛳᛱᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0435 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public /* synthetic */ java.lang.Object[] f2133;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public /* synthetic */ long[] f2134;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public /* synthetic */ boolean f2135;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public /* synthetic */ int f2136;

    public C0435() {
            r3 = this;
            r3.<init>()
            r0 = 4
        L4:
            r1 = 32
            r2 = 80
            if (r0 >= r1) goto L15
            r1 = 1
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            if (r2 > r1) goto L12
            r2 = r1
            goto L15
        L12:
            int r0 = r0 + 1
            goto L4
        L15:
            int r2 = r2 / 8
            long[] r0 = new long[r2]
            r3.f2134 = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r3.f2133 = r0
            return
    }

    public final java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            ᛳᛳᛱᛶ r0 = (defpackage.C0435) r0
            long[] r1 = r2.f2134
            java.lang.Object r1 = r1.clone()
            long[] r1 = (long[]) r1
            r0.f2134 = r1
            java.lang.Object[] r2 = r2.f2133
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0.f2133 = r2
            return r0
    }

    public final java.lang.String toString() {
            r13 = this;
            int r0 = r13.m1215()
            if (r0 > 0) goto L9
            java.lang.String r13 = "{}"
            return r13
        L9:
            int r0 = r13.f2136
            int r0 = r0 * 28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r13.f2136
            r2 = 0
            r3 = r2
        L1b:
            if (r3 >= r0) goto L80
            if (r3 <= 0) goto L24
            java.lang.String r4 = ", "
            r1.append(r4)
        L24:
            r4 = 0
            if (r3 < 0) goto L6e
            int r5 = r13.f2136
            if (r3 >= r5) goto L6e
            boolean r6 = r13.f2135
            if (r6 == 0) goto L50
            long[] r6 = r13.f2134
            java.lang.Object[] r7 = r13.f2133
            r8 = r2
            r9 = r8
        L35:
            if (r8 >= r5) goto L4c
            r10 = r7[r8]
            java.lang.Object r11 = defpackage.AbstractC0498.f2478
            if (r10 == r11) goto L49
            if (r8 == r9) goto L47
            r11 = r6[r8]
            r6[r9] = r11
            r7[r9] = r10
            r7[r8] = r4
        L47:
            int r9 = r9 + 1
        L49:
            int r8 = r8 + 1
            goto L35
        L4c:
            r13.f2135 = r2
            r13.f2136 = r9
        L50:
            long[] r4 = r13.f2134
            r4 = r4[r3]
            r1.append(r4)
            r4 = 61
            r1.append(r4)
            java.lang.Object r4 = r13.m1214(r3)
            if (r4 == r1) goto L66
            r1.append(r4)
            goto L6b
        L66:
            java.lang.String r4 = "(this Map)"
            r1.append(r4)
        L6b:
            int r3 = r3 + 1
            goto L1b
        L6e:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected index to be within 0..size()-1, but was "
            r13.<init>(r0)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
            defpackage.AbstractC2279.m3697(r13)
            throw r4
        L80:
            r13 = 125(0x7d, float:1.75E-43)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            return r13
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object m1214(int r11) {
            r10 = this;
            r0 = 0
            if (r11 < 0) goto L32
            int r1 = r10.f2136
            if (r11 >= r1) goto L32
            boolean r2 = r10.f2135
            if (r2 == 0) goto L2d
            long[] r2 = r10.f2134
            java.lang.Object[] r3 = r10.f2133
            r4 = 0
            r5 = r4
            r6 = r5
        L12:
            if (r5 >= r1) goto L29
            r7 = r3[r5]
            java.lang.Object r8 = defpackage.AbstractC0498.f2478
            if (r7 == r8) goto L26
            if (r5 == r6) goto L24
            r8 = r2[r5]
            r2[r6] = r8
            r3[r6] = r7
            r3[r5] = r0
        L24:
            int r6 = r6 + 1
        L26:
            int r5 = r5 + 1
            goto L12
        L29:
            r10.f2135 = r4
            r10.f2136 = r6
        L2d:
            java.lang.Object[] r10 = r10.f2133
            r10 = r10[r11]
            return r10
        L32:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected index to be within 0..size()-1, but was "
            r10.<init>(r1)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            defpackage.AbstractC2279.m3697(r10)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int m1215() {
            r9 = this;
            boolean r0 = r9.f2135
            if (r0 == 0) goto L29
            int r0 = r9.f2136
            long[] r1 = r9.f2134
            java.lang.Object[] r2 = r9.f2133
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r0) goto L25
            r6 = r2[r4]
            java.lang.Object r7 = defpackage.AbstractC0498.f2478
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
            r9.f2135 = r3
            r9.f2136 = r5
        L29:
            int r9 = r9.f2136
            return r9
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m1216(long r11, java.lang.Object r13) {
            r10 = this;
            java.lang.Object r0 = defpackage.AbstractC0498.f2478
            long[] r1 = r10.f2134
            int r2 = r10.f2136
            int r1 = defpackage.AbstractC1628.m2956(r1, r2, r11)
            if (r1 < 0) goto L11
            java.lang.Object[] r10 = r10.f2133
            r10[r1] = r13
            return
        L11:
            int r1 = ~r1
            int r2 = r10.f2136
            if (r1 >= r2) goto L23
            java.lang.Object[] r3 = r10.f2133
            r4 = r3[r1]
            if (r4 != r0) goto L23
            long[] r10 = r10.f2134
            r10[r1] = r11
            r3[r1] = r13
            return
        L23:
            boolean r3 = r10.f2135
            if (r3 == 0) goto L52
            long[] r3 = r10.f2134
            int r4 = r3.length
            if (r2 < r4) goto L52
            java.lang.Object[] r1 = r10.f2133
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
            r10.f2135 = r4
            r10.f2136 = r6
            long[] r0 = r10.f2134
            int r0 = defpackage.AbstractC1628.m2956(r0, r6, r11)
            int r1 = ~r0
        L52:
            int r0 = r10.f2136
            long[] r2 = r10.f2134
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
            long[] r2 = r10.f2134
            long[] r2 = java.util.Arrays.copyOf(r2, r0)
            r10.f2134 = r2
            java.lang.Object[] r2 = r10.f2133
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            r10.f2133 = r0
        L7f:
            int r0 = r10.f2136
            int r0 = r0 - r1
            if (r0 == 0) goto L92
            long[] r2 = r10.f2134
            int r4 = r1 + 1
            java.lang.System.arraycopy(r2, r1, r2, r4, r0)
            java.lang.Object[] r0 = r10.f2133
            int r2 = r10.f2136
            defpackage.AbstractC2315.m3766(r4, r1, r2, r0, r0)
        L92:
            long[] r0 = r10.f2134
            r0[r1] = r11
            java.lang.Object[] r11 = r10.f2133
            r11[r1] = r13
            int r11 = r10.f2136
            int r11 = r11 + r3
            r10.f2136 = r11
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1217() {
            r5 = this;
            int r0 = r5.f2136
            java.lang.Object[] r1 = r5.f2133
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r0) goto Le
            r4 = 0
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            r5.f2136 = r2
            r5.f2135 = r2
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object m1218(long r3) {
            r2 = this;
            long[] r0 = r2.f2134
            int r1 = r2.f2136
            int r3 = defpackage.AbstractC1628.m2956(r0, r1, r3)
            if (r3 < 0) goto L14
            java.lang.Object[] r2 = r2.f2133
            r2 = r2[r3]
            java.lang.Object r3 = defpackage.AbstractC0498.f2478
            if (r2 != r3) goto L13
            goto L14
        L13:
            return r2
        L14:
            r2 = 0
            return r2
    }
}
